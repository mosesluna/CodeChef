/**
 * Program Name: Keplers Law
 * Programmer: Moses
 * Date: January 8, 2022
 * Problem Link: https://www.codechef.com/JAN221C/problems/KEPLERSLAW
 * */
package keplerslaw;

import java.util.Scanner;

/**
 *
 * @author Dabs
 */
public class KeplersLaw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initializing scanners and variables
        Scanner scanN = new Scanner(System.in);
        int t, tOne, tTwo, rOne, rTwo;

        //User input for T variable
        do {
            t = scanN.nextInt();
        } while (t < 1 && t > Math.pow(10, 4));

        String[] fin = new String[t];

        for (int i = 0; i < t; i++) {
            //User input for tOne and tTwo
            do {
                tOne = scanN.nextInt();
                tTwo = scanN.nextInt();
            } while ((tOne & tTwo) < 1 && (tOne & tTwo) > 10);

            //User input for rOne and rTwo
            do {
                rOne = scanN.nextInt();
                rTwo = scanN.nextInt();
            } while ((rOne & rTwo) < 1 && (rOne & rTwo) > 10);

            fin[i] = kepler(tOne, tTwo, rOne, rTwo);
        }

        for (int j = 0; j < t; j++) {
            System.out.println(fin[j]);
        }

    }

    //New method for kepler calculation
    public static String kepler(int tOne, int tTwo, int rOne, int rTwo) {
        //Initializing variables
        String yesno = "";
        double t1Fin = Math.pow(tOne, 2);
        double t2Fin = Math.pow(tTwo, 2);
        double r1Fin = Math.pow(rOne, 3);
        double r2Fin = Math.pow(rTwo, 3);

        double first = t1Fin / r1Fin;
        double second = t2Fin / r2Fin;

        if (first == second) {
            yesno = "Yes";
        } else if (first != second) {
            yesno = "No";
        }

        return yesno;
    }
}
