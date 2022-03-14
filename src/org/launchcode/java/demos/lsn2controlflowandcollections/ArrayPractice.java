package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        // instantiate a new array with first 6 fibonacci values in it

        String paragraph = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitPara = paragraph.split(" ");
        for(int i = 0; i<splitPara.length; i++) {
            System.out.println(splitPara[i]);
        }
        System.out.println(Arrays.toString(splitPara));
    }
}



