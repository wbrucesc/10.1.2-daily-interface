package com.will.models;

import com.will.interfaces.FootSoldier;
import com.will.interfaces.SeaAttack;

public class Navy extends Soldier implements FootSoldier, SeaAttack{

    public Navy(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public void speak() {
        System.out.println("Hooyah");
    }

    public void launchMissile() {
        System.out.println("Direct Hit!");
    }
}
