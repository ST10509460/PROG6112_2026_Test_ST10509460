package com.mycompany.question1.RunApplication;

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       CONSOLE SALES SYSTEM");
        System.out.println("================================");

        System.out.println("Select a console:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. Nintendo Switch");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        input.nextLine();

        String consoleType;

        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;

            case 2:
                consoleType = "XBOX";
                break;

            case 3:
                consoleType = "Nintendo Switch";
                break;

            default:
                consoleType = "Unknown";
                break;
        }

        System.out.print("Enter store name: ");
        String store = input.nextLine();

        System.out.print("Enter total amount of sales: ");
        int totalSales = input.nextInt();

        ConsoleSales sales =
                new ConsoleSales(consoleType, store, totalSales);

        System.out.println();

        sales.printReport();

        input.close();
    }
}

