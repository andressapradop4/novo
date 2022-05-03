
package numeromaior;

import java.util.Scanner;

public class Numeromaior {

   
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
       int maior = 0; 
        int posicao = 0;
        
        for (int i = 1; i <= 100; i++) {
            int num = in.nextInt();
            if (maior > num) {
                maior = maior;
                posicao = posicao;
            } else {
                posicao = i;
                maior = num;
            }
        }
        System.out.print(maior + "\n" + posicao + "\n");
    }
    
}
