package ru.netology.shooter.weapon;

public class WaterGun extends Weapon {
    String name = "WaterGun";

    @Override
    public void shot() {
        System.out.println("Splash");
    }
    @Override
    public String toString() {
        return(name);
    }
}
