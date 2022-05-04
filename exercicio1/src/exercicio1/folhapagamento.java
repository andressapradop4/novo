
package exercicio1;

import java.util.Scanner;


public class folhapagamento {
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        double valHoras;
        double horaMes;
        double salariob;
        double percentual=0;
        double  ir;
        double   inss;
        double   fgts;
        double   totaldescontos;
        double   salariol;
        
        System.out.println("qual e o valor hora?");
        valHoras=in.nextDouble();
        System.out.println("quantas horas voce trabalha no mes"); 
        horaMes = in.nextDouble();
        
         salariob = valHoras*horaMes;
        
        if(salariob <900){
          percentual=0;
        }else if(salariob < 1500){
            percentual =5;
        }else if(salariob < 2500){
            percentual =10;
        }else if(salariob <= 2500){
            percentual =15;
        }else if(salariob >=2500){
            percentual =20;
        }
      
      ir= (salariob /100)* percentual;
        inss= (salariob /100)* 10;
      fgts= (salariob /100)* 11;
        totaldescontos = ir + inss;
       salariol=salariob - totaldescontos;
         
        System.out.println("salariobruto("+valHoras+ "*" +horaMes+"):"+salariob);
        System.out.println("(-)IR(" + percentual+" %):" +ir);
        System.out.println("(-)Inss(10%):" +inss );
        System.out.println("ftgs(11%):" +fgts);
        System.out.println("total descontos:" + totaldescontos);
        System.out.println("salario liquido:" + salariol);
    }
    
    
}
