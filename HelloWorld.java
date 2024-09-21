package com.sample.hello;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strlstContacts = new ArrayList<String>();
        System.out.println("Application Started");
        System.out.println("---------------------------");
        for(int i = 1 ; i != 0; i++) {
            System.out.println("----ContactMenu-----");
            System.out.println("1.Add A Number");
            System.out.println("2.Print All Numbers");
            System.out.println("3.Exit");
            System.out.println("------------");
            String strUserInput = scanner.nextLine();
            switch (strUserInput) {
                case "1" -> {
                    System.out.println("Insert the Name:");
                    String strContactName = scanner.nextLine();
                    System.out.println("Insert the Number:");
                    String strContactNumber = scanner.nextLine();
                    strlstContacts.add(strContactName + "^" + strContactNumber);
                }
                case "2" -> {
                    int k = 1;
                    for (String strContacts : strlstContacts) {
                        System.out.println(k + "." + strContacts.split("\\^")[0] + " -- " + strContacts.split("\\^")[1]);
                        k++;
                    }
                }
                case "3" -> {
                    System.out.println("------Auf Wiedersehen------");
                    i = -1;
                }
                default -> {
                    System.out.println("Invalid Input.");
                    System.out.println("Please Try Again.");
                }
            }
        }
        scanner.close();
    }
}
