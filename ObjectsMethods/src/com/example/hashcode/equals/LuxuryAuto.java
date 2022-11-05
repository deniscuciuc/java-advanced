package com.example.hashcode.equals;

public class LuxuryAuto {

    private String model;
    private int manufactureYear;
    private int price;

    public LuxuryAuto(String model, int manufactureYear, int price) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int result = model == null ? 0 : model.hashCode();
        // multiply fields with 31 or 29 make a trick to avoid collision
        result +=  31 * manufactureYear;
        result +=  31 * price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        LuxuryAuto auto = (LuxuryAuto) obj;

        if (manufactureYear != auto.manufactureYear || price != auto.price) return false;
        return model.equals(auto.model);
    }
}
