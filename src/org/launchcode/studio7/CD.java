package org.launchcode.studio7;

public class CD extends Disc implements OpticalDisc{
    public CD(String title, String artist, double capacity, String discType) {
        super();
    }



    @Override
    public int spin() {
       int rpm = 789;
        return 789;
    }

    @Override
    public void read() {

    }

    @Override
    public void write() {

    }

    @Override
    public void eject() {

    }

    @Override
    public void load() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
