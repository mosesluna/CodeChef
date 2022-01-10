/**
 * Program Name: Find Remainder
 * Programmer: Moses
 * Date: January 10, 2022
 * Problem Link: https://www.codechef.com/problems/FLOW002
 * */
package findremainder;

import java.util.Scanner;

/**
 *
 * @author Dabs
 */
public class FindRemainder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        int t, a, b;

        t = scanN.nextInt();

        int[] fin = new int[t];

        for (int i = 0; i < t; i++) {
            a = scanN.nextInt();
            b = scanN.nextInt();

            fin[i] = a % b;
        }

        for (int i = 0; i < t; i++) {
            System.out.println(fin[i]);
        }
    }

}
