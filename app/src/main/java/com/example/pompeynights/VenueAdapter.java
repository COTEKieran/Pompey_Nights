package com.example.pompeynights;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.view.menu.ListMenuItemView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;

public class VenueAdapter extends BaseAdapter implements Filterable {
    public Context context;
    public ArrayList<Venue> venueArrayList;
    public ArrayList<Venue> orig;

    public VenueAdapter(Context context, ArrayList<Venue> employeeArrayList) {
        super();
        this.context = context;
        this.venueArrayList = employeeArrayList;
    }


    public class VenueHolder
    {
        TextView venueName;
        TextView venueAddress;
        ImageView venueImage;
        ImageView typeIcon;
        ImageView typeIcon2;
        ImageView typeIcon3;
    }

    public Filter getFilter() {
        return new Filter() {

            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                final FilterResults oReturn = new FilterResults();
                final ArrayList<Venue> results = new ArrayList<Venue>();
                if (orig == null)
                    orig = venueArrayList;
                if (constraint != null) {
                    if (orig != null && orig.size() > 0) {
                        for (final Venue g : orig) {
                            if (g.getVenueName().toLowerCase()
                                    .contains(constraint.toString()))
                                results.add(g);
                        }
                    }
                    oReturn.values = results;
                }
                return oReturn;
            }

            @SuppressWarnings("unchecked")
            @Override
            protected void publishResults(CharSequence constraint,
                                          FilterResults results) {
                venueArrayList = (ArrayList<Venue>) results.values;
                notifyDataSetChanged();
            }
        };
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        return venueArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return venueArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        VenueHolder holder;
        if(convertView==null)
        {
            convertView=LayoutInflater.from(context).inflate(R.layout.row, parent, false);
            holder=new VenueHolder();
            holder.venueName=(TextView) convertView.findViewById(R.id.venueName);
            holder.venueAddress=(TextView) convertView.findViewById(R.id.venueAddress);
            holder.venueImage=(ImageView) convertView.findViewById(R.id.venueImageView);
            holder.typeIcon=(ImageView) convertView.findViewById(R.id.iconView1);
            holder.typeIcon2=(ImageView) convertView.findViewById(R.id.iconView2);
            holder.typeIcon3=(ImageView) convertView.findViewById(R.id.iconView3);
            convertView.setTag(holder);
        }
        else
        {
            holder=(VenueHolder) convertView.getTag();
        }

        holder.venueName.setText(venueArrayList.get(position).getVenueName());
        holder.venueAddress.setText(String.valueOf(venueArrayList.get(position).getVenueAddress()));
        holder.venueImage.setImageResource((venueArrayList.get(position).getVenueImage()));
        holder.typeIcon.setImageResource((venueArrayList.get(position).getTypeIcon1()));
        holder.typeIcon2.setImageResource((venueArrayList.get(position).getTypeIcon2()));
        holder.typeIcon3.setImageResource((venueArrayList.get(position).getTypeIcon3()));

        return convertView;

    }

}
