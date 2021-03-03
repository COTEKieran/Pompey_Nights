package com.example.pompeynights;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class One_Eyed_Dog extends AppCompatActivity {
    ViewFlipper v_flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oneeyeddog);

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


        int images[] = {R.drawable.oneeyeddog, R.drawable.oneeyeddog1};
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

        ImageView liveMusicIcon = (ImageView) findViewById(R.id.liveMusic);
        liveMusicIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastLiveMusic();
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
                String google = "https://www.google.com/search?rlz=1C1CHBF_en-GBGB813GB813&sxsrf=ALeKk03UYhkao2oSJL6CLGHC0tMBNQrPpw%3A1612707306124&ei=6vUfYK3jBsyAhbIP-7yaqAo&q=one+eyed+dog+portsmouth&gs_ssp=eJzj4tZP1zcsyaosMayqMmC0UjWoMLEwNzFNSTQ2MklKMTdITbEyqEgzNDE0SklKSkk1ME-1SEzzEs_PS1VIrUxNUUjJT1coyC8qKc7NLy3JAACFJRip&oq=one+eyed&gs_lcp=CgZwc3ktYWIQAxgAMg0ILhDHARCvARBDEJMCMggILhCxAxCDATIFCC4QsQMyAggAMgIILjIICAAQsQMQgwEyAggAMgIIADICCAAyAggAOgQIIxAnOgoILhDHARCvARBDOgQIABBDOgUIABCRAjoHCC4QsQMQQzoFCAAQsQM6CwguELEDEMcBEK8BOggILhDHARCvAVClB1j_CmCoE2gAcAJ4AIABhASIAa0RkgEJMi0xLjIuMi4xmAEAoAEBqgEHZ3dzLXdpesABAQ&sclient=psy-ab";
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
                String facebook = "https://www.facebook.com/TheOneEyedDog/";
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
                String maps = "https://www.google.com/maps?rlz=1C1CHBF_en-GBGB813GB813&sxsrf=ALeKk03UYhkao2oSJL6CLGHC0tMBNQrPpw:1612707306124&q=one+eyed+dog+portsmouth&gs_lcp=CgZwc3ktYWIQAxgAMg0ILhDHARCvARBDEJMCMggILhCxAxCDATIFCC4QsQMyAggAMgIILjIICAAQsQMQgwEyAggAMgIIADICCAAyAggAOgQIIxAnOgoILhDHARCvARBDOgQIABBDOgUIABCRAjoHCC4QsQMQQzoFCAAQsQM6CwguELEDEMcBEK8BOggILhDHARCvAVClB1j_CmCoE2gAcAJ4AIABhASIAa0RkgEJMi0xLjIuMi4xmAEAoAEBqgEHZ3dzLXdpesABAQ&um=1&ie=UTF-8&sa=X&ved=2ahUKEwibnc7P_9fuAhVhRBUIHYhYB6EQ_AUoAnoECAcQBA";
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

    public void showToastLiveMusic() {
        LayoutInflater liveMusicInflater = getLayoutInflater();
        View liveMusicLayout = liveMusicInflater.inflate(R.layout.livemusicicon, (ViewGroup) findViewById(R.id.liveMusicLayout));
        Toast liveMusicToast = new Toast(getApplicationContext());
        liveMusicToast.setGravity(Gravity.CENTER, 0, 0);
        liveMusicToast.setDuration(Toast.LENGTH_SHORT);
        liveMusicToast.setView(liveMusicLayout);
        liveMusicToast.show();
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