package com.B3r4ti0n;

import java.util.Scanner;

public class ColossalCave {

    public static void regle() {
        System.out.println("regles blablablabla");

        String ChoixMenu;
        System.out.println("Pour Jouer tapez '1'");
        Scanner menu = new Scanner(System.in);
        ChoixMenu = menu.next();

        while (!(ChoixMenu.equals("1") || ChoixMenu.equals("2") || ChoixMenu.equals("3"))) {
            System.out.println("Pour Jouer tapez '1'");
            ChoixMenu = menu.next();
        }

        if (ChoixMenu.equals("1")) { ColossalCave.jeu(); }
    }

    public static void jeu() {
        int Route = 1;
        int Colline = 2;
        int Building = 3;
        int Vallee = 4;
        int Foret = 5;
        Scanner scanner = new Scanner(System.in);

        // 0 DEPART  //  N, S, E, W
        // 1 ROUTE -> 2, 3, 4, 5 / W, E, S, N
        // 2 COLLINE -> 5 / N&E
        // 3 BUILDING EN BRIQUE -> 1 / W
        // 4 VALLÉE -> 1, 2 / N, O&N
        // 5 FORET -> 1 / S

        System.out.println("Bienvenu sur Colossal Cave" +"\n"+
                "Veuillez choisir votre point de départ :" +"\n"+
                "1/ Route" +"\n"+ "2/ Colline" +"\n"+ "3/ Building en brique" +"\n"+ "4/ Vallée " +"\n"+ "5/ Forêt");
        int depart = scanner.nextInt();
        if (depart == Route){
            com.B3r4ti0n.Jeu.Route.run();
        } else if (depart == Colline) {
            com.B3r4ti0n.Jeu.Colline.run();
        } else if (depart == Building) {
            com.B3r4ti0n.Jeu.Building.run();
        } else if (depart == Vallee) {
            com.B3r4ti0n.Jeu.Vallee.run();
        } else if (depart == Foret) {
            com.B3r4ti0n.Jeu.Foret.run();
        } else if (depart == Route) {
            com.B3r4ti0n.Jeu.Route.run();
        }
    }
}
