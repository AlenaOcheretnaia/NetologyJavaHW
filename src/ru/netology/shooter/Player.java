package ru.netology.shooter;

import ru.netology.shooter.weapon.*;

class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private final Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
            new Gun(),
            new MachineGun(),
            new RPG(),
            new WaterGun()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot >= getSlotsCount() || slot < 0 )
            throw new IllegalArgumentException("Slot is out of boundary of weaponSlots");

        // TODO проверить на выход за границы
        // выбросить IllegalArgumentException, если значение slot некорректно

        Weapon selectedWeapon = weaponSlots[slot];
        System.out.print(selectedWeapon.toString() + ": ");
        selectedWeapon.shot();
    }
}