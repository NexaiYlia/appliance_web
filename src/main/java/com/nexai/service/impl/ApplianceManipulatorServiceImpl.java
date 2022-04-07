package com.nexai.service.impl;

import com.nexai.comparator.ByCapacityApplianceComparator;
import com.nexai.model.Appliance;
import com.nexai.service.ApplianceManipulatorService;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ApplianceManipulatorServiceImpl implements ApplianceManipulatorService {
    @Override
    public double calculateSumPowerConsumption(List<? extends Appliance> applianceList) {
        double sum = 0;
        ListIterator<? extends Appliance> listIterator = applianceList.listIterator();
        while (listIterator.hasNext()) {
            Appliance appliance = listIterator.next();
            sum = sum + appliance.getCapacity();

        }
        return sum;
    }

    @Override
    public  void sortApplianceByPower(List<Appliance> applianceList) {
        ByCapacityApplianceComparator byCapacityApplianceComparator = new ByCapacityApplianceComparator();
        applianceList.sort(byCapacityApplianceComparator);
    }

    @Override
    public void sortApplianceByPowerStream(List<? extends Appliance> applianceList) {
        ByCapacityApplianceComparator byCapacityApplianceComparator = new ByCapacityApplianceComparator();
        applianceList.stream().sorted(byCapacityApplianceComparator).collect(Collectors.toList());
    }

    @Override
    public List<Appliance> findApplianceInPriceRange(List<? extends Appliance> applianceList, double maxPrice, double minPrice) {
        List<Appliance> list = new ArrayList<>();
        ListIterator<? extends Appliance> listIterator = applianceList.listIterator();
        while (listIterator.hasNext()) {
            Appliance appliance = listIterator.next();
            if ((appliance.getPrice() < maxPrice) && (appliance.getPrice() > minPrice)) {
                list.add(appliance);
            }
        }
        return list;
    }

    @Override
    public List<Appliance> findApplianceInPriceAndSwitchOnRange(List<? extends Appliance> applianceList, double maxPrice, double minPrice, boolean isSwitchedOn) {
        List<Appliance> list = new ArrayList<>();
        ListIterator<? extends Appliance> listIterator = applianceList.listIterator();
        while (listIterator.hasNext()) {
            Appliance appliance = listIterator.next();
            if ((appliance.getPrice() < maxPrice) && (appliance.getPrice() > minPrice)) {
                list.add(appliance);
            }
        }
        return list;
    }
}
