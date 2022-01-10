/**
 * Program Name: Sum of Digits
 * Programmer: Moses
 * Date: January 9, 2022
 * Problem Link: https://www.codechef.com/problems/FLOW006
 * */
package sumofdigits;

import java.util.Scanner;

/**
 *
 * @author Dabs
 */
public class SumOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        int t, n;

        t = scanN.nextInt();

        int[] fin = new int[t];

        for (int i = 0; i < t; i++) {
            n = scanN.nextInt();

            fin[i] = sum(n);
        }

        for (int i = 0; i < t; i++) {
            System.out.println(fin[i]);
        }
    }

    public static int sum(int n) {
        int temp;
        int sum = 0;

        while (n != 0) {
            temp = n % 10;
            sum += temp;
            n = n / 10;
        }

        return sum;
    }

}
