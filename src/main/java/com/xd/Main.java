package com.xd;

import java.io.*;


import java.util.Scanner;

import static com.xd.Reports.*;
import static com.xd.Transaction.addDeposit;
import static com.xd.Transaction.addPayment;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayHomeMenu();
    }


    private static void displayHomeMenu() {
        String input;
        do {
            System.out.println("| Home |");
            System.out.println("--------------------------------------------------------");
            System.out.println("\tD) Add deposit");
            System.out.println("\tP) Make a Payment ");
            System.out.println("\tL) Ledger");
            System.out.println("\tE) Exit");
            input = scanner.nextLine();


            switch (input.toUpperCase()) {
                case "D":

                    addDeposit();
                    break;
                case "P":

                    addPayment();

                    break;
                case "L":

                    displayLedger();

                    break;
                case "E":

                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid input!");


            }
        } while (!input.equalsIgnoreCase("E"));
    }

    public static void displayLedger() {//change to display
        String subInput;
        do {
            System.out.println("| Ledger |");
            System.out.println("--------------------------------------------------------");
            System.out.println("\tA) Show all ");
            System.out.println("\tD) Show all Deposits");
            System.out.println("\tP) Show all Payments ");
            System.out.println("\tR) Reports");
            subInput = scanner.nextLine();

            switch (subInput.toUpperCase()) {
                case "A":
                    displayAllEntries();

                    break;
                case "D":
                    displayAllDeposits();
                    //Display all Deposits (positive)
                    break;
                case "L":
                    displayAllPayments();
                    //Display all payments (negative)
                    break;
                case "B":
                    displayHomeMenu();
                    break;
                case "R":
                    reports();
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        } while (!subInput.equalsIgnoreCase("B"));
    }

    private static void displayAllEntries() {
        try {
            FileReader transactiontext = new FileReader("./src/main/java/com/xd/Transactions.txt");
            BufferedReader bufferedReader = new BufferedReader(transactiontext);

            String input;

            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void displayAllDeposits() {
        try {
            FileReader transactiontext = new FileReader("./src/main/java/com/xd/Transactions.txt");
            BufferedReader bufferedReader = new BufferedReader(transactiontext);

//            String input;
//            if(negativePaymentAmount<0)
//                while ((input = bufferedReader.readLine()) != null) {
//                System.out.println(input);
//            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void displayAllPayments() {
//            FileReader fileReader = new FileReader("./src/main/java/com/xd/Transactions.txt");
//
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String linesFromFile;
//
//            while ((linesFromFile = bufferedReader.readLine()) != null) {
//
//                String[] numbers = linesFromFile.split("\\s-");
//                boolean hasNegative = true;
//
//                for (String number : numbers) {
//                    int num = Integer.parseInt(number);
//                    if (num < 0) {
//                        hasNegative = true;
//                        break;
//                    }
//                }
//            }
//            fileReader.close();
//            bufferedReader.close();
    }


    public static void reports() {
        String subInput;
        do {
            System.out.println("| Reports |");
            System.out.println("--------------------------------------------------------");
            System.out.println("\tA) Month to Date ");
            System.out.println("\tB) Previous Month");
            System.out.println("\tC) Year to date ");
            System.out.println("\tD) Previous year");
            System.out.println("\tE) Search by vendor");
            System.out.println("\tF) Go back to report menu");
            System.out.println("\tG) Go back to home menu");
            System.out.println("\tH) Exit");
            subInput = scanner.nextLine();

            switch (subInput) {
                case "A":
                    monthToDate();
                    //Month to Date
                    break;
                case "B":
                    previousMonth();
                    //Display all from previous month
                    break;
                case "C":
                    yearToDate();
                    //Display all from Jan 1st to now
                    break;
                case "D":
                    previousYear();
                    break;
                case "E":
                    searchByVendor();
                    break;
                case "F":
                    displayLedger();
                case "R":
                    displayHomeMenu();
                    break;


                default:
                    System.out.println("Invalid input!");
            }
        } while (subInput.equalsIgnoreCase("H"));
    }
}



        
        
    

//Payments

//Reports


