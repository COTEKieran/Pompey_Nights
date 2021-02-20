package com.example.pompeynights;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Homepage extends AppCompatActivity {
    ListView listView;
    String venueTitle[] = {"The Fawcett Inn", "The Fat Fox", "PRYZM Portsmouth", "The Astoria", "The Dockyard", "Meat and Barrel", "O'Neills", "Bonita's","Brewhouse and Kitchen", "The Southsea Villiage", "Mr Miyagis","Scarlet Tap","Lord John Russell","The Fleet/Popworld","The One Eyed Dog"};
    String venueAddress[]= {"176 Fawcett Rd, Southsea PO40DP","11-13 Victoria Rd S. Southsea PO62SP","Connaught Drill Hall, Stanhope Road PO11DU","37-39 Guildhall Walk Portsmouth PO12RY", "19 Guildhall Walk Portsmouth PO12RY","110-114 Palmerston Rd Southsea PO53PT", "Albert Rd Southsea Portsmouth PO52SX", "106 Palmerston Rd Southsea Portsmouth PO53PT", "26 Guildhall Walk Portsmouth PO12DD","81 Palmerston Rd Southsea Portsmouth PO53PP", "29-33 Guildhall Walk Portsmouth PO12RY","80-82 Palmerston Rd, Southsea", "12 Albert Rd Southsea PO52SH","1 King Henry I St Portsmouth PO12PT","177-185 Elm Grove Southsea Portsmouth PO51LU"};
    int venueImages[] = {R.drawable.fawcettinn,R.drawable.fatfox,R.drawable.pryzm,R.drawable.astoria1, R.drawable.dockyard,R.drawable.meatandbarrel,R.drawable.oneils,R.drawable.bonitas,R.drawable.brewhouse,R.drawable.southseavilliage,R.drawable.miyagis,R.drawable.scarlettap,R.drawable.lordjohnrussell,R.drawable.fleet,R.drawable.oneeyeddog};
    int typeIcon[] = {R.drawable.beericon,R.drawable.beericon, R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.cutleryicon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon};
    int typeIcon2[] = {R.drawable.cutleryicon,R.drawable.cutleryicon,R.drawable.musicicon,R.drawable.musicicon, R.drawable.cutleryicon,' ',R.drawable.cutleryicon,R.drawable.cutleryicon,R.drawable.cutleryicon,R.drawable.cutleryicon,R.drawable.musicicon,R.drawable.cutleryicon,' ',R.drawable.cutleryicon,R.drawable.musicicon};
    int typeIcon3[] = {' ',R.drawable.musicicon,' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',R.drawable.musicicon,' '};
    int venueRating[] = {R.drawable.fourstars,R.drawable.threestars,R.drawable.fivestars,R.drawable.fourstars, R.drawable.fourstars, R.drawable.fivestars,R.drawable.fourstars,R.drawable.fourstars,R.drawable.fourstars,R.drawable.fourstars,R.drawable.fourstars,R.drawable.fourstars,R.drawable.fourstars,R.drawable.fourstars,R.drawable.fourstars};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);


        listView = findViewById(R.id.listView);

        ImageView detailedImage = (ImageView) findViewById(R.id.detailedViewIcon);

        detailedImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToDetailed = new Intent(v.getContext(), Detailed_View.class);
                startActivity(goToDetailed);
            }
        });

        ImageView mapImage = (ImageView) findViewById(R.id.mapViewIcon);

        mapImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToMap = new Intent(v.getContext(), Map.class);
                startActivity(goToMap);
            }
        });





        MyAdapter adapter = new MyAdapter(this,venueTitle,venueAddress, venueImages, typeIcon, typeIcon2, typeIcon3, venueRating);
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View row = layoutInflater.inflate(R.layout.row,parent,false);



                if (position == 0) {
                    Intent intent0 = new Intent(view.getContext(), Fawcett_Inn.class);
                    startActivity(intent0);
                }
                if (position == 1) {
                    Intent intent1 = new Intent(view.getContext(), Fat_Fox.class);
                    startActivity(intent1);
                }
                if (position == 2) {
                    Intent intent2 = new Intent(view.getContext(), PRYZM_Portsmouth.class);
                    startActivity(intent2);
                }
                if (position == 3) {
                    Intent intent3 = new Intent(view.getContext(), The_Astoria.class);
                    startActivity(intent3);
                }
                if (position == 4) {
                    Intent intent4 = new Intent(view.getContext(), The_Dockyard.class);
                    startActivity(intent4);
                }
                if (position == 5) {
                    Intent intent5 = new Intent(view.getContext(), Meat_And_Barrel.class);
                    startActivity(intent5);
                }
                if (position == 6) {
                    Intent intent6 = new Intent(view.getContext(), ONeills.class);
                    startActivity(intent6);
                }
                if (position == 7) {
                    Intent intent7 = new Intent(view.getContext(), Bonitas.class);
                    startActivity(intent7);
                }
                if (position == 8) {
                    Intent intent8 = new Intent(view.getContext(), Brewhouse_And_Kitchen.class);
                    startActivity(intent8);
                }
                if (position == 9) {
                    Intent intent9 = new Intent(view.getContext(), Southsea_Villiage.class);
                    startActivity(intent9);
                }
                if (position == 10) {
                    Intent intent10 = new Intent(view.getContext(), Mr_Miyagis.class);
                    startActivity(intent10);
                }
                if (position == 11) {
                    Intent intent11 = new Intent(view.getContext(), Scarlet_Tap.class);
                    startActivity(intent11);
                }
                if (position == 12) {
                    Intent intent12 = new Intent(view.getContext(), Lord_John_Russell.class);
                    startActivity(intent12);
                }
                if (position == 13) {
                    Intent intent13 = new Intent(view.getContext(), Fleet_and_Popworld.class);
                    startActivity(intent13);
                }
                if (position == 14) {
                    Intent intent14 = new Intent(view.getContext(), One_Eyed_Dog.class);
                    startActivity(intent14);
                }
            }});
    }

    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String vTitle[];
        String vAddress[];
        int vImg[];
        int tIcon[];
        int tIcon2[];
        int tIcon3[];
        int vRating[];

        MyAdapter(Context c, String[] vTitle, String[] vAddress, int[] vImg, int[] tIcon, int[] tIcon2, int[] tIcon3, int[] vRating){
            super(c, R.layout.row,R.id.venueName, venueTitle);
            this.context = c;
            this.vTitle = venueTitle;
            this.vAddress = venueAddress;
            this.vImg = venueImages;
            this.tIcon = typeIcon;
            this.tIcon2 = typeIcon2;
            this.tIcon3 = typeIcon3;
            this.vRating = venueRating;
        }



        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row,parent,false);
            ImageView images = row.findViewById(R.id.venueImageView);
            ImageView icons = row.findViewById(R.id.iconView1);
            ImageView icons2 = row.findViewById(R.id.iconView2);
            ImageView icons3 = row.findViewById(R.id.iconView3);
            ImageView ratings = row.findViewById(R.id.ratingView);
            TextView title = row.findViewById(R.id.venueName);
            TextView address = row.findViewById(R.id.venueAddress);
            images.setImageResource(vImg[position]);
            icons.setImageResource(tIcon[position]);
            icons2.setImageResource(tIcon2[position]);
            icons3.setImageResource(tIcon3[position]);
            ratings.setImageResource(vRating[position]);
            title.setText(vTitle[position]);
            address.setText(vAddress[position]);
            return row;
        }

    }
}

