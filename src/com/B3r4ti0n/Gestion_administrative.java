package com.B3r4ti0n;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Gestion_administrative implements Gestion{

    //public String [] rdv = new String[100];

    public static void gestion_rdv() {

    }
    public static void annuaire(){
        Scanner scanner = new Scanner(System.in);
        boolean reboot2 = false;
        boolean reboot = false;
        while (reboot != true){
            System.out.println("Bienvenue dans le menu de l'annuaire d'Hopitaux.");
            System.out.println("Taper 1 pour rajouter un entré dans l'annuaire.");
            System.out.println("Taper 2 pour rechercher dans l'annuaire.");
            System.out.println("Taper 3 pour retourner au menu principal.");
            String user = scanner.next();
            switch (user) {
                case "1":
                    while (reboot2 == false){
                        System.out.println("Rentre ton fichier 'input' ");///Users/admin/Desktop
                        String fileUser = Function.scan();
                        boolean bool = Function.createFile(fileUser);
                        if (bool == true){
                            Function.writerFile(fileUser);
                            reboot2 = true;
                        }
                    }

                    break;
                case "2":
                    break;
                case "q":
                    reboot = true ;
                    break;

            }
        }
    }
}
