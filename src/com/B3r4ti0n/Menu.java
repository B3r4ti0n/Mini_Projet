package com.B3r4ti0n;

import java.util.Scanner;

public class Menu {

    public static void run() {
        String ChoixMenu;
        System.out.println("-----menu-----" + "\n");
        System.out.println("1- Pour consulter ou prendre un RDV tapez '1'");
        System.out.println("2- Pour reserver une chambre tapez '2'");
        System.out.println("3- Pour lancer le jeu tapez '3'");
        System.out.println("4- Pour lancer de la musique tapez '4'");
        Scanner menu = new Scanner(System.in);
        ChoixMenu = menu.next();

        while (!(ChoixMenu.equals("1") || ChoixMenu.equals("2") || ChoixMenu.equals("3") || ChoixMenu.equals("4"))) {
            System.out.println("-----menu-----" + "\n");
            System.out.println("1- Pour consulter ou prendre un RDV tapez '1'");
            System.out.println("2- Pour reserver une chambre tapez '2'");
            System.out.println("3- Pour lancer le jeu tapez '3'");
            System.out.println("4- Pour lancer de la musique tapez '4'");
            ChoixMenu = menu.next();
        }

        if (ChoixMenu.equals("1")) {
            Gestion_administrative.gestion_rdv();
        } else if (ChoixMenu.equals("2")) {
            Patients.patients();
        } else if (ChoixMenu.equals("3")) {
            Divertisement.Jeu();
        } else if (ChoixMenu.equals("4")) {
            Divertisement.musique();
        }
    }
}
