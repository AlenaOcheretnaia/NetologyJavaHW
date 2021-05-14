package ru.netology.shooter.weapon;

public class RPG extends Weapon {
    String name = "RPG";

    @Override
    public void shot() {
        System.out.println("Booooom");
    }
    @Override
    public String toString() {
        return(name);
    }
}
