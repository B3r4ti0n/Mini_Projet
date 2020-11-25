package com.B3r4ti0n;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patients {
    private static List<String>  listePatients = new ArrayList<>();

    public static List<String> patients() {

        Scanner scanner = new Scanner( System.in );
        int saisieChoix;
        String saisiePatient;

        //Ajout delements dans la liste
        ajouterPatients("Michelle Dupres");
        ajouterPatients("José Lepauvre");
        ajouterPatients("Sangoku");
        ajouterPatients("Ninho");

        do{
            System.out.println("1 pour ajouter un patient");
            System.out.println("2 pour supprimer un patient");
            System.out.println("3 pour modifier patient");
            System.out.println("4 pour afficher la liste des patients");
            System.out.println("5 retour ");
            saisieChoix = scanner.nextInt();


            if (saisieChoix == 1) {
                do {
                    System.out.println("saisisez le prénom puis le nom du patient :");
                    saisiePatient = scanner.next();
                    ajouterPatients(saisiePatient);
                    System.out.println("patient enregistrer  !");

                    System.out.println("souhaitez vous enregistrer un autre patient ? 1 pour oui 2 pour non ");
                    saisieChoix = scanner.nextInt();
                }while( saisieChoix == 1);
            }

            else if (saisieChoix == 2) {
                do {
                    afficherPatients();
                    System.out.println("quel patien souhaitez vous supprimer ? Indiquez sont prénom nom");
                    saisiePatient = scanner.next();
                    int indexPatient = listePatients.indexOf(saisiePatient);
                    supprimerPatients(indexPatient);
                    System.out.println("le patient à bien été suprimé !");

                    System.out.println("souhaitez vous suprimer un autre patient ? 1 pour oui 2 pour non ");
                    saisieChoix = scanner.nextInt();
                }while( saisieChoix == 1);
            }

            else if (saisieChoix == 3) {
                do {
                    afficherPatients();
                    System.out.println("quel patien souhaitez vous modifier ? Indiquez sont prénom nom");
                    saisiePatient = scanner.next();
                    int indexPatient = listePatients.indexOf(saisiePatient);
                    System.out.println("saisisez le prénom puis le nom du nouveau patient :");
                    saisiePatient = scanner.next();
                    modifierPatients(indexPatient, saisiePatient);
                    System.out.println("le patient à bien été modifier !");

                    System.out.println("souhaitez vous suprimer un autre patient ? 1 pour oui 2 pour non ");
                    saisieChoix = scanner.nextInt();
                }while( saisieChoix == 1);
            }

            else if (saisieChoix == 4) {
                afficherPatients();
            }

            else if (saisieChoix == 5) {
                System.out.println("retour");
            }
        }while (saisieChoix !=5);

        return listePatients;
    }
    public static void afficherPatients(){
        for (String  maVille:listePatients) {
            System.out.println(maVille);
        }
    }

    public static void ajouterPatients(String patients){
        listePatients.add(patients);
    }

    public static void modifierPatients(int index, String ville){
        listePatients.set(index, ville);
    }

    public static int getListeSize(){
        return listePatients.size();
    }

    public static void supprimerPatients(int index){
        listePatients.remove(index);
    }
}


