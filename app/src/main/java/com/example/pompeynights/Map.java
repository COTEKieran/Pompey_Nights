package com.example.pompeynights;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class Map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ArrayList<LatLng> arrayList = new ArrayList<LatLng>();
    LatLng fawcettinn = new LatLng(50.790868, -1.076146);
    LatLng fatfox = new LatLng(50.788521, -1.082258);
    LatLng pryzm = new LatLng(50.799428, -1.091978);
    LatLng astoria = new LatLng(50.795836,-1.093226);
    LatLng dockyard = new LatLng(50.796516,-1.092610);
    LatLng meatandbarrel = new LatLng(50.783490,-1.088976);
    LatLng oneills = new LatLng(50.788109,-1.082390);
    LatLng bonitas= new LatLng(50.783703,-1.088982);
    LatLng brewhouse = new LatLng(50.796576,-1.093093);
    LatLng southseavilliage = new LatLng(50.783978,-1.088671);
    LatLng miyagis = new LatLng(50.796008,-1.093099);
    LatLng scarlettap = new LatLng(50.784344,-1.088984);
    LatLng johnrussel= new LatLng(50.787374,-1.081648);
    LatLng fleet = new LatLng(50.797133,-1.093328);
    LatLng oneeyeddog = new LatLng(50.789408,-1.082861);
    LatLng portsmouth = new LatLng(50.790463,-1.085659);

    ArrayList<String> title = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.googlemap);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        arrayList.add(fawcettinn);
        arrayList.add(fatfox);
        arrayList.add(pryzm);
        arrayList.add(astoria);
        arrayList.add(dockyard);
        arrayList.add(meatandbarrel);
        arrayList.add(oneills);
        arrayList.add(bonitas);
        arrayList.add(brewhouse);
        arrayList.add(southseavilliage);
        arrayList.add(miyagis);
        arrayList.add(scarlettap);
        arrayList.add(johnrussel);
        arrayList.add(fleet);
        arrayList.add(oneeyeddog);


        title.add("The Fawcett Inn");
        title.add("The Fat Fox");
        title.add("PRYZM Portsmouth");
        title.add("The Astoria");
        title.add("The Dockyard");
        title.add("Meat and Barrel");
        title.add("O'Neills");
        title.add("Bonita's");
        title.add("Brewhouse and Kitchen");
        title.add("The Southsea Villiage");
        title.add("Mr Miyagis");
        title.add("Scarlet Tap");
        title.add("Lord John Russell");
        title.add("The Fleet/Popworld");
        title.add("The One Eyed Dog");
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(final GoogleMap googleMap) {
        mMap = googleMap;

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(portsmouth, 14),3000,null);

        for(int i=0;i<arrayList.size();i++){
            mMap.addMarker(new MarkerOptions().position(arrayList.get(i)).title(String.valueOf(title.get(i))));
        }

                mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
                    @Override
                    public boolean onMarkerClick(Marker marker) {
                        String markertitle = marker.getTitle();

                        if (markertitle.equals("The Fawcett Inn")) {
                            Intent intent0 = new Intent(Map.this, Fawcett_Inn.class);
                            startActivity(intent0);
                        }

                        else if (markertitle.equals("The Fat Fox")) {
                            Intent intent1 = new Intent(Map.this, Fat_Fox.class);
                            intent1.putExtra("title", markertitle);
                            startActivity(intent1);
                        }

                        else if (markertitle.equals("PRYZM Portsmouth")) {
                            Intent intent2 = new Intent(Map.this, PRYZM_Portsmouth.class);
                            startActivity(intent2);
                        }

                        else if (markertitle.equals("The Astoria")) {
                            Intent intent3 = new Intent(Map.this, The_Astoria.class);
                            startActivity(intent3);
                        }

                        else if (markertitle.equals("The Dockyard")) {
                            Intent intent4 = new Intent(Map.this, The_Dockyard.class);
                            startActivity(intent4);
                        }

                        else if (markertitle.equals("Meat and Barrel")) {
                            Intent intent5 = new Intent(Map.this, Meat_And_Barrel.class);
                            startActivity(intent5);
                        }

                        else if (markertitle.equals("O'Neills")) {
                            Intent intent6 = new Intent(Map.this, ONeills.class);
                            startActivity(intent6);
                        }

                        else if (markertitle.equals("Bonita's")) {
                            Intent intent7 = new Intent(Map.this, Bonitas.class);
                            startActivity(intent7);
                        }

                        else if (markertitle.equals("Brewhouse and Kitchen")) {
                            Intent intent8 = new Intent(Map.this, Brewhouse_And_Kitchen.class);
                            startActivity(intent8);
                        }

                        else if (markertitle.equals("The Southsea Villiage")) {
                            Intent intent9 = new Intent(Map.this, Southsea_Villiage.class);
                            startActivity(intent9);
                        }


                        else if (markertitle.equals("Mr Miyagis")) {
                            Intent intent10 = new Intent(Map.this, Mr_Miyagis.class);
                            startActivity(intent10);
                        }

                        else if (markertitle.equals("Scarlet Tap")) {
                            Intent intent11 = new Intent(Map.this, Scarlet_Tap.class);
                            startActivity(intent11);
                        }

                        else if (markertitle.equals("Lord John Russell")) {
                            Intent intent12 = new Intent(Map.this, Lord_John_Russell.class);
                            startActivity(intent12);
                        }

                        else if (markertitle.equals("The Fleet/Popworld")) {
                            Intent intent13 = new Intent(Map.this, Fleet_and_Popworld.class);
                            startActivity(intent13);
                        }

                        else if (markertitle.equals("The One Eyed Dog")) {
                            Intent intent14 = new Intent(Map.this, One_Eyed_Dog.class);
                            startActivity(intent14);
                        }


                        return false;
                    }

                });


    }
}





