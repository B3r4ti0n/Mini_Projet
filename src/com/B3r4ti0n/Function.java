package com.B3r4ti0n;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Function {

    public static String scan(){
        Scanner scanner = new Scanner(System.in);
        String user = scanner.next();
        return user ;
    }
    public static boolean createFile(String scanU){

        String fileD = scanU + "/listing.txt";
        File file = new File(fileD);
        if(!file.exists()){
            try {
                file.createNewFile();
                System.out.println("le fichier " + file + " a été créer");
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("Ce fichier existe déjà. Voulez-vous vraiment continue avec ce fichier ?");
            String user = scan();
            switch (user){
                case "yes":
                    System.out.println("Fichier bien selectioner ");
                    break;
                case "non":
                    System.out.println("Retour à l'étape précédente");
                    return false;
            }
        }
        return false;
    }
   public static void writerFile(String scanU){
        String user = scanU + "/listing.txt";
       System.out.println(user);
       try {
           FileWriter writer = new FileWriter(user);
           BufferedWriter bw = new BufferedWriter(writer);
           bw.write(user);
           bw.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}
