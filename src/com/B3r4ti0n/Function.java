package com.B3r4ti0n;


import java.io.*;
import java.util.Scanner;

public class Function {

    public static String scan(){
        Scanner scanner = new Scanner(System.in);
        String user = scanner.next();
        return user ;
    }
    public static boolean createFile(String scanU){

        String folderD = scanU + "/dataBase";
        File folder = new File(folderD);
        if(!folder.exists()){
           folder.mkdir();
            System.out.println("Votre dossier database à bien été créer: " + folder);
        }else {
            System.out.println("Ce fichier existe déjà. Voulez-vous vraiment continue avec ce fichier ?");
            String user = scan();
            switch (user){
                case "oui":
                    System.out.println("Fichier bien selectioner ");
                    return true;
                case "non":
                    System.out.println("Retour à l'étape précédente");
                    return false;
            }
        }
        return false;
    }
    public static boolean addFile(String scanU){
        String folderD = scanU + "/dataBase";
        System.out.println("Rentre le nom de l'hopital");

        String user = scan();
        String folderDComp = folderD + "/" + user;
        File file = new  File(folderDComp);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("Ce fichier existe déjà. Voulez-vous vraiment continue avec ce fichier ?");
            String user2 = scan();
            switch (user){
                case "oui":
                    System.out.println("Fichier bien selectioner ");
                    return true;
                case "non":
                    System.out.println("Retour à l'étape précédente");
                    return false;
            }
        }
        return false;
    }
   public static void writerFile(String scanU){
        String user = scanU + "/listing.txt";
       try {
           FileWriter writer = new FileWriter(user);
           BufferedWriter bw = new BufferedWriter(writer);
           System.out.println("Rentre le nom de l'hôpital.");
           String name = scan();
           System.out.println("Rentre le adresse de l'hôpital.");
           String adress = scan();
           System.out.println("rentre la spécialité de l'hôpital");
           String speciality = scan();

           bw.write(  name + "#" + adress + "#" + speciality );
           bw.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
   public static void readFile(String scanU){
        String user = scanU + "/listing.txt";

       try {
           BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(user), "UTF-8"));
           String line = br.readLine();
           while ( line != null){
               System.out.println(line);
               line = br.readLine();
           }
           br.close();

       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
   public static void playSound(){
        Audio son = new Audio();
       System.out.println("tape 1 pour lancer la music");
        String user = scan();
        switch (user){
            case "1":
                son.start();
                break;
        }
        System.out.println("Tape 2 pour l'arrêter ou n'importe quel touche pour revenir au menu.");
        String user2 = scan();

        switch (user2){
            case "2":
                son.stop();
                break;
            default:
                son.stop();
        }


   }

}
