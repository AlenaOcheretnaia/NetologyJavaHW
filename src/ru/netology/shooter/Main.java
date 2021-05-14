package ru.netology.shooter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        Player player = new Player();
        int slot;
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("Player has %d weapon slots,"
                        + " enter number to shoot,"
                        + " -1 to exit%n",
                player.getSlotsCount()
        );

        while (true) {
            slot = myScan.nextInt();
            if (slot == -1) break;
            player.shotWithWeapon(slot);
        }

        System.out.println("Game over!");
    }
}
