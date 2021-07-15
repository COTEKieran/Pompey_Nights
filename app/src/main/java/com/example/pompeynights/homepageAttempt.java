package com.example.pompeynights;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import java.util.ArrayList;

/*public class homepageAttempt extends Activity implements SearchView.OnQueryTextListener {
    private SearchView mSearchView;
    private ListView mListView;
    private ArrayList<Venue> venueArrayList;
    private VenueAdapter venueAdapter;
    Venue venue;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        mSearchView=(SearchView) findViewById(R.id.searchView1);
        mListView=(ListView) findViewById(R.id.listView);

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



        venueArrayList=new ArrayList<Venue>();
        venueArrayList.add(new Venue("The Fawcett Inn", "176 Fawcett Rd, Southsea, PO40DP", R.drawable.fawcettinn, R.drawable.beericon, R.drawable.cutleryicon, ' ', R.drawable.fourstars));
        venueArrayList.add(new Venue("The Fat Fox", "11-13 Victoria Rd S. Southsea PO62SP", R.drawable.fatfox, R.drawable.beericon, R.drawable.cutleryicon, R.drawable.musicicon, R.drawable.threestars));
        venueArrayList.add(new Venue("PRYZM Portsmouth", "Connaught Drill Hall, Stanhope Road, PO11DU", R.drawable.pryzm, R.drawable.beericon, R.drawable.musicicon, ' ', R.drawable.fivestars));
        venueArrayList.add(new Venue("The Astoria", "37-39 Guildhall Walk, Portsmouth PO1 2RY", R.drawable.astoria1, R.drawable.beericon, R.drawable.musicicon, ' ', R.drawable.fourstars));




       mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    if(position == 0) {
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
                }

            });


        venueAdapter=new VenueAdapter(homepageAttempt.this, venueArrayList);
        mListView.setAdapter(venueAdapter);

        mListView.setTextFilterEnabled(true);
        setupSearchView();


    }



    private void setupSearchView()
    {
        mSearchView.setIconifiedByDefault(false);
        mSearchView.setOnQueryTextListener(this);
        mSearchView.setSubmitButtonEnabled(true);
        mSearchView.setQueryHint("Search Here");
    }

    @Override
    public boolean onQueryTextChange(String newText)
    {

        if (TextUtils.isEmpty(newText)) {
            mListView.clearTextFilter();
        } else {
            mListView.setFilterText(newText);
        }
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query)
    {
        return false;
    }


}

*/
