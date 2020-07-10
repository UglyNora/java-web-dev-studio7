package org.launchcode.studio7;

public abstract class Disc {

    private String title;
    private String artist;
    private double capacity;
    private String discType;

    public boolean isFormatted() {
        return isFormatted;
    }

    public void setFormatted(boolean formatted) {
        isFormatted = formatted;
    }

    private boolean isFormatted = false;

    public Disc() {
        this.title = title;
        this.artist = artist;
        this.capacity = capacity;
        this.discType = discType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}
