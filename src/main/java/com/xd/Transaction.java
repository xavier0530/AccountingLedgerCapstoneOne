package com.xd;
import java.io.*;
import java.util.regex.Pattern;

import static com.xd.Main.scanner;

public class Transaction {
   static FileWriter fileWriter;

   public static void addDeposit() {
      System.out.println("Please input the date of the deposit (YYYY-MM-DD): ");
      String date = scanner.nextLine();
      System.out.println("Please input the time of the deposit(HH-MM-SS)");
      String time = scanner.nextLine();
      System.out.println("Please input a brief description of the deposit");
      String description = scanner.nextLine();
      System.out.println("Please input the vendor");
      String vendor = scanner.nextLine();
      System.out.println("Please input the amount");
      double amount = Double.parseDouble(scanner.nextLine());

      Transaction transaction = new Transaction(date, time, description, vendor, amount);
      System.out.println("Deposit added successfully.");
      FileInputStream poemFile = null;
      try {
         fileWriter = new FileWriter("./src/main/java/com/xd/Transaction.txt", true);
         fileWriter.write("\nDeposit " + date + "|" + time + "|" + description + "|" + vendor + "|" + amount);
         fileWriter.close();
      } catch (IOException e) {
         throw new RuntimeException(e);
      }
   }


   public static void addPayment() {
      System.out.println("Please input the date of the payment (YYYY-MM-DD): ");
      String date = scanner.nextLine();
      System.out.println("Please input the time of the payment(HH-MM-SS)");
      String time = scanner.nextLine();
      System.out.println("Please input a brief description of the product");
      String description = scanner.nextLine();
      System.out.println("Please input the vendor");
      String vendor = scanner.nextLine();
      System.out.println("Please input the price ");
      double amount = Double.parseDouble(scanner.nextLine());

      double negativePaymentAmount = amount * -1;
      Transaction transaction;
      transaction = new Transaction(date, time, description, vendor, negativePaymentAmount);
      System.out.println("Payment added successfully.");

      try {
         fileWriter = new FileWriter("./src/main/java/com/xd/Transaction.txt", true);
         fileWriter.write(date + "|" + time + "|" + description + "|" + vendor + "|" + negativePaymentAmount);
         fileWriter.close();
      } catch (IOException e) {
         throw new RuntimeException(e);
      }
   }


   private String date;
   private String time;
   private String description;
   private String vendor;
   private double amount;

   public Transaction(String date, String time, String description, String vendor, double amount) {
      this.date = date;
      this.time = time;
      this.description = description;
      this.vendor = vendor;
      this.amount = amount;


   }

   public static FileWriter getFileWriter() {
      return fileWriter;
   }

   public static void setFileWriter(FileWriter fileWriter) {
      Transaction.fileWriter = fileWriter;
   }

   public String getDate() {
      return date;
   }

   public void setDate(String date) {
      this.date = date;
   }

   public String getTime() {
      return time;
   }

   public void setTime(String time) {
      this.time = time;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getVendor() {
      return vendor;
   }

   public void setVendor(String vendor) {
      this.vendor = vendor;
   }

   public double getAmount() {
      return amount;
   }

   public void setAmount(double amount) {
   }


   public void readTransactions() {
      }
   }


//}
////public class fileReader

