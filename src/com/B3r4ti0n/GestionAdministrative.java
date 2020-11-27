package com.B3r4ti0n;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GestionAdministrative {
    private static List<String> listeRDV = new ArrayList();
    private static List<String> listeChambre = new ArrayList();

    //Menu de selection des options de gestion
    public static void gestion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 RDV");
        System.out.println("2 Chambres");
        System.out.println("3 Patients");
        System.out.println("4 Praticien");
        System.out.println("5 Menu");

        int saisieChoix = scanner.nextInt();

        switch (saisieChoix) {
            case 1:
                gestionRdv();
                break;
            case 2:
                gestionChambre();
                break;
            case 3:
                Patients.patients();
                break;
            case 4:
                Praticien.menuPraticien();
                break;
            case 5:
                Menu.run();
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }

    //menu de gestion des rdv
    public static void gestionRdv() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 pour ajouter un RDV");
        System.out.println("2 pour supprimer un RDV");
        System.out.println("3 pour modifier RDV");
        System.out.println("4 pour afficher la liste des RDV");
        System.out.println("5 pour afficher les patients enregister");
        System.out.println("6 pour pour retourner au menu gestion");
        int saisieChoix = scanner.nextInt();
        switch(saisieChoix) {
            case 1:
                ajouterRDV();
                break;
            case 2:
                supprimerRDV();
                break;
            case 3:
                modifierRDV();
                break;
            case 4:
                afficherRDV();
                break;
            case 5:
                Patients.afficherPatients();
                break;
            case 6:
                gestion();
                break;
            default:
                System.out.println("invalide");
        }

    }
    //menu de gestion des chambres
    public static void gestionChambre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 pour ajouter une chambre");
        System.out.println("2 pour supprimer une chambre");
        System.out.println("3 pour modifier une chambre");
        System.out.println("4 pour afficher la liste des chambres");
        System.out.println("5 pour afficher les chambres enregister");
        System.out.println("6 pour pour retourner au menu gestion");
        int saisieChoix = scanner.nextInt();
        switch(saisieChoix) {
            case 1:
                ajouterChambre();
                break;
            case 2:
                supprimerChambre();
                break;
            case 3:
                modifierChambre();
                break;
            case 4:
                afficherChambre();
                break;
            case 5:
                Patients.afficherPatients();
                break;
            case 6:
                gestion();
                break;
            default:
                System.out.println("invalide");
        }

    }

    //permet d'afficher les rdv enregistrer
    public static void afficherRDV() {
        Iterator var0 = listeRDV.iterator();

        while(var0.hasNext()) {
            String monRDV = (String)var0.next();
            System.out.println(monRDV);
        }

        gestionRdv();
    }

    //permet d'ajouter un rdv
    public static void ajouterRDV() {
        Scanner scanner = new Scanner(System.in);

        int saisieChoix;
        do {
            System.out.println("indiquez l'heure du rdv puis la date jj/mm/aa puis le prénom et le nom du patient :");
            String saisieInfo = scanner.next();
            listeRDV.add(saisieInfo);
            System.out.println("RDV enregistrer  !");
            System.out.println("souhaitez vous enregistrer un autre patient ? 1 pour oui 2 pour non ");
            saisieChoix = scanner.nextInt();
        } while(saisieChoix == 1);

        gestionRdv();
    }

    //permet de modifier un rdv
    public static void modifierRDV() {
        Scanner scanner = new Scanner(System.in);

        int saisieChoix;
        do {

            System.out.println("quel RDV souhaitez vous modifier ? Indiquez sont numéro");
            int indexRDV = scanner.nextInt();
            System.out.println("indiquez l'heure du rdv puis la date jj/mm/aa puis le prénom et le nom du nouveau RDV :");
            String saisieInfo = scanner.next();
            listeRDV.set(indexRDV, saisieInfo);
            System.out.println("le RDV à bien été modifier !");
            System.out.println("souhaitez vous modifer un autre RDV? 1 pour oui 2 pour non ");
            saisieChoix = scanner.nextInt();
        } while(saisieChoix == 1);

        gestionRdv();
    }

    //permet de supprimer un rdv
    public static void supprimerRDV() {
        Scanner scanner = new Scanner(System.in);

        int saisieChoix;
        do {

            System.out.println("quel RDV souhaitez vous supprimer ? Indiquez sont prénom nom");
            String saisieInfo = scanner.next();
            int indexRDV = listeRDV.indexOf(saisieInfo);
            listeRDV.remove(indexRDV);
            System.out.println("le RDV à bien été suprimé !");
            System.out.println("souhaitez vous suprimer un autre RDV ? 1 pour oui 2 pour non ");
            saisieChoix = scanner.nextInt();
        } while(saisieChoix == 1);

        gestionRdv();
    }

    //permet d'afficher les chambres
    public static void afficherChambre() {
        Iterator var0 = listeChambre.iterator();

        while(var0.hasNext()) {
            String maChambre = (String)var0.next();
            System.out.println(maChambre);
        }

        gestionChambre();
    }

    //permet d'ajouoter des chambres
    public static void ajouterChambre() {
        Scanner scanner = new Scanner(System.in);

        int saisieChoix;
        do {
            System.out.println("indiquez le numéro de la chambre puis le prénom et le nom du patient :");
            String saisieInfo = scanner.next();
            listeChambre.add(saisieInfo);
            System.out.println("Chambre enregistrer !");
            System.out.println("souhaitez vous enregistrer une autre chambre ? 1 pour oui 2 pour non ");
            saisieChoix = scanner.nextInt();
        } while(saisieChoix == 1);

        gestionChambre();
    }

    //permet de modifier des chambres
    public static void modifierChambre() {
        Scanner scanner = new Scanner(System.in);

        int saisieChoix;
        do {
            System.out.println("quel chambre souhaitez vous modifier ? Indiquez sont numéro");
            int indexRDV = scanner.nextInt();
            System.out.println("saisisez le le numéro de la chambre puis le prénom et le nom :");
            String saisieInfo = scanner.next();
            listeChambre.set(indexRDV, saisieInfo);
            System.out.println("La chambre à bien été modifier !");
            System.out.println("souhaitez vous modifer une autre chambre ? 1 pour oui 2 pour non ");
            saisieChoix = scanner.nextInt();
        } while(saisieChoix == 1);

        gestionChambre();
    }

    //permet de supprimer des chambres
    public static void supprimerChambre() {
        Scanner scanner = new Scanner(System.in);

        int saisieChoix;
        do {

            System.out.println("quelle chambre souhaitez vous supprimer ? Indiquez sont prénom nom");
            String saisieInfo = scanner.next();
            int indexRDV = listeChambre.indexOf(saisieInfo);
            listeChambre.remove(indexRDV);
            System.out.println("la chambre à bien été suprimé !");
            System.out.println("souhaitez vous suprimer une autre chambre ? 1 pour oui 2 pour non ");
            saisieChoix = scanner.nextInt();
        } while(saisieChoix == 1);
        gestionChambre();
    }
}