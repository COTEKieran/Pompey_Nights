package com.example.pompeynights;

public class Venue {
    public String venueName;
    public  String venueAddress;
    public  int venueImage;
    public  int typeIcon1;
    public  int typeIcon2;
    public  int typeIcon3;


    public  Venue(String venueName,String venueAddress, int venueImage, int typeIcon1, int typeIcon2, int typeIcon3){
        this.venueName = venueName;
        this.venueAddress = venueAddress;
        this.venueImage = venueImage;
        this.typeIcon1 = typeIcon1;
        this.typeIcon2 = typeIcon2;
        this.typeIcon3 = typeIcon3;


    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenueAddress() {
        return venueAddress;
    }

    public void setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
    }

    public int getVenueImage() {
        return venueImage;
    }

    public void setVenueImage(int venueImage) {
        this.venueImage = venueImage;
    }

    public int getTypeIcon1() {
        return typeIcon1;
    }

    public void setTypeIcon1(int typeIcon1) {
        this.typeIcon1 = typeIcon1;
    }

    public int getTypeIcon2() {
        return typeIcon2;
    }

    public void setTypeIcon2(int typeIcon2) {
        this.typeIcon2 = typeIcon2;
    }

    public int getTypeIcon3() {
        return typeIcon3;
    }

    public void setTypeIcon3(int typeIcon3) {
        this.typeIcon3 = typeIcon3;
    }

}
