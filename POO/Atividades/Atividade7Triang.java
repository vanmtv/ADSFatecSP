/*
ATIVIDADE 7 - TRIANGULOS
Dados 3 valores, verifique se os mesmos formam um triangulo ou não. Caso afirmativo, informe se é escaleno, isósceles ou equilátero.
*/

import java.util.Scanner;

public class Atividade7Triang
{
   public static void main(String args[])
   {
      int n1, n2, n3;
      Scanner eNum = new Scanner(System.in);
      
      System.out.print("Lado um: ");
      n1 = eNum.nextInt();
      
      System.out.print("Lado dois: ");
      n2 = eNum.nextInt();

      System.out.print("Lado tres: ");
      n3 = eNum.nextInt();
  
      if( n1< n2+n3 && n2 < n1+n3 && n3 < n1+n2)
      {
         if(n1==n2 && n2==n3) 
            System.out.println("Triangulo Equilatero");
         else if(n1==n2 || n2==n3 || n1==n3)
            System.out.println("Triangulo Isosceles");
         else
            System.out.println("Triangulo Escaleno");
       }
       else
         System.out.println("Nao é triangulo");
     }
}
