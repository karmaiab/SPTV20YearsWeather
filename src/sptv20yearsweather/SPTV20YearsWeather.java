/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20yearsweather;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class SPTV20YearsWeather {
    public static enum months{
        January, February, March, April, May, June, July, August, September, October, November, December
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int min = -20, max = 20, dayInMonth = 1;
        double sum = 0, avg = 0;
        // Зубчетый массив
        int[][] yearsWeather = new int[12][];
        System.out.print("          ");
        for (int i = 0; i < 31; i++) {
            System.out.printf("%4d", i+1);
        }
        System.out.println("");
        for (int i = 0; i < 134; i++) {
            System.out.print("-");
        }
        System.out.println();
        
//        yearsWeather[0] = new int[31];
//        yearsWeather[1] = new int[28];
//        yearsWeather[2] = new int[31];
//        yearsWeather[3] = new int[30];
//        yearsWeather[4] = new int[31];
//        yearsWeather[5] = new int[30];
//        yearsWeather[6] = new int[31];
//        yearsWeather[7] = new int[31];
//        yearsWeather[8] = new int[30];
//        yearsWeather[9] = new int[31];
//        yearsWeather[10] = new int[30];
//        yearsWeather[11] = new int[31];
        for (int i = 0; i < yearsWeather.length; i++) {
            switch (i) {
                case 0: min = -20; max = 5; dayInMonth = 31; break;
                case 1: min = -15; max = 0; dayInMonth = 28; break;
                case 2: min = -10; max = 5; dayInMonth = 31; break;
                case 3: min = -5; max = 10; dayInMonth = 30; break;
                case 4: min = 0; max = 15; dayInMonth = 31; break;
                case 5: min = 5; max = 20; dayInMonth = 30; break;
                case 6: min = 10; max = 25; dayInMonth = 31; break;
                case 7: min = 5; max = 20; dayInMonth = 31; break;
                case 8: min = 0; max = 15; dayInMonth = 30; break;
                case 9: min = -5; max = 10; dayInMonth = 31; break;
                case 10: min = -15; max = 5; dayInMonth = 30; break;
                case 11: min = -20; max = 0; dayInMonth = 31; break;

            }
            yearsWeather[i] = new int[dayInMonth];
            System.out.printf("%8s: ", months.values()[i]);
            for (int j = 0; j < yearsWeather[i].length; j++) {
                yearsWeather[i][j] = random.nextInt(max - min+1)+min;
                System.out.printf("%4d", yearsWeather[i][j]);
                sum += yearsWeather[i][j];
                
            }
            avg = sum/dayInMonth;
            switch (dayInMonth) {
                case 28:
                    System.out.printf("             | the avg: %.2f", avg);
                    break;
                case 30:
                    System.out.printf("     | the avg: %.2f", avg);
                    break;
                case 31:
                    System.out.printf(" | the avg: %.2f", avg);
                    break;
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
            System.out.println("Day: ");
            int day = scanner.nextInt();
            System.out.println("Month :");
            int month = scanner.nextInt();
            System.out.printf("On this day the temp. was: %2d", yearsWeather[month-1][day-1]);
    }
    
}
