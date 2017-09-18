package com.will.interfaces;

public interface FootSoldier {
    default public void speak() {
        System.out.println("I am ready to fight!");
    }
}
