package com.B3r4ti0n;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Menu.run();
        Scanner scanner = new Scanner(System.in);
        boolean reboot2 = false;
        boolean reboot = false;
        while (reboot != true){
            String user = scanner.next();
            Hospital hospital;
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