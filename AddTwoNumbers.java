/**
 * Program Name: AddTwoNumbers
 * Programmer: Moses
 * Date: December 6, 2021
 * Description: Program for Add Two Numbers Problem
 **/
package AddTwoNumbers;

import java.util.Scanner;
/**
 *
 * @author Dabs
 */
public class AddTwoNumbers {
    
    public static Scanner scanN = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t;
        int a;
        int b;
        
        t = scanN.nextInt();
        int [] nums = new int[t];
        
        for (int i = 0; i < t; i++) {
           a = scanN.nextInt();
           b = scanN.nextInt();
           nums[i] = a + b;
        }
        
        System.out.println("");
        for (int i = 0; i < t; i++) {
            System.out.println(nums[i]);
        }
    }
    
}
