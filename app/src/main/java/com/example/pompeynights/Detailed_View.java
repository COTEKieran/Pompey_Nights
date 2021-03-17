package com.example.pompeynights;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

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

public class Detailed_View extends AppCompatActivity {
    ListView detailedListView;
    String venueTitle[] = {"Astoria", "Bonita's ","Brewhouse and Kitchen", "Dockyard", "Fat Fox", "Fawcett Inn", "Fleet/Popworld", "Lord John Russell", "Meat and Barrel", "Mr Miyagis", "O'Neills", "One Eyed Dog", "PRYZM Portsmouth", "Scarlet Tap", "Southsea Villiage", };
    String venueAddress[]= {"37-39 Guildhall Walk, Portsmouth PO1 2RY","106 Palmerston Rd, Southsea, Portsmouth PO5 3PT" , "26 Guildhall Walk, Portsmouth PO1 2DD", "19 Guildhall Walk, Portsmouth PO1 2RY" , "11-13 Victoria Rd S. Southsea PO62SP" , "176 Fawcett Rd, Southsea, PO40DP" , "1 King Henry I St, Portsmouth PO1 2PT", "12 Albert Rd, Southsea, Portsmouth PO5 2SH", "110-114 Palmerston Rd, Southsea PO5 3PT" , "29-33 Guildhall Walk, Portsmouth PO1 2RY" , "Albert Rd, Southsea Portsmouth, PO5 2SX" , "177-185 Elm Grove, Southsea, Portsmouth O5 1LU", "Connaught Drill Hall, Stanhope Road, PO11DU" , "80-82 Palmerston Rd, Southsea, Portsmouth PO5 3PT", "81 Palmerston Rd, Southsea, Portsmouth PO5 3PP"};
    int typeIcon[] = {R.drawable.beericon,R.drawable.beericon, R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon,R.drawable.beericon};
    int typeIcon2[] = {R.drawable.musicicon,R.drawable.cutleryicon,R.drawable.cutleryicon,R.drawable.cutleryicon, R.drawable.cutleryicon,R.drawable.cutleryicon,R.drawable.cutleryicon,R.drawable.cutleryicon,R.drawable.cutleryicon,R.drawable.musicicon,R.drawable.cutleryicon,R.drawable.cutleryicon,R.drawable.musicicon,R.drawable.cutleryicon,R.drawable.cutleryicon};
    int typeIcon3[] = {' ',' ',' ',R.drawable.musicicon,R.drawable.musicicon,' ',R.drawable.musicicon,' ',' ',' ',' ',' ',' ',' ',' '};
    int feature1[] = {R.drawable.smokingarea, R.drawable.smokingarea, R.drawable.smokingarea, R.drawable.television, R.drawable.television, R.drawable.television, R.drawable.smokingarea, R.drawable.smokingarea, R.drawable.smokingarea, R.drawable.smokingarea, R.drawable.smokingarea, R.drawable.television, R.drawable.smokingarea, R.drawable.television, R.drawable.smokingarea};
    int feature2[] = {R.drawable.dancefloor, R.drawable.disabled, R.drawable.disabled, R.drawable.smokingarea, R.drawable.smokingarea, R.drawable.smokingarea, R.drawable.dancefloor, R.drawable.disabled, R.drawable.takeaway, R.drawable.dancefloor, R.drawable.livemusic, R.drawable.smokingarea, R.drawable.dancefloor, R.drawable.smokingarea, R.drawable.takeaway};
    int feature3[] = {R.drawable.entryfee, R.drawable.wifi, R.drawable.wifi, R.drawable.dancefloor, R.drawable.dancefloor, R.drawable.disabled, R.drawable.entryfee, R.drawable.pool, R.drawable.disabled, R.drawable.entryfee, R.drawable.pool, R.drawable.livemusic, R.drawable.entryfee, R.drawable.disabled, R.drawable.disabled};
    int feature4[] = {R.drawable.livemusic, R.drawable.mask, R.drawable.mask, R.drawable.pool, R.drawable.pool, R.drawable.pool, R.drawable.livemusic, R.drawable.wifi, R.drawable.wifi, R.drawable.livemusic, R.drawable.wifi, R.drawable.disabled, R.drawable.livemusic, R.drawable.wifi, R.drawable.wifi};
    int feature5[] = {R.drawable.mask, ' ', ' ', R.drawable.wifi, R.drawable.livemusic, R.drawable.wifi, R.drawable.mask, R.drawable.mask, R.drawable.mask, R.drawable.mask, R.drawable.mask, R.drawable.wifi, R.drawable.mask, R.drawable.mask, R.drawable.mask};
    int feature6[] = {' ', ' ', ' ', R.drawable.mask, R.drawable.mask, R.drawable.mask, ' ', ' ', ' ', ' ', ' ', R.drawable.mask, ' ', ' ', ' ',};
    ArrayAdapter<String> arrayAdapterDetailed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.DarkTheme);
        }
        else setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailedviews);

        ImageView help = findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHelp = new Intent(v.getContext(), Help.class);
                startActivity(goToHelp);
            }
        });

        ImageView settings = findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSettings = new Intent(v.getContext(), Settings.class);
                startActivity(goToSettings);
            }
        });

        ImageView title = findViewById(R.id.toolbar_title);
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToMain = new Intent(v.getContext(), MainActivity.class);
                startActivity(goToMain);
            }
        });


        detailedListView = findViewById(R.id.detailedListView);

        MyDetailedAdapter adapter = new MyDetailedAdapter(this,venueTitle,venueAddress, typeIcon, typeIcon2, typeIcon3,feature1, feature2, feature3, feature4, feature5, feature6);
        detailedListView.setAdapter(adapter);

        ImageView pictureImage = (ImageView) findViewById(R.id.imageViewIcon);

        pictureImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToPictures = new Intent(v.getContext(), Homepage.class);
                startActivity(goToPictures);
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



        detailedListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
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

    class MyDetailedAdapter extends ArrayAdapter<String>{
        Context context;
        String vTitle[];
        String vAddress[];
        int tIcon[];
        int tIcon2[];
        int tIcon3[];
        int vFeature1[];
        int vFeature2[];
        int vFeature3[];
        int vFeature4[];
        int vFeature5[];
        int vFeature6[];

        MyDetailedAdapter(Context c, String[] vTitle, String[] vAddress,int[] tIcon, int[] tIcon2, int[] tIcon3, int[] vFeature1, int[] vFeature2, int[] vFeature3, int[] vFeature4, int[] vFeature5, int[] vFeature6){
            super(c, R.layout.details,R.id.venueName, venueTitle);
            this.context = c;
            this.vTitle = venueTitle;
            this.vAddress = venueAddress;
            this.tIcon = typeIcon;
            this.tIcon2 = typeIcon2;
            this.tIcon3 = typeIcon3;
            this.vFeature1 = feature1;
            this.vFeature2 = feature2;
            this.vFeature3 = feature3;
            this.vFeature4 = feature4;
            this.vFeature5 = feature5;
            this.vFeature6 = feature6;
        }



        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View details = layoutInflater.inflate(R.layout.details,parent,false);

            ImageView icons = details.findViewById(R.id.iconView1);
            ImageView icons2 = details.findViewById(R.id.iconView2);
            ImageView icons3 = details.findViewById(R.id.iconView3);
            TextView title = details.findViewById(R.id.venueName);
            TextView address = details.findViewById(R.id.venueAddress);
            ImageView feature1 = details.findViewById(R.id.feature1);
            ImageView feature2 = details.findViewById(R.id.feature2);
            ImageView feature3 = details.findViewById(R.id.feature3);
            ImageView feature4 = details.findViewById(R.id.feature4);
            ImageView feature5 = details.findViewById(R.id.feature5);
            ImageView feature6 = details.findViewById(R.id.feature6);

            icons.setImageResource(tIcon[position]);
            icons2.setImageResource(tIcon2[position]);
            icons3.setImageResource(tIcon3[position]);
            title.setText(vTitle[position]);
            address.setText(vAddress[position]);
            feature1.setImageResource(vFeature1[position]);
            feature2.setImageResource(vFeature2[position]);
            feature3.setImageResource(vFeature3[position]);
            feature4.setImageResource(vFeature4[position]);
            feature5.setImageResource(vFeature5[position]);
            feature6.setImageResource(vFeature6[position]);
            return details;
        }

    }

}
