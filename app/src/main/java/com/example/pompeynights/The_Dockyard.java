package com.example.pompeynights;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class The_Dockyard extends AppCompatActivity {
    ViewFlipper v_flipper;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.DarkTheme);
        }
        else setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thedockyard);
        ratingBar = (RatingBar) findViewById(R.id.venueRating);
        ratingBar.setRating(load());
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                save(rating);
            }
        });

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


        int images[] = {R.drawable.dockyard, R.drawable.dockyard1,R.drawable.dockyard2};
        v_flipper = findViewById(R.id.flipper);
        for (int i = 0; i < images.length; i++) {
            flipperImages(images[i]);
        }


        ImageView smokingAreaIcon = (ImageView) findViewById(R.id.smokingArea);

        smokingAreaIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastSmokingArea();
            }
        });

        ImageView televisionIcon = (ImageView) findViewById(R.id.television);

        televisionIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastTelevision();
            }
        });

        ImageView poolTableIcon = (ImageView) findViewById(R.id.poolTable);

        poolTableIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastPool();
            }
        });


        ImageView wifiIcon = (ImageView) findViewById(R.id.wifi);
        wifiIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastWifi();
            }
        });

        ImageView dancefloorIcon = (ImageView) findViewById(R.id.dancefloor);
        dancefloorIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastDancefloor();
            }
        });

        ImageView maskIcon = (ImageView) findViewById(R.id.mask);
        maskIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastMask();
            }
        });



        ImageView internetLink = (ImageView) findViewById(R.id.internetLink);
        internetLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://www.google.com/search?q=dockyard+portsmouth+pub&source=lmns&bih=754&biw=1536&rlz=1C1CHBF_en-GBGB813GB813&hl=en&sa=X&ved=2ahUKEwjuy-qr4NDuAhUzgHMKHY9CBc8Q_AUoAHoECAEQAA";
                Uri googleaddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, googleaddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoGoogle);
                }
            }
        });

        ImageView facebookLink = (ImageView) findViewById(R.id.facebookLink);
        facebookLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String facebook = "https://www.facebook.com/TheDockyardPortsmouth/";
                Uri facebookaddress = Uri.parse(facebook);

                Intent gotoFacebook = new Intent(Intent.ACTION_VIEW, facebookaddress);
                if (gotoFacebook.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoFacebook);
                }
            }
        });

        ImageView mapLink = (ImageView) findViewById(R.id.mapIcon);
        mapLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String maps = "https://www.google.com/maps/place/The+Dockyard+Pub+Portsmouth/@50.7963664,-1.0946963,17z/data=!3m1!4b1!4m5!3m4!1s0x48745d5511206be1:0x1c16754854e1b34a!8m2!3d50.7963664!4d-1.0925076";
                Uri googleMaps = Uri.parse(maps);

                Intent gotoMaps = new Intent(Intent.ACTION_VIEW, googleMaps);
                if (gotoMaps.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoMaps);
                }
            }
        });
    }

    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }

    public void showToastSmokingArea(){
        LayoutInflater smokingAreaInflater = getLayoutInflater();
        View smokingAreaLayout = smokingAreaInflater.inflate(R.layout.smokingareaicon, (ViewGroup) findViewById(R.id.smokingLayout));
        Toast smokingAreaToast = new Toast(getApplicationContext());
        smokingAreaToast.setGravity(Gravity.CENTER, 0,0);
        smokingAreaToast.setDuration(Toast.LENGTH_SHORT);
        smokingAreaToast.setView(smokingAreaLayout);
        smokingAreaToast.show();
    }

    public void showToastTelevision(){
        LayoutInflater televisionInflater = getLayoutInflater();
        View televisionLayout = televisionInflater.inflate(R.layout.televisionicon, (ViewGroup) findViewById(R.id.televisionLayout));
        Toast televisionToast = new Toast(getApplicationContext());
        televisionToast.setGravity(Gravity.CENTER, 0,0);
        televisionToast.setDuration(Toast.LENGTH_SHORT);
        televisionToast.setView(televisionLayout);
        televisionToast.show();
    }

    public void showToastPool(){
        LayoutInflater poolInflater = getLayoutInflater();
        View poolLayout = poolInflater.inflate(R.layout.pooltableicon, (ViewGroup) findViewById(R.id.poolTableLayout));
        Toast poolToast = new Toast(getApplicationContext());
        poolToast.setGravity(Gravity.CENTER, 0,0);
        poolToast.setDuration(Toast.LENGTH_SHORT);
        poolToast.setView(poolLayout);
        poolToast.show();
    }

    public void showToastWifi(){
        LayoutInflater wifiInflater = getLayoutInflater();
        View wifiLayout = wifiInflater.inflate(R.layout.wifiicon, (ViewGroup) findViewById(R.id.wifiLayout));
        Toast wifiToast = new Toast(getApplicationContext());
        wifiToast.setGravity(Gravity.CENTER, 0,0);
        wifiToast.setDuration(Toast.LENGTH_SHORT);
        wifiToast.setView(wifiLayout);
        wifiToast.show();
    }

    public void showToastDancefloor(){
        LayoutInflater dancefloorInflater = getLayoutInflater();
        View dancefloorLayout = dancefloorInflater.inflate(R.layout.danceflooricon, (ViewGroup) findViewById(R.id.dancefloorLayout));
        Toast dancefloorToast = new Toast(getApplicationContext());
        dancefloorToast.setGravity(Gravity.CENTER, 0,0);
        dancefloorToast.setDuration(Toast.LENGTH_SHORT);
        dancefloorToast.setView(dancefloorLayout);
        dancefloorToast.show();
    }

    public void showToastMask(){
        LayoutInflater maskInflater = getLayoutInflater();
        View maskLayout = maskInflater.inflate(R.layout.maskicon, (ViewGroup) findViewById(R.id.maskLayout));
        Toast maskToast = new Toast(getApplicationContext());
        maskToast.setGravity(Gravity.CENTER, 0,0);
        maskToast.setDuration(Toast.LENGTH_SHORT);
        maskToast.setView(maskLayout);
        maskToast.show();
    }

    public void save(float f){
        SharedPreferences sharedPreferences = getSharedPreferences("folder", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putFloat("dockyard", f);
        editor.commit();
    }

    public float load(){
        SharedPreferences sharedPreferences = getSharedPreferences("folder", MODE_PRIVATE);
        float f = sharedPreferences.getFloat("dockyard",0f);
        return f;
    }
}