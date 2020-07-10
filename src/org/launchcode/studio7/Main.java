package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
   CD beatleCD = new CD("The White Album", "The Beatles", 120 , "compact");
   DVD blueVelvet = new DVD("Blue Velvet","David Lynch",220,"DVD");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(beatleCD.spin());
        System.out.println(blueVelvet.spin());


    }
}
