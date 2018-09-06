package br.com.oaklabs.tourguidefortal;

public class Place {

    String name;
    String address;
    private int imageID = -1;

    public Place(String name, String address, int imageID) {
        this.name = name;
        this.address = address;
        this.imageID = imageID;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return address;
    }

    public int getImageID() {
        return imageID;
    }


}
