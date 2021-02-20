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

public class Scarlet_Tap extends AppCompatActivity {

    ViewFlipper v_flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scarlettap);

        int images[] = {R.drawable.scarlettap,R.drawable.scarlettap1, R.drawable.scarlettap2};
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

        ImageView televisionIcon = (ImageView) findViewById(R.id.television);
        televisionIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastTelevision();
            }
        });




        ImageView internetLink = (ImageView) findViewById(R.id.internetLink);
        internetLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://www.google.com/search?rlz=1C1CHBF_en-GBGB813GB813&sxsrf=ALeKk003w8hEdz7aKd5s_R8z0ko8IPPMXg%3A1612697349826&ei=Bc8fYID2MdPoxgPqwLU4&q=scarlet+tap+portsmouth&gs_ssp=eJzj4tVP1zc0zDC3LC4vqMg1YLRSNagwsTA3MU2xSDNNMUkyTzNMszKoMDQ0SUuyNE02M0qzTDUxtPASK05OLMpJLVEoSSxQKMgvKinOzS8tyQAAfO8YUQ&oq=scarlet&gs_lcp=CgZwc3ktYWIQARgAMg0ILhDHARCvARBDEJMCMgcILhCxAxBDMgoIABCxAxCDARBDMgoILhCxAxCDARBDMgoILhCxAxCDARBDMgUILhCxAzIHCAAQsQMQQzICCAAyBQguELEDMgUILhCxAzoECCMQJzoFCAAQkQI6CAgAELEDEIMBOg4ILhCxAxCDARDHARCjAjoLCC4QsQMQxwEQowI6CgguEMcBEK8BEEM6CwguEMcBEK8BEJECOhAILhCxAxCDARDHARCjAhBDOggILhCxAxCDAToFCAAQsQM6BAgAEEM6BAguEEM6CAguEMcBEK8BUOIJWP0XYJodaABwAngAgAGCAYgBnAaSAQM0LjSYAQCgAQGqAQdnd3Mtd2l6wAEB&sclient=psy-ab";
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
                String facebook = "https://www.facebook.com/ScarletTapSouthsea/";
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
                String maps = "https://www.google.com/maps?rlz=1C1CHBF_en-GBGB813GB813&sxsrf=ALeKk003w8hEdz7aKd5s_R8z0ko8IPPMXg:1612697349826&q=scarlet+tap+portsmouth&gs_lcp=CgZwc3ktYWIQARgAMg0ILhDHARCvARBDEJMCMgcILhCxAxBDMgoIABCxAxCDARBDMgoILhCxAxCDARBDMgoILhCxAxCDARBDMgUILhCxAzIHCAAQsQMQQzICCAAyBQguELEDMgUILhCxAzoECCMQJzoFCAAQkQI6CAgAELEDEIMBOg4ILhCxAxCDARDHARCjAjoLCC4QsQMQxwEQowI6CgguEMcBEK8BEEM6CwguEMcBEK8BEJECOhAILhCxAxCDARDHARCjAhBDOggILhCxAxCDAToFCAAQsQM6BAgAEEM6BAguEEM6CAguEMcBEK8BUOIJWP0XYJodaABwAngAgAGCAYgBnAaSAQM0LjSYAQCgAQGqAQdnd3Mtd2l6wAEB&um=1&ie=UTF-8&sa=X&ved=2ahUKEwifnNai4NfuAhVFQEEAHfU9BhUQ_AUoAnoECAgQBA";
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

    public void showToastTelevision(){
        LayoutInflater televisionInflater = getLayoutInflater();
        View televisionLayout = televisionInflater.inflate(R.layout.televisionicon, (ViewGroup) findViewById(R.id.televisionLayout));
        Toast televisionToast = new Toast(getApplicationContext());
        televisionToast.setGravity(Gravity.CENTER, 0,0);
        televisionToast.setDuration(Toast.LENGTH_SHORT);
        televisionToast.setView(televisionLayout);
        televisionToast.show();
    }
}