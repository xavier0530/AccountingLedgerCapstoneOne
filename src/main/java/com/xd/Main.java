package com.xd;
// Import Scanner class
// Import ArrayList class

import java.util.ArrayList;
import java.util.Scanner;

// Import java.io.BufferedReader;
// Import java.io.FileReader;
// Import java.io.IOException;
public class Main {
    static ArrayList<Transactions> transactions = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String input;
        do {
            System.out.println("| Home |");
            System.out.println("\tD) Add deposit");
            System.out.println("\tP) Make a Payment ");
            System.out.println("\tL) Ledger");
            System.out.println("\tE) Exit");
            input = scanner.nextLine();


            switch (input) {
                case "D":
                    addDeposit();
                    break;
                case "P":
                    addPayment();
                    //Make Payment to CSV
                    break;
                case "L":
                    addLedger();
                    //go to subInput
                    break;
                case "E":
                    exit();
                    //exit
                    break;
                default:
                    System.out.println("Invalid input!");


            }
        } while (input.equalsIgnoreCase("E"));
    }

    private static void addDeposit() {
//ADd deposit to array list
    }

    private static void addPayment() {
//Add payment to array list
    }
    private static void exit(){
   //Stop Application
    }

    public static void addLedger() {
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
                  allEntries();
                    //Display All the entries
                    break;
                case "D":
                    allDeposits();
                    //Display all Deposits (positive)
                    break;
                case "L":
                  allPayments();
                    //Display all payments (negative)
                    break;
                case "B":
                    back();
                    //Back
                    break;
                case "R":
                 report();
                default:
                    System.out.println("Invalid input!");
        }
        }while (subInput.equalsIgnoreCase("B"));
    }
    private static void allEntries(){
    }
    private static void allDeposits(){
    }
    private static void allPayments(){
    }
    private static void back(){

    }
    private static void report(){
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
