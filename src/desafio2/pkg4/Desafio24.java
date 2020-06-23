
package desafio2.pkg4;
import java.util.Scanner;
/**
 *
 * @author troll
 */
public class Desafio24 {
    public static void main(String[] args) {
        int A, A2, B;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual o numero A?");
        A = ler.nextInt();
        System.out.println("Qual o numero B?");
        B = ler.nextInt();
        
        A2 = A;
        A = B;
        B = A2;
        
        System.out.println("O valor trocado é:"+"\nA:"+A+"\nB:"+B);
    }
    
}
