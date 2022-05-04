/*1. Escreva um programa que, com base em uma temperatura em graus celsius, 
a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15;
Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
*/
package exercicio1;

import java.util.Scanner;

public class temperaturas {

    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    double c,F,K,Ra,Re;
    c = 2.43;
           
        System.out.println("qual sua temperatura?");
    c=in.nextDouble();
    
        F = c * 1.8 + 32;
        K = c * 273.15;
        Ra = c * 1.8 + 32 + 459.67;
        Re = c * 0.8;
        
        System.out.println("sua temperatura Fahrenheit " + F);
        System.out.println("sua temperatura Kelvin " + K);
        System.out.println("sua temperatura Réaumur " + Re);
        System.out.println("sua temperatura Rankine" + Ra);
            
    }  
}
