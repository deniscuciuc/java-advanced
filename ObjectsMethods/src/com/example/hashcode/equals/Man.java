package com.example.hashcode.equals;

public class Man {

    private String noseSize;
    private String eyesColor;
    private String hairCut;
    private boolean scars;
    private int dnaCode;

    public Man(String noseSize, String eyesColor, String hairCut, boolean scars, int dnaCode) {
        this.noseSize = noseSize;
        this.eyesColor = eyesColor;
        this.hairCut = hairCut;
        this.scars = scars;
        this.dnaCode = dnaCode;
    }

    public String getNoseSize() {
        return noseSize;
    }

    public void setNoseSize(String noseSize) {
        this.noseSize = noseSize;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getHairCut() {
        return hairCut;
    }

    public void setHairCut(String hairCut) {
        this.hairCut = hairCut;
    }

    public boolean isScars() {
        return scars;
    }

    public void setScars(boolean scars) {
        this.scars = scars;
    }

    public int getDnaCode() {
        return dnaCode;
    }

    public void setDnaCode(int dnaCode) {
        this.dnaCode = dnaCode;
    }

    @Override
    public int hashCode() {
        return dnaCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Man man = (Man) obj;
        return dnaCode == man.dnaCode;
    }
}
