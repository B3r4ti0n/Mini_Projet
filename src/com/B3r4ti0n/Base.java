package com.B3r4ti0n;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Base implements Gestion{

    public static void annuaire(){
        Scanner scanner = new Scanner(System.in);
        boolean reboot2 = false;
        boolean reboot = false;
        while (reboot != true){
            System.out.println("Bienvenue dans le menu de l'annuaire d'Hopitaux.");
            System.out.println("Taper 1 pour rajouter ou rechercher un entré dans l'annuaire.");
            System.out.println("Taper q pour retourner au menu principal.");
            String user = scanner.next();
            switch (user) {
                case "1":
                    while (reboot2 == false){
                        System.out.println("rajouter 1 ou rechercher 2 ou quitter q ");
                        String addUser = Function.scan();
                        switch (addUser){
                            case "1":
                                System.out.println("Rentre ton fichier 'input' ");///Users/admin/Desktop
                                String fileUser = Function.scan();
                                boolean bool = Function.createFile(fileUser);
                                if (bool == true){
                                    Function.writerFile(fileUser);
                                    reboot2 = true;
                                }
                                break;
                            case "2": System.out.println("Rentre ton fichier 'input' ");///Users/admin/Desktop
                                String yoUser = Function.scan();
                                Function.readFile(yoUser);
                                break;
                            case "q":
                                reboot2 = true;
                                break;

                        }


                    }

                    break;
                case "q":
                    reboot = true ;
                    break;

            }
        }
    }
}
