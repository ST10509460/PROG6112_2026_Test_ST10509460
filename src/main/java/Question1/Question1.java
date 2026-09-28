/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Question1;

/**
 *
 * @author emeris
 */
public class Question1 {

    public static void main(String[] args) {
        // 1D Array for the ciy names
        String[] cities = {
            "Cape Town",
            "Port Elizabeth",
            "Pretoria"
        };
       
        // 1D array for the console names
        String[] consoles = {
            "PS5",
            "XBOX",
            "SWITCH"
        };

        int[][] sales = {
            {1000, 2000, 3000},  // Cape Town
            {2000, 3000, 4000},  // Port Elizabeth
            {1500, 1100, 1200}   // Pretoria
        };

        System.out.println("----------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------------");

        System.out.printf("%-20s %-8s %-9s %-10s%n",
                "CITY","PS5","XBOX","SWITCH");

        for (int i = 0; i < sales.length; i++) {

            System.out.printf("%-20s", cities[i]);

            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-10d", sales[i][j]);
            }

            System.out.println();
        }

        System.out.println("----------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------------");

        int[] cityTotals = new int[cities.length];

        for (int i = 0; i < sales.length; i++) {

            int total = 0;

            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }

            cityTotals[i] = total;

            System.out.println(cities[i] + " = " + total);
        }

        int highestTotal = cityTotals[0];
        int highestCityIndex = 0;

        for (int i = 1; i < cityTotals.length; i++) {

            if (cityTotals[i] > highestTotal) {
                highestTotal = cityTotals[i];
                highestCityIndex = i;
            }
        }

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: "
                + cities[highestCityIndex]);
        System.out.println("TOTAL SALES: " + highestTotal);
        System.out.println("----------------------------------------------");
    }
}

        
        
