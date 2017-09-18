package com.will;

import com.will.models.Army;
import com.will.models.Goblin;
import com.will.models.Marine;
import com.will.models.Navy;

public class Main {
    public static void main(String[] args) {

        Army soldier1 = new Army("Cotton Hill", "Colonel", 00576);
        soldier1.speak();
        soldier1.shoot();
        soldier1.charge();
        System.out.println("----------------------");

        Navy sailor1 = new Navy("Dan", "Lieutenant", 00432);
        sailor1.speak();
        System.out.println(sailor1.getRank() + " " + sailor1.getName());
        sailor1.launchMissile();
        System.out.println("----------------------");

        Marine marine1 = new Marine("Bonesaw", "Sergeant", 07456);
        marine1.speak();
        System.out.println(marine1.getName());
        marine1.charge();
        marine1.shoot();
        System.out.println("----------------------");

        Goblin johnny = new Goblin();
        johnny.speak();
    }
}
