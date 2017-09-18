package com.will.models;

public abstract class Soldier {
    private String name;
    private String rank;
    private int serialNumber;

    public Soldier(String name, String rank, int serialNumber) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
    }

    public void sleep() {
        System.out.println("Snore");
    }

    public void eat() {
        System.out.println("munch munch munch");
    }

    public void walk() {
        System.out.println("trudge");
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }
}
