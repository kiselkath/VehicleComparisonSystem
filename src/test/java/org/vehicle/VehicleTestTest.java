package org.vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTestTest {
        private List<Vehicle> tachki;

    @BeforeEach
    void setUp() {
        tachki = new ArrayList<>();
        tachki.add(new Vehicle("Toyota", 2021));
        tachki.add(new Vehicle("Ford", 2018));
        tachki.add(new Vehicle("BMW", 2022));
        tachki.add(new Vehicle("Honda", 2020));
    }

    @Test
    @DisplayName("Vehicles should sort by year (newest first)")
    void testSortByYear() {
        Collections.sort(tachki);

        assertEquals("BMW", tachki.get(0).getBrand());
        assertEquals("Toyota", tachki.get(1).getBrand());
        assertEquals("Honda", tachki.get(2).getBrand());
        assertEquals("Ford", tachki.get(3).getBrand());
    }

    @Test
    @DisplayName("Vehicles should sort by brand name alphabetically")
    void testSortByBrand() {
        tachki.sort(new VehicleBrandComparator());

        assertEquals("BMW", tachki.get(0).getBrand());
        assertEquals("Ford", tachki.get(1).getBrand());
        assertEquals("Honda", tachki.get(2).getBrand());
        assertEquals("Toyota", tachki.get(3).getBrand());
    }
}