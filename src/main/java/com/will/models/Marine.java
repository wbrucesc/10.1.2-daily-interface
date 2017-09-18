package com.will.models;

import com.will.interfaces.FootSoldier;
import com.will.interfaces.LandAttack;

public class Marine extends Soldier implements FootSoldier, LandAttack{

    public Marine(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }




    public void speak() {
        System.out.println("Oohrah");
    }

    public void charge() {
        System.out.println("This is sparta!!!");
    }

    public void shoot() {
        System.out.println("clack clack clack");
    }


}
