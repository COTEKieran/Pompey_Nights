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

public class Brewhouse_And_Kitchen extends AppCompatActivity {

    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.brewhouseandkitchen);

        int images[] = {R.drawable.brewhouse, R.drawable.brewhouse1};
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
                String google = "https://www.brewhouseandkitchen.com/venue/portsmouth/";
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
                String facebook = "https://www.facebook.com/BKPortsmouth/";
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
                String maps = "https://www.google.com/maps/place/Brewhouse+%26+Kitchen+-+Portsmouth+(Guildhall)/@50.7923446,-1.0986275,16z/data=!4m8!1m2!2m1!1sbrewhouse+and+kitchen+portsmouth!3m4!1s0x48745d9dd670cb8d:0x939fd26cc6efc7be!8m2!3d50.7962884!4d-1.0932647";
                Uri googleMaps = Uri.parse(maps);

                Intent gotoMaps = new Intent(Intent.ACTION_VIEW, googleMaps);
                if (gotoMaps.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoMaps);
                }
            }
        });


    }

    public void flipperImages(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }

    public void showToastSmokingArea() {
        LayoutInflater smokingAreaInflater = getLayoutInflater();
        View smokingAreaLayout = smokingAreaInflater.inflate(R.layout.smokingareaicon, (ViewGroup) findViewById(R.id.smokingLayout));
        Toast smokingAreaToast = new Toast(getApplicationContext());
        smokingAreaToast.setGravity(Gravity.CENTER, 0, 0);
        smokingAreaToast.setDuration(Toast.LENGTH_SHORT);
        smokingAreaToast.setView(smokingAreaLayout);
        smokingAreaToast.show();
    }

    public void showToastDisabled() {
        LayoutInflater disabledInflater = getLayoutInflater();
        View disabledLayout = disabledInflater.inflate(R.layout.disabledicon, (ViewGroup) findViewById(R.id.disabledLayout));
        Toast disabledToast = new Toast(getApplicationContext());
        disabledToast.setGravity(Gravity.CENTER, 0, 0);
        disabledToast.setDuration(Toast.LENGTH_SHORT);
        disabledToast.setView(disabledLayout);
        disabledToast.show();
    }

    public void showToastWifi() {
        LayoutInflater wifiInflater = getLayoutInflater();
        View wifiLayout = wifiInflater.inflate(R.layout.wifiicon, (ViewGroup) findViewById(R.id.wifiLayout));
        Toast wifiToast = new Toast(getApplicationContext());
        wifiToast.setGravity(Gravity.CENTER, 0, 0);
        wifiToast.setDuration(Toast.LENGTH_SHORT);
        wifiToast.setView(wifiLayout);
        wifiToast.show();
    }

    public void showToastMask() {
        LayoutInflater maskInflater = getLayoutInflater();
        View maskLayout = maskInflater.inflate(R.layout.maskicon, (ViewGroup) findViewById(R.id.maskLayout));
        Toast maskToast = new Toast(getApplicationContext());
        maskToast.setGravity(Gravity.CENTER, 0, 0);
        maskToast.setDuration(Toast.LENGTH_SHORT);
        maskToast.setView(maskLayout);
        maskToast.show();
    }
}


