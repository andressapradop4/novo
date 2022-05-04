 /*Criar um programa que calcule a média de salários de uma empresa, 
 pedindo ao usuário a grade de funcionários (4)e os salários, e 
         devolvendo a média salarial.
*/
package exercicio1;

import java.util.Scanner;
public class salariofuncionario {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
      
      double n1,n2,n3,n4;
        double media ;
       n1 =1.300;
       n2 =2.070;   
        n3 =3.500;
        n4 =4.900;

        
        media=(n1+n2+n3+n4)/4;
    
        System.out.println("a media do salario da empresa é"+ media);
    }
   
}
