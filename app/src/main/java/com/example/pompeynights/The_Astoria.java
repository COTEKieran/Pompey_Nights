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

public class The_Astoria extends AppCompatActivity {
    ViewFlipper v_flipper;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.DarkTheme);
        }
        else setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.theastoria);
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


        int images[] = {R.drawable.astoria1,R.drawable.astoria2};
        v_flipper = findViewById(R.id.flipper);
        for (int i = 0; i < images.length; i++) {
            flipperImages(images[i]);
        }

        ImageView internetLink = (ImageView) findViewById(R.id.internetLink);
        internetLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://www.astorianightclub.com/";
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
                String facebook = "https://www.facebook.com/astorianightclub/";
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
                String maps = "https://www.google.com/maps/place/The+Astoria/@50.7958657,-1.0954987,17z/data=!3m1!4b1!4m5!3m4!1s0x48745d9e7e0c42e1:0xa5a9d141e81138ce!8m2!3d50.7958657!4d-1.09331";
                Uri googleMaps = Uri.parse(maps);

                Intent gotoMaps = new Intent(Intent.ACTION_VIEW, googleMaps);
                if (gotoMaps.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoMaps);
                }
            }
        });

        ImageView smokingAreaIcon = (ImageView) findViewById(R.id.smokingArea);
        smokingAreaIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastSmokingArea();
            }
        });

        ImageView dancefloorIcon = (ImageView) findViewById(R.id.dancefloor);
        dancefloorIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastDancefloor();
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

        ImageView entryFeeIcon = (ImageView) findViewById(R.id.entryFee);
        entryFeeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastEntryFee();
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
    public void showToastSmokingArea() {
        LayoutInflater smokingAreaInflater = getLayoutInflater();
        View smokingAreaLayout = smokingAreaInflater.inflate(R.layout.smokingareaicon, (ViewGroup) findViewById(R.id.smokingLayout));
        Toast smokingAreaToast = new Toast(getApplicationContext());
        smokingAreaToast.setGravity(Gravity.CENTER, 0, 0);
        smokingAreaToast.setDuration(Toast.LENGTH_SHORT);
        smokingAreaToast.setView(smokingAreaLayout);
        smokingAreaToast.show();
    }

    public void showToastDancefloor() {
        LayoutInflater dancefloorInflater = getLayoutInflater();
        View dancefloorLayout = dancefloorInflater.inflate(R.layout.danceflooricon, (ViewGroup) findViewById(R.id.dancefloorLayout));
        Toast dancefloorToast = new Toast(getApplicationContext());
        dancefloorToast.setGravity(Gravity.CENTER, 0, 0);
        dancefloorToast.setDuration(Toast.LENGTH_SHORT);
        dancefloorToast.setView(dancefloorLayout);
        dancefloorToast.show();
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

    public void showToastMask() {
        LayoutInflater maskInflater = getLayoutInflater();
        View maskLayout = maskInflater.inflate(R.layout.maskicon, (ViewGroup) findViewById(R.id.maskLayout));
        Toast maskToast = new Toast(getApplicationContext());
        maskToast.setGravity(Gravity.CENTER, 0, 0);
        maskToast.setDuration(Toast.LENGTH_SHORT);
        maskToast.setView(maskLayout);
        maskToast.show();
    }

    public void showToastEntryFee() {
        LayoutInflater entryFeeInflater = getLayoutInflater();
        View entryFeeLayout = entryFeeInflater.inflate(R.layout.entryfeeicon, (ViewGroup) findViewById(R.id.entryFeeLayout));
        Toast entryFeeToast = new Toast(getApplicationContext());
        entryFeeToast.setGravity(Gravity.CENTER, 0, 0);
        entryFeeToast.setDuration(Toast.LENGTH_SHORT);
        entryFeeToast.setView(entryFeeLayout);
        entryFeeToast.show();
    }

    public void save(float f){
        SharedPreferences sharedPreferences = getSharedPreferences("folder", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putFloat("astoria", f);
        editor.commit();
    }

    public float load(){
        SharedPreferences sharedPreferences = getSharedPreferences("folder", MODE_PRIVATE);
        float f = sharedPreferences.getFloat("astoria",0f);
        return f;
    }

}