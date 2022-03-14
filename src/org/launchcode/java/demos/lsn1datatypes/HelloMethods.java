package org.launchcode.java.demos.lsn1datatypes;


import static org.launchcode.java.demos.lsn1datatypes.TempConverter.getASnack;

public class HelloMethods {

    public static void main(String[] args) {

        String message = Message.getMessage("fr");
        System.out.println(message);
        System.out.println(getASnack(4));
    }



}


