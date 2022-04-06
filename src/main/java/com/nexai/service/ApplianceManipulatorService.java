package com.nexai.service;

import com.nexai.model.Appliance;

import java.util.List;

public interface ApplianceManipulatorService {
    double calculateSumPowerConsumption(List<? extends Appliance> applianceList);

    void sortApplianceByPower(List<? extends Appliance> applianceList);

    void sortApplianceByPowerStream(List<? extends Appliance> applianceList);

    List<Appliance> findApplianceInPriceRange(List<? extends Appliance> applianceList, double maxPrice, double minPrice);

    List<Appliance> findApplianceInPriceAndSwitchOnRange(List<? extends Appliance> applianceList, double maxPrice, double minPrice, boolean isSwitchedOn);
}
