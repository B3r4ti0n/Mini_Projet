package com.B3r4ti0n;

import java.util.Scanner;

public class Menu {

    public static void run() {
        String ChoixMenu;
        System.out.println("-----menu-----" + "\n");
        System.out.println("1- Pour consulter/modifier la liste des patients ou prendre un RDV tapez '1'");
        System.out.println("2- Pour reserver une chambre tapez '2'");
        System.out.println("3- Pour lancer le jeu tapez '3'");
        System.out.println("4- Pour lancer de la musique tapez '4'");
        Scanner menu = new Scanner(System.in);
        ChoixMenu = menu.next();

        while (!(ChoixMenu.equals("1") || ChoixMenu.equals("2") || ChoixMenu.equals("3") || ChoixMenu.equals("4"))) {
            System.out.println("-----menu-----" + "\n");
            System.out.println("1- Pour consulter/modifier la liste des patients ou prendre un RDV tapez '1'");
            System.out.println("2- Pour reserver une chambre tapez '2'");
            System.out.println("3- Pour lancer le jeu tapez '3'");
            System.out.println("4- Pour lancer de la musique tapez '4'");
            ChoixMenu = menu.next();
        }
        switch (ChoixMenu){
            case "1":
                Gestion_administrative.gestion_rdv();
                break;
            case "2":
                Patients.patients();
                break;
            case "3":
                Divertisement.menuJeu();
                break;
            case "4":
                Divertisement.musique();
                break;
        }
    }
}
