package com.B3r4ti0n.Jeu;

public class Route {

    public static void run() {
        Chemin routeColline = new Chemin(0, 0, 0, 2);
        Chemin routeVallee = new Chemin(0, 4, 0, 0);
        Chemin routeForet = new Chemin(5, 0, 0, 0);
        Chemin routeBuilding = new Chemin(0, 0, 3, 0);

        System.out.println(" Vous êtes au bout de la route devant un petit immeuble en brique."  +"\n"+
                "Un petit ruisseau coule a côté du building en bas d’une rigole. ");
    }

}
