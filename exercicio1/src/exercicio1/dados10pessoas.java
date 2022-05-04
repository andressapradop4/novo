/* Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
*/
package exercicio1;

import java.util.Scanner;


public class dados10pessoas {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);   
        int sexo;
        float altura;
        int quantmulheres =0;
        int quanthomens = 0;
        float maior =0;
        float menor =0;
        float mediaH =0;
        float somah = 0;
        for (int i = 0; i < 10; i++) {
            
       System.out.println("qual e o seu sexo?1 feminino/2 masculino");
        sexo = in.nextInt();
        System.out.println("qual sua altura?");
        altura = in.nextFloat();
        
        if(sexo == 1){
            quantmulheres++;
            System.out.println("feminino");
        }else if(sexo == 2){
                System.out.println("masculino");
        quanthomens++;
        somah+=altura;
        }else
                System.out.println("sexo invalido");
        
        if (altura > maior) {
                 maior = altura;
            } else if (altura < menor){
                menor = altura;
            }
        }
        mediaH=somah/quanthomens;
        
            System.out.println("a maior altura é"+ maior);
            System.out.println("a menor altura é"+ menor);
            System.out.println("a media da altura dos homens"+ mediaH);
        System.out.println("o numero de mulheres sao"+ quantmulheres);
        
    } 
    }
 

