package org.vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class VehicleApp
{
    public static void main( String[] args )
    {
        List<Vehicle> tachki = new ArrayList<>();
        tachki.add(new Vehicle("Tesla", 2020));
        tachki.add(new Vehicle("Ford", 2018));
        tachki.add(new Vehicle("Toyota", 2021));
        tachki.add(new Vehicle("Honda", 2020));

        System.out.println("====AVAILABLE TACHKI====");
        tachki.forEach(System.out::println);

        //Sorting
        // 1 - by year
        Collections.sort(tachki);
        System.out.println("Sorted by Year (Newest First == DESC):");
        tachki.forEach(System.out::println);

        // 2 - by brand
        tachki.sort(new VehicleBrandComparator());
        System.out.println("Sorted by Brand (Alphabetical):");
        tachki.forEach(System.out::println);

    }
}
