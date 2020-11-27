package com.B3r4ti0n;

import java.util.Scanner;

public class Menu {

    public static void run() {
        boolean reboot = false;
        while (reboot == false){
            String ChoixMenu;
            System.out.println("-----MENU PRINCIPAL-----" + "\n");
            System.out.println("1- Gestion administrative taper '1' ");
            System.out.println("2- Pour lancer le jeu tapez '2' ");
            System.out.println("3- Pour lancer de la musique tapez '3' ");
            System.out.println("4- pour lancer l'annuaire tapez '4' ");
            System.out.println("q- pour quitter l'application taper 'q' ");
            Scanner menu = new Scanner(System.in);
            ChoixMenu = menu.next();

            switch (ChoixMenu){
                case "1":
                    GestionAdministrative.gestion();
                    break;
                case "2":
                    Divertisement.menuJeu();
                    break;
                case "3":
                    Function.playSound();
                    break;
                case "4":
                    Base.annuaire();
                    break;
                case "q":
                    reboot = true;
                    break;
            }
        }
    }
}
