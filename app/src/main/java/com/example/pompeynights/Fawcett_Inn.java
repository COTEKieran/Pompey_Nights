package com.example.pompeynights;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class Fawcett_Inn extends AppCompatActivity {

    ViewFlipper v_flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fawcett_inn);

        int images[] = {R.drawable.fawcettinn1, R.drawable.fawcettinn2};
        v_flipper = findViewById(R.id.flipper);
        for (int i = 0; i < images.length; i++) {
            flipperImages(images[i]);
        }

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

        ImageView disabledIcon = (ImageView) findViewById(R.id.disabled);

        disabledIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastDisabled();
            }
        });

        ImageView wifiIcon = (ImageView) findViewById(R.id.wifi);
        wifiIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastWifi();
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
                String google = "https://www.google.com/search?rlz=1C1CHBF_en-GBGB813GB813&sxsrf=ALeKk01dLcAeI3wooRZ_VWw_UGuoN2d7gw%3A1612022336715&ei=QIIVYPiVK_Gy8gKaiqGwDQ&q=The+Fawcett+Inn&oq=The+Fawcett+Inn&gs_lcp=CgZwc3ktYWIQAzIECCMQJzIICC4QxwEQrwE6CgguEMcBEK8BEEM6BAgAEEM6BQgAEJECOgUIABCxAzoCCAA6CwguELEDEMcBEKMCOgQILhBDOgQILhAnOgsILhDHARCvARCRAjoHCC4QJxCTAjoFCC4QsQM6BwgAEMkDEEM6BwgAEBQQhwI6AgguOgcILhCxAxAKOgUIABDJAzoFCCEQoAE6BggAEBYQHlDUTlizaWCUbGgBcAB4AIABiwGIAaEOkgEEMi4xNJgBAKABAaoBB2d3cy13aXrAAQE&sclient=psy-ab&ved=0ahUKEwj4tf-Vg8TuAhVxmVwKHRpFCNYQ4dUDCA0&uact=5";
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
                String facebook = "https://www.facebook.com/TheFawcettInn/";
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
                String maps = "https://www.google.com/maps/place/The+Fawcett+Inn/@50.7907972,-1.0761145,17z/data=!4m5!3m4!1s0x48745da570db31d9:0x3d1d928ca4b28b34!8m2!3d50.7908679!4d-1.0761917?hl=en";
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

    public void showToastDisabled(){
        LayoutInflater disabledInflater = getLayoutInflater();
        View disabledLayout = disabledInflater.inflate(R.layout.disabledicon, (ViewGroup) findViewById(R.id.disabledLayout));
        Toast disabledToast = new Toast(getApplicationContext());
        disabledToast.setGravity(Gravity.CENTER, 0,0);
        disabledToast.setDuration(Toast.LENGTH_SHORT);
        disabledToast.setView(disabledLayout);
        disabledToast.show();
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

    public void showToastMask(){
        LayoutInflater maskInflater = getLayoutInflater();
        View maskLayout = maskInflater.inflate(R.layout.maskicon, (ViewGroup) findViewById(R.id.maskLayout));
        Toast maskToast = new Toast(getApplicationContext());
        maskToast.setGravity(Gravity.CENTER, 0,0);
        maskToast.setDuration(Toast.LENGTH_SHORT);
        maskToast.setView(maskLayout);
        maskToast.show();
    }
}

