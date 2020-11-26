package com.B3r4ti0n;

import com.B3r4ti0n.Jeu.Chemin;

import java.util.Scanner;

public class ColossalCave {

    public static void regle() {
        System.out.println("Bienvenu sur Colossal Cave\n"+ "\n"+
                "Ce jeu d’aventure est purement textuel. Son fonctionnement est simple :\n"+
                "Un paragraphe décrit le lieu où l'on se trouve, et l'on tape des instructions au clavier pour se déplacer ou résoudre des énigmes diverses.\n");

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

        Chemin buildingRoute = new Chemin(0, 0, 0, Route);
        Chemin foretRoute = new Chemin(0, Route, 0, 0);
        Chemin collineForet = new Chemin(Foret, 0, Foret, 0);
        Chemin valleeRoute = new Chemin(Route, 0, 0, 0);
        Chemin valleeColline = new Chemin(Colline, 0, 0, Colline);
        Chemin routeColline = new Chemin(0, 0, 0, Colline);
        Chemin routeVallee = new Chemin(0, Vallee, 0, 0);
        Chemin routeBuilding = new Chemin(0, 0, Building, 0);
        Chemin routeForet = new Chemin(Foret, 0, 0, 0);

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
            //com.B3r4ti0n.Jeu.Route.run();
            mouvement(depart);
        } else if (depart == Colline) {
            com.B3r4ti0n.Jeu.Colline.run();
        } else if (depart == Building) {
            com.B3r4ti0n.Jeu.Building.run();
        } else if (depart == Vallee) {
            com.B3r4ti0n.Jeu.Vallee.run();
        } else if (depart == Foret) {
            com.B3r4ti0n.Jeu.Foret.run();
        }
    }
    public static int mouvement(int depart){
        if(depart == 1){
            System.out.println("rentre de chemin");
           String event = Function.scan();
            switch(event){
                case "2":
                    System.out.println(" Vous êtes au bout de la route devant un petit immeuble en brique.\n"+
                            "Un petit ruisseau coule a côté du building en bas d’une rigole.");
                    break;
                case "3":
                    System.out.println("");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + event);
            }
            return 1;
        }
        return 0;
    }
}
