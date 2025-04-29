package org.vehicle;

/**
 * Vehicle class implementing Comparable
 */

public class Vehicle implements Comparable<Vehicle> {
    private final String brand;
    private final int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }

    /**
     * Natural order: sort by year (DESC = newest to oldest).
     */

    @Override
    public String toString() {
        return brand + "(" + year + ")";
    }

    @Override
    public int compareTo(Vehicle other) {
        return Integer.compare(other.year, this.year); // Newest first = DESC
        // return Integer.compare(this.year, other.year); // Latest first = ASC
    }
}
