package com.nexai.model;

public class Appliance {
    private String name;
    private double capacity;
    private double price;
    private String color;


    public Appliance() {
    }

    public Appliance(String name, double capacity, double price, String color) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Appliance appliance = (Appliance) o;

        if (Double.compare(appliance.capacity, capacity) != 0) return false;
        if (Double.compare(appliance.price, price) != 0) return false;
        if (name != null ? !name.equals(appliance.name) : appliance.name != null) return false;
        return color != null ? color.equals(appliance.color) : appliance.color == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(capacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Appliance{");
        sb.append("name='").append(name).append('\'');
        sb.append(", capacity=").append(capacity);
        sb.append(", price=").append(price);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
