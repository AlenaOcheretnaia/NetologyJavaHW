package ru.netology.shooter.weapon;

public class Gun extends Weapon {
    String name = "Gun";

    @Override
    public void shot() {
        System.out.println("Piu-piu");
    }

    @Override
    public String toString() {
        return(name);
    }
}
