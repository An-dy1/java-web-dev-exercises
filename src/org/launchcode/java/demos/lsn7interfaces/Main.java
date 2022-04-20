package org.launchcode.java.demos.lsn7interfaces;

import org.launchcode.java.demos.lsn7interfaces.utilities.ConeComparator;
import org.launchcode.java.demos.lsn7interfaces.utilities.FlavorComparator;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        System.out.println("Before sort: ");
        for(Flavor flavor : flavors) {
            System.out.println("flavor: " + flavor.getName() + " allergens: " + flavor.getAllergens().size());
        }
        System.out.println("==================");

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        Comparator comparator = new FlavorComparator();
        System.out.println("==================");
        System.out.println("Returned by the compare method passed two flavors: " + comparator.compare(flavors.get(1), flavors.get(2)));

        System.out.println("==================");
        System.out.println("After sort: ");
        flavors.sort(comparator);
        for(Flavor flavor : flavors) {
            System.out.println("flavor: " + flavor.getName() + " allergens: " + flavor.getAllergens().size());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        System.out.println("==================");
        System.out.println("Before sort:");
        for(Cone cone : cones) {
            System.out.println(cone.getCost());
        }

        Comparator coneComparator = new ConeComparator();
        cones.sort(coneComparator);

        System.out.println("==================");
        System.out.println("After sort:");
        for(Cone cone : cones) {
            System.out.println(cone.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        // done above

        // TODO: modify FlavorComparator to sort Flavor objects by the number of allergens from highest to lowest

    }
}
