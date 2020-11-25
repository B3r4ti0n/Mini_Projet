package com.B3r4ti0n.Jeu;

public class Vallee {

    public static void run() {
        Chemin valleeRoute = new Chemin(1, 0, 0, 0);
        Chemin valleeColline = new Chemin(2, 0, 0, 2);

        System.out.println("Vous êtes dans une vallée a coté d’un ruisseau." +"\n"+
                "Un corps flotte là dans l’eau.");
    }
}
