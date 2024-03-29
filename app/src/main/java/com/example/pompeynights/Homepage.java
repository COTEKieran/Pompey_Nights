package com.example.pompeynights;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import org.w3c.dom.Text;


public class Homepage extends AppCompatActivity {

    //Variables for venue array
    SharedPreferences wmbPreference1;
    SharedPreferences.Editor editor;
    ListView listView;
    String venueTitle[] = {"Astoria", "Bonita's ","Brewhouse and Kitchen", "Dockyard", "Fat Fox", "Fawcett Inn", "Fleet/Popworld", "Lord John Russell", "Meat and Barrel", "Mr Miyagis", "O'Neills", "One Eyed Dog", "PRYZM Portsmouth", "Scarlet Tap", "Southsea Villiage", };
    String venueAddress[]= {"37-39 Guildhall Walk, Portsmouth PO1 2RY","106 Palmerston Rd, Southsea, Portsmouth PO5 3PT" , "26 Guildhall Walk, Portsmouth PO1 2DD", "19 Guildhall Walk, Portsmouth PO1 2RY" , "11-13 Victoria Rd S. Southsea PO62SP" , "176 Fawcett Rd, Southsea, PO40DP" , "1 King Henry I St, Portsmouth PO1 2PT", "12 Albert Rd, Southsea, Portsmouth PO5 2SH", "110-114 Palmerston Rd, Southsea PO5 3PT" , "29-33 Guildhall Walk, Portsmouth PO1 2RY" , "Albert Rd, Southsea Portsmouth, PO5 2SX" , "177-185 Elm Grove, Southsea, Portsmouth O5 1LU", "Connaught Drill Hall, Stanhope Road, PO11DU" , "80-82 Palmerston Rd, Southsea, Portsmouth PO5 3PT", "81 Palmerston Rd, Southsea, Portsmouth PO5 3PP"};
    int venueImages[] = {R.drawable.astoria1,R.drawable.bonitas,R.drawable.brewhouse,R.drawable.dockyard,R.drawable.fatfox,R.drawable.fawcettinn,R.drawable.fleet,R.drawable.lordjohnrussell,R.drawable.meatandbarrel,R.drawable.miyagis,R.drawable.oneils,R.drawable.oneeyeddog,R.drawable.pryzm,R.drawable.scarlettap,R.drawable.southseavilliage};
    int typeIcon[] = {R.drawable.beericon,R.drawable.beericon, R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon};
    int typeIcon2[] = {R.drawable.musicicon,R.drawable.cutleryicon,R.drawable.cutleryicon,R.drawable.cutleryicon, R.drawable.cutleryicon,R.drawable.cutleryicon,R.drawable.cutleryicon,R.drawable.cutleryicon,R.drawable.cutleryicon,R.drawable.musicicon,R.drawable.cutleryicon,R.drawable.cutleryicon,R.drawable.musicicon,R.drawable.cutleryicon,R.drawable.cutleryicon};
    int typeIcon3[] = {' ',' ',' ',R.drawable.musicicon,R.drawable.musicicon,' ',R.drawable.musicicon,' ',' ',' ',' ',' ',' ',' ',' '};
    ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.DarkTheme);
        }
        else setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        //Directs user to help page
        ImageView help = findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHelp = new Intent(v.getContext(), Help.class);
                startActivity(goToHelp);
            }
        });

        //Directs user to settings page
        ImageView settings = findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSettings = new Intent(v.getContext(), Settings.class);
                startActivity(goToSettings);
            }
        });

        //Restarts app
        ImageView title = findViewById(R.id.toolbar_title);
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToMain = new Intent(v.getContext(), MainActivity.class);
                startActivity(goToMain);
            }
        });

        //Directs user to detailed view
        ImageView detailedImage = (ImageView) findViewById(R.id.detailedViewIcon);
        detailedImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToDetailed = new Intent(v.getContext(), Detailed_View.class);
                startActivity(goToDetailed);
            }
        });

        //Directs user to map view
        ImageView mapImage = (ImageView) findViewById(R.id.mapViewIcon);
        mapImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToMap = new Intent(v.getContext(), Map.class);
                startActivity(goToMap);
            }
        });

        //Sets adapter class to listview
        listView = findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(this,venueTitle,venueAddress, venueImages, typeIcon, typeIcon2, typeIcon3);
        listView.setAdapter(adapter);

        //On click listener takes the position of the venue in the array and sends the user to the correct page
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View row = layoutInflater.inflate(R.layout.row,parent,false);

                if (position == 0) {
                    Intent intent0 = new Intent(view.getContext(), The_Astoria.class);
                    startActivity(intent0);
                }
                if (position == 1) {
                    Intent intent1 = new Intent(view.getContext(), Bonitas.class);
                    startActivity(intent1);
                }
                if (position == 2) {
                    Intent intent2 = new Intent(view.getContext(), Brewhouse_And_Kitchen.class);
                    startActivity(intent2);
                }
                if (position == 3) {
                    Intent intent3 = new Intent(view.getContext(), The_Dockyard.class);
                    startActivity(intent3);
                }
                if (position == 4) {
                    Intent intent4 = new Intent(view.getContext(), Fat_Fox.class);
                    startActivity(intent4);
                }
                if (position == 5) {
                    Intent intent5 = new Intent(view.getContext(), Fawcett_Inn.class);
                    startActivity(intent5);
                }
                if (position == 6) {
                    Intent intent6 = new Intent(view.getContext(), Fleet_and_Popworld.class);
                    startActivity(intent6);
                }
                if (position == 7) {
                    Intent intent7 = new Intent(view.getContext(), Lord_John_Russell.class);
                    startActivity(intent7);
                }
                if (position == 8) {
                    Intent intent8 = new Intent(view.getContext(), Meat_And_Barrel.class);
                    startActivity(intent8);
                }
                if (position == 9) {
                    Intent intent9 = new Intent(view.getContext(), Mr_Miyagis.class);
                    startActivity(intent9);
                }
                if (position == 10) {
                    Intent intent10 = new Intent(view.getContext(), ONeills.class);
                    startActivity(intent10);
                }
                if (position == 11) {
                    Intent intent11 = new Intent(view.getContext(), One_Eyed_Dog.class);
                    startActivity(intent11);
                }
                if (position == 12) {
                    Intent intent12 = new Intent(view.getContext(), PRYZM_Portsmouth.class);
                    startActivity(intent12);
                }
                if (position == 13) {
                    Intent intent13 = new Intent(view.getContext(), Scarlet_Tap.class);
                    startActivity(intent13);
                }
                if (position == 14) {
                    Intent intent14 = new Intent(view.getContext(), Southsea_Villiage.class);
                    startActivity(intent14);
                }
            }});
    }

    //Creates the adapter for a single venue showing on the homescreen
    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String vTitle[];
        String vAddress[];
        int vImg[];
        int tIcon[];
        int tIcon2[];
        int tIcon3[];


        MyAdapter(Context c, String[] vTitle, String[] vAddress, int[] vImg, int[] tIcon, int[] tIcon2, int[] tIcon3){
            super(c, R.layout.row,R.id.venueName, venueTitle);
            this.context = c;
            this.vTitle = venueTitle;
            this.vAddress = venueAddress;
            this.vImg = venueImages;
            this.tIcon = typeIcon;
            this.tIcon2 = typeIcon2;
            this.tIcon3 = typeIcon3;

        }

        // Matches the variables to the position on the page
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row,parent,false);
            ImageView images = row.findViewById(R.id.venueImageView);
            ImageView icons = row.findViewById(R.id.iconView1);
            ImageView icons2 = row.findViewById(R.id.iconView2);
            ImageView icons3 = row.findViewById(R.id.iconView3);
            TextView title = row.findViewById(R.id.venueName);
            TextView address = row.findViewById(R.id.venueAddress);
            images.setImageResource(vImg[position]);
            icons.setImageResource(tIcon[position]);
            icons2.setImageResource(tIcon2[position]);
            icons3.setImageResource(tIcon3[position]);
            title.setText(vTitle[position]);
            address.setText(vAddress[position]);
            return row;
        }

        }
    }


