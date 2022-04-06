package com.nexai.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();
    Appliance fridge = new Appliance("Fridge", 200,300,"white");
    Appliance kettle = new Appliance("Kettle", 25,20,"red");
    Appliance vacuumCleaner = new Appliance("Vacuum cleaner", 120,125,"pink");

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
        return model.stream()
                .map(Appliance::getName)
                .collect(Collectors.toList());
    }

    public List<Appliance> getModel() {
        return List.copyOf(model);
    }
}
