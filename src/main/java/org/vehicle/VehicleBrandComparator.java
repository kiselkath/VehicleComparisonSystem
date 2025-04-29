package org.vehicle;

import java.util.Comparator;

/**
 * Custom comparator to sort by brand
 */

public class VehicleBrandComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        return v1.getBrand().compareToIgnoreCase(v2.getBrand()) ;
    }
}
