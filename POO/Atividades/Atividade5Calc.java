
/*
ATIVIDADE 05 - CALCULADORA
Uso da estrutura de decisão múltipla para implementar uma simples calculadora;
o Usuário digita uma expressão da forma val1<enter> operador<enter> val2 <enter> e o programa fornece-lhe seu valor como resposta. 
Os valores podem ser reais e os operadores aceitos são: +, -, * e /.
*/
import java.util.Scanner;

public class Atividade5Calc {
   public static void main(String[] args){
      Scanner eStr = new Scanner(System.in); 
      Scanner eNum = new Scanner(System.in); 
      
      System.out.println("Digite uma expressao: ");
      double x = eNum.nextDouble(); 
      String s = eStr.nextLine();
      double y = eNum.nextDouble();
      
      char op = s.charAt(0);
      switch (op) {
         case '+': 
            System.out.print("valor = " + (x+y));
            break;
         case '-': 
            System.out.print("valor = " + (x-y));
            break;
        case '*': 
            System.out.print("valor = " + (x*y));
            break;
          case '/':
            if(y==0) System.out.print("Impossivel dividir por 0.");
            else System.out.print("valor = " + (x/y));
            break;        
          default:
            System.out.print("Operador invalido: " + op);
      }       
   }
}
