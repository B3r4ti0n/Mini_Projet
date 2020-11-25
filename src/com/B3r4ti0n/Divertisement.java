package com.B3r4ti0n;

import java.util.Scanner;

public class Divertisement {

    public static void menuJeu() {
        String ChoixMenu;
        System.out.println("-----menu-----" + "\n");
        System.out.println("1- Pour lancer le jeu, tapez '1'");
        System.out.println("2- Pour consulter les régles, tapez '2'");
        System.out.println("3- Pour retourner au MENU tapez '3'");
        Scanner menu = new Scanner(System.in);
        ChoixMenu = menu.next();

        while (!(ChoixMenu.equals("1") || ChoixMenu.equals("2") || ChoixMenu.equals("3"))) {
            System.out.println("-----menu-----" + "\n");
            System.out.println("1- Pour lancer le jeu, tapez '1'");
            System.out.println("2- Pour consulter les régles, tapez '2'");
            System.out.println("3- Pour retourner au MENU tapez '3'");
            ChoixMenu = menu.next();
        }

        if (ChoixMenu.equals("1")) {
            ColossalCave.jeu();
        } else if (ChoixMenu.equals("2")) {
            ColossalCave.regle();
        } else if (ChoixMenu.equals("3")) {
            Menu.run();
        }
    }


    public static void musique() {

    }
}
