package com.B3r4ti0n;

import java.util.Scanner;

public class ColossalCave {

    public static void regle() {    //regle jeu colossal
        System.out.println("Bienvenu sur Colossal Cave\n"+ "\n"+
                "Ce jeu d’aventure est purement textuel. Son fonctionnement est simple :\n"+
                "Un paragraphe décrit le lieu où l'on se trouve, et l'on tape des instructions au clavier pour se déplacer ou résoudre des énigmes diverses.\n"+
                "Vous choisissez le premier lieu en fonction de son nombre. \n"+
                "Pour se déplacer il faut choisir N, S, O, E ou encore NO, NE.\n");

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
        boolean reboot = false;
        while ( reboot == false ){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bienvenu sur Colossal Cave" +"\n"+
                    "Veuillez choisir votre point de départ :" +"\n"+
                    "1/ Route" +"\n"+ "2/ Colline" +"\n"+ "3/ Building en brique" +"\n"+ "4/ Vallée " +"\n"+ "5/ Forêt " + "\n" + "q/ Retour menu");

                String depart = scanner.next();
                switch (depart){
                    case "1":
                        mouvement(1);
                        break;
                    case "2":
                        mouvement(2);
                        break;
                    case "3":
                        mouvement(3);
                        break;
                    case "4":
                        mouvement(4);
                        break;
                    case "5":
                        mouvement(5);
                        break;
                    case "q":
                        reboot = true;
                        break;
            }

           /* if (depart == Route || depart == Colline || depart == Building || depart == Vallee || depart == Foret) {
                mouvement(depart);
            }*/
        }

    }

    public static int mouvement(int depart){
        if (depart == 1) {  //Départ de la route
            System.out.println(" Vous êtes au bout de la route devant un petit immeuble en brique.\n"+
                    "Un petit ruisseau coule a côté du building en bas d’une rigole. \n");
            System.out.println("Choisit le prochain lieu :" +"\n"+
                    "A l'Ouest se trouve la Colline 'O' \n"+
                    "A l'Est se trouve le Building en brique 'E' \n"+
                    "Au Sud se trouve la Vallée 'S' \n"+
                    "Au Nord se trouve la Forêt 'N' ");
           String event = Function.scan();
            switch(event){
                case "O":
                    System.out.println("---------- Vous avancez vers l'Ouest ---------- \n");
                    System.out.println(" Vous êtes tout en haut d’une colline qui surplombe la ville,\n"+
                            "au loin vous voyez une ombre se déplacer a grande vitesse avec un grand couteau. \n");
                    break;
                case "E":
                    System.out.println("---------- Vous avancez vers l'Est ---------- \n");
                    System.out.println(" Vous êtes a l’intérieur d’un building en brique, un petit refuge pour les bêtes.\n"+
                            "Un homme git là au milieu d’une marre de sang. \n");
                    break;
                case "S":
                    System.out.println("---------- Vous avancez vers le Sud ---------- \n");
                    System.out.println("Vous êtes dans une vallée a coté d’un ruisseau.\n"+
                            "Un corps flotte là dans l’eau. \n");
                    break;
                case "N":
                    System.out.println("---------- Vous avancez vers le Nord ---------- \n");
                    System.out.println("Vous êtes dans la foret noire.\n"+
                            "Vous entendez des hurlements stridents. \n");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + event);
            }
            return 1;
        }

        if (depart == 2) {    //Départ de la colline
            System.out.println(" Vous êtes tout en haut d’une colline qui surplombe la ville,\n"+
                    "au loin vous voyez une ombre se déplacer a grande vitesse avec un grand couteau. \n");
            System.out.println("Choisit le prochain lieu :" +"\n"+
                    "Au Nord-Est se trouve la Forêt 'NO' ");
            String event = Function.scan();
            switch(event){
                case "NO":
                    System.out.println("---------- Vous avancez vers le Nord-Est ---------- \n");
                    System.out.println("Vous êtes dans la foret noire.\n"+
                            "Vous entendez des hurlements stridents. \n");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + event);
            }
            return 2;
        }

        if (depart == 3) {  //Départ du building
            System.out.println(" Vous êtes a l’intérieur d’un building en brique, un petit refuge pour les bêtes.\n"+
                    "Un homme git là au milieu d’une marre de sang. \n");
            System.out.println("Choisit le prochain lieu :" +"\n"+
                    "A l'Ouest se trouve la Route 'O' ");
            String event = Function.scan();
            switch(event){
                case "O":
                    System.out.println("---------- Vous avancez vers l'Ouest ---------- \n");
                    System.out.println(" Vous êtes au bout de la route devant un petit immeuble en brique.\n"+
                            "Un petit ruisseau coule a côté du building en bas d’une rigole. \n");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + event);
            }
            return 3;
        }

        if (depart == 4) {  //Départ de la Vallée
            System.out.println("Vous êtes dans une vallée a coté d’un ruisseau.\n"+
                    "Un corps flotte là dans l’eau. \n");
            System.out.println("Choisit le prochain lieu :" +"\n"+
                    "Au Nord se trouve la Route 'N' \n"+
                    "Au Nord-Ouest se trouve la Colline 'NO' ");
            String event = Function.scan();
            switch(event){
                case "N":
                    System.out.println("---------- Vous avancez vers le Nord ---------- \n");
                    System.out.println(" Vous êtes au bout de la route devant un petit immeuble en brique.\n"+
                            "Un petit ruisseau coule a côté du building en bas d’une rigole. \n");
                    break;
                case "NO":
                    System.out.println("---------- Vous avancez vers le Nord-Ouest ---------- \n");
                    System.out.println(" Vous êtes tout en haut d’une colline qui surplombe la ville,\n"+
                            "au loin vous voyez une ombre se déplacer a grande vitesse avec un grand couteau. \n");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + event);
            }
            return 4;
        }

        if (depart == 5) {  //Départ de la Forêt
            System.out.println("Vous êtes dans la foret noire.\n"+
                    "Vous entendez des hurlements stridents. \n");
            System.out.println("Choisit le prochain lieu :" +"\n"+
                    "Au Sud se trouve la Route 'S' ");
            String event = Function.scan();
            switch(event){
                case "S":
                    System.out.println("---------- Vous avancez vers le Sud ---------- \n");
                    System.out.println(" Vous êtes au bout de la route devant un petit immeuble en brique.\n"+
                            "Un petit ruisseau coule a côté du building en bas d’une rigole. \n");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + event);
            }
            return 5;
        }
        return 0;
    }
}
