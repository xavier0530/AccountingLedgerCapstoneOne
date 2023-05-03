package com.xd;
// Import Scanner class
// Import ArrayList class

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static com.xd.Transaction.addDeposit;
import static com.xd.Transaction.addPayment;

public class Main {

    static ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        String input;//System.out.println(txt.toUpperCase());
        do {
            System.out.println("| Home |");
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


//
    public static void displayLedger() {//change to display
        String subInput;
        do {
            System.out.println("| Ledger |");
            System.out.println("\tA) Show all ");
            System.out.println("\tD) Show all Deposits");
            System.out.println("\tP) Show all Payments ");
            System.out.println("\tR) Reports");
            subInput = scanner.nextLine();

            switch (subInput) {
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
                    back();
                    //Back
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
            FileReader poemFile = new FileReader("./src/main/java/com/xd/Transactions.txt");
            BufferedReader bufferedReader = new BufferedReader(poemFile);

            String input;

            while((input = bufferedReader.readLine()) != null){
                System.out.println(input);
            }

            bufferedReader.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }


    private static void displayAllDeposits() {

    }

    private static void displayAllPayments() {
    }

    private static void back() {

    }

    private static void report() {
    }

    public static void reports() {
        String subInput;
        do {
            System.out.println("| Reports |");
            System.out.println("\tA) Month to Date ");
            System.out.println("\tD) Previous Month");
            System.out.println("\tP) Payments ");
            System.out.println("\tR) Previous");
            System.out.println("\tS) Search by vendor");
            subInput = scanner.nextLine();

            switch (subInput) {
                case "A":

                    //Display All the entries
                    break;
                case "D":

                    //Display all Deposits (positive)
                    break;
                case "L":

                    //Display all payments (negative)
                    break;
                case "B":

                    break;
                case "R":
                    break;

                default:
                    System.out.println("Invalid input!");
            }
        } while (subInput.equalsIgnoreCase("B"));
    }

}

        
        
    

//Payments

//Reports


        //Create Static Array List for transactions with the following (Date:, String, String, Int)
        //Create transaction public class
        // Create static variable called Entries. It will be an ArrayList of Transactions
        // create static variable for Payments
        //create static variable for All = system.out.println(CSV file)
        //create static variable for Deposits(userInputs)
        //create static variable for payments


        //Create Main menu
        // Show prompt for user showing the possible options and asking for an input
        // Create do-while loop that runs unless the user enters "E"\
        // Create switch statement that handles cases related to each menu item
        //Case 1 Add Deposit(D)
        //prompt the user for deposit information and save to CSV file
        //Case "2" Make Payment (P)
        // prompt user for debit information and save to CSV
        //Case "3" Ledger (L)
        //Display Ledger Submenu
        //Case "4" Exit
        //Exit the application

        //Ledger Menu
        //create method for ledger menu
        //Case "1" All(A)
        //Display all Entries
        //Case "2" Deposits (D)
        //Display only the entries that are deposits
        //Case "3" Payments (P)
        //Display only negative entries
        //Case "4" Reports (R)
        //Display Reports Sub Menu

        //Reports Menu
        // run predefined reports or run a custom search
        //Case "1" Month to Date
        //Show all transactions from this month to current date
        //Case "2" Previous Month
        //Show all transactions form the previous month
        // Case "3" Year to Date
        // Show all transactions from this year to current date
        // Case "4" Previous
        // Show all transactions from the prior year
        //Case "5" Search by Vendor
        //Prompt the User for Vendor name and compare to the CSV file
        //print the transactions with matching Strings

/**Initialize variable for user input
 * Create a Home menu that has the following
 * Add Deposit (D)
 * Make Payment (P)
 * Ledger (L)
 * Exit (E)
 * Create a sub menu for Ledger
 * All (display all entries)(A)
 * Deposits(D)
 * (p)Payments display only negative entries
 * (R) Reports
 * Create a submenu for Reports
 * 1) Month to Date
 * 2)Previous Month
 * 3) Year to Date
 * 4)Previous Year
 * 5) Search by Vendor
 * 0) Back (back to report page)
 * H(Back to home page)
 * Write Transactions to a CSV File called Buffered reader(Filewriter)
 * Save as individual lines in the following format (date|time|description|vendor|amount)
 *
 */
