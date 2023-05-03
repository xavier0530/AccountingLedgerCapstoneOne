package com.xd;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import static com.xd.Main.scanner;

public class Transaction {
   String date, String
   time ,

   public static void addDeposit() {
      System.out.println("Please Input the date of the Payment (YYYY-MM-DD): ");
      String date = scanner.nextLine();
      System.out.println("Please Input the time of the payment(HH-MM-SS)");
      String time = scanner.nextLine();
      System.out.println("Please input a brief description of the payment");
      String description = scanner.nextLine();
      System.out.println("Please input the vendor");
      String vendor = scanner.nextLine();
      System.out.println("Please input the amount");
      String price = scanner.nextLine();

      Transaction transaction = new Transaction();
      System.out.println("Deposit added successfully.");
      FileInputStream poemFile = null;
      try {
         FileWriter = new FileWriter("./src/main/java/com/xd/Transaction.txt", true);
         fileWriter.write("\nDeposit" + date + "|" + time + "|" + description + "|" + vendor + "|" + price);
         fileWriter.close();
      } catch (IOException e) {
         throw new RuntimeException(e);
      }
   }


   public static void addPayment() {
      System.out.println("Please Input the date of the payment (YYYY-MM-DD): ");
      String date = scanner.nextLine();
      System.out.println("Please Input the time of the payment(HH-MM-SS)");
      String time = scanner.nextLine();
      System.out.println("Please input a brief description of the product");
      String description = scanner.nextLine();
      System.out.println("Please input the vendor");
      String vendor = scanner.nextLine();
      System.out.println("Please input the price ");
      String price = scanner.nextLine();

      Transaction transaction = new Transaction();
      System.out.println("Payment added successfully.");
      try {
         fileWriter = new FileWriter("./src/main/java/com/xd/Transaction.txt", true);
         fileWriter.write("\nPayment" + date + "|" + time + "|" + description + "|" + vendor + "|" + price);
         fileWriter.close();
      } catch (IOException e) {
         throw new RuntimeException(e);
      }

   }
}
//public class fileReader

