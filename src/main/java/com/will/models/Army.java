package com.will.models;

import com.will.interfaces.FootSoldier;
import com.will.interfaces.LandAttack;

public class Army extends Soldier implements FootSoldier, LandAttack {

    public void speak() {
        System.out.println("Hooahh");
    }

    public void charge() {
        System.out.println("Attackkkk!");
    }

    public void shoot(){
        System.out.println("Bang Bang!");
    }

    public Army(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }
}
