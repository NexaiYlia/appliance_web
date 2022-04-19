package com.nexai.comparator;

import com.nexai.model.Appliance;

import java.util.Comparator;

public class ByCapacityApplianceComparator implements Comparator<Appliance> {
    @Override
    public int compare(Appliance o1, Appliance o2) {
        double powerO1 = o1.getCapacity();
        double powerO2 = o2.getCapacity();
        return Double.compare(powerO1, powerO2);
    }
}
