package com.nexai.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();
    Appliance fridge = new Appliance("холодильник", 200,300,"white");
    Appliance kettle = new Appliance("чайник", 25,20,"red");
    Appliance vacuumCleaner = new Appliance("пылесос", 120,125,"pink");

    public static List<Appliance> model;

    public static Model getInstance() {
        return instance;
    }


    private Model() {
        model = new ArrayList<>();
        model.add(fridge);
        model.add(kettle);
        model.add(vacuumCleaner);
    }

    public void add(Appliance appliance) {
        model.add(appliance);
    }

    public List<String> listName() {
        List<String> list = new ArrayList<>();
        for (Appliance appliance : model) {
            String name = appliance.getName();
            list.add(name);
        }
        return list;
    }

    public List<Appliance> getModel() {
        return model;
    }
}
