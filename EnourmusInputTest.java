
import java.util.Scanner;
import java.text.*;
/**
 *
 * @author Moses
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        int t;
        int k;
        int num;
        int count = 0;
        
        t = scanN.nextInt();
        k = scanN.nextInt();
        
        for (int i = 0; i < t; i++) {
            num = scanN.nextInt();
            if(num % k == 0) {
                count++;
            }
        }
        
        System.out.println(count);
    }
    
}