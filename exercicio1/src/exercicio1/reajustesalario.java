
package exercicio1;

import java.util.Scanner;


public class reajustesalario {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        
        double salario;
       int percentual=0;
        double aumento;
       double salarioatual ;
       
        System.out.println("digite  o seu salario");
        salario = in.nextDouble();
        
        if(salario < 280){
           percentual = 20;
       }else if(salario > 280 && salario < 700){
          percentual = 15;
       }else if(salario > 700 && salario < 1500){  
          percentual   = 10;
       }else if(salario > 1500){
           percentual  = 5;     
    }
  
        aumento=(salario/100)* percentual;
       salarioatual=salario+aumento;
       
        System.out.println("o seu salario era"+ salario);
        System.out.println("o aumento foi"+aumento);
        System.out.println("o percentual foi"+percentual);
            System.out.println("o seu salario atual é"+ salarioatual);
}
}
