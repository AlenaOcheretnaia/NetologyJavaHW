package ru.netology.shooter.weapon;

public class MachineGun extends Weapon {
    String name = "MachineGun";

    @Override
    public void shot() {
        System.out.println("Ta-Ta-Ta-Ta-Ta");
    }
    @Override
    public String toString() {
        return(name);
    }
}
