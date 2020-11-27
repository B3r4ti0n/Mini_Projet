package com.B3r4ti0n;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Praticien {
    private static List<String> listePraticien = new ArrayList();



    public static void menuPraticien() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        System.out.println("Seul un docteur peut acceder à ces données sensible");
        System.out.println("1 pour ajouter un praticien");
        System.out.println("2 pour supprimer un praticien");
        System.out.println("3 pour modifier un praticien");
        System.out.println("4 pour afficher la liste des praticien");
        System.out.println("5 pour pour retourner au menu gestion");
        int saisieChoix = scanner.nextInt();

        switch (saisieChoix) {
            case 1: ajouter();
            break;
            case 2 : Praticien.supprimer();
            break;
            case 3 : modifier();
            break;
            case 4 : afficher();
            break;
            case 5 : GestionAdministrative.gestion();
            break;
            default:
                System.out.println("invalid");
        }
    }



    //permet d'afficher les praticiens
    public static void afficher() {
        for (String  monPraticien:listePraticien) {
            System.out.println(monPraticien);
        }
        menuPraticien();
    }

    //permet d'ajouoter des praticiens
    public static void ajouter() {
        Scanner scanner = new Scanner(System.in);

        int saisieChoix;
        do {
            System.out.println("Nom du praticien suivis de ca fonction");
            String saisieInfo = scanner.next();
            listePraticien.add(saisieInfo);
            System.out.println("enregistrer !");
            System.out.println("souhaitez vous enregistrer une autre praticien ? 1 pour oui 2 pour non ");
            saisieChoix = scanner.nextInt();
        } while(saisieChoix == 1);

        menuPraticien();
    }

    //permet de modifier des praticiens
    public static void modifier() {
        Scanner scanner = new Scanner(System.in);

        int saisieChoix;
        do {

            System.out.println("quel praticien  souhaitez vous modifier ? Indiquez sont numéro");
            int indexRDV = scanner.nextInt();
            System.out.println("saisisez le nom du praticien suivis de ca fonction :");
            String saisieInfo = scanner.next();
            listePraticien.set(indexRDV, saisieInfo);
            System.out.println("La praticien à bien été modifier !");
            System.out.println("souhaitez vous modifer un autre praticien ? 1 pour oui 2 pour non ");
            saisieChoix = scanner.nextInt();
        } while(saisieChoix == 1);

        menuPraticien();
    }

    //permet de supprimer des praticiens
    public static void supprimer() {
        Scanner scanner = new Scanner(System.in);

        int saisieChoix;
        do {

            System.out.println("quel praticien souhaitez vous supprimer ? Indiquez sont prénom nom");
            String saisieInfo = scanner.next();
            int indexRDV = listePraticien.indexOf(saisieInfo);
            listePraticien.remove(indexRDV);
            System.out.println("le praticien à bien été suprimé !");
            System.out.println("souhaitez vous suprimer un autre praticien ? 1 pour oui 2 pour non ");
            saisieChoix = scanner.nextInt();
        } while(saisieChoix == 1);
        menuPraticien();
    }
}