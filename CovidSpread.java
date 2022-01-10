/**
 * Program Name: Covid Spread
 * Programmer: Moses
 * Date: January 8, 2022
 * Problem Link: https://www.codechef.com/JAN221C/problems/KEPLERSLAW 
 * */
package covidspread;

import java.util.Scanner;

/**
 *
 * @author Dabs
 */
public class CovidSpread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initializing scanners and variables
        Scanner scanN = new Scanner(System.in);
        int t;
        long n, d;

        do {
            t = scanN.nextInt();
        } while (t < 1 && t > 300);

        long[] fin = new long[t];

        for (int i = 0; i < t; i++) {
            do {
                n = scanN.nextLong();
                d = scanN.nextLong();
            } while ((n < 1 && d < 0) && (n & d) > Math.pow(10, 8));

            fin[i] = covid(n, d);
        }

        for (int i = 0; i < t; i++) {
            System.out.println(fin[i]);
        }
    }

    //Method for covid cases
    public static long covid(long n, long d) {
        //Initializing variables
        long infected = 1;

        for (int i = 1; i <= d; i++) {
            if (i < 11) {
                infected *= 2;
            } else if (i > 10) {
                infected *= 3;
            }
        }

        if (infected > n) {
            infected = n;
        }

        return infected;
    }

}
