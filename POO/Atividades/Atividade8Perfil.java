/*
ATIVIDADE 08
O perfil de uma pessoa pode ser determinado a partir da sua data de nascimento, conforme exemplificado a seguir. 
Dada uma data de nascimento, informe o perfil correspondente.
*/
import java.util.Scanner;

public class Atividade8Perfil
{
   public static void main(String arg[])
   {
       String Nasc;
       int n1, n2, n3;
       Scanner eStr = new Scanner(System.in);
       
       System.out.println("Digite Data de Nascimento: ");
       Nasc = eStr.nextLine();
       String[] data = Nasc.split("/");
       
       n1 = Integer.parseInt(data[0]+data[1]);
       n2 = Integer.parseInt(data[2]);
       n3 = n1+n2;
       
       n3 = n3%100 + n3/100;
       n3 = n3%5;
       
       switch(n3)
       {
         case 0:
            System.out.print("Timido");
            break;
         case 1:
            System.out.print("Sonhador");
            break;
         case 2:
            System.out.print("Paquerador");
            break;
         case 3:
            System.out.print("Atraente");
            break;
         case 4:
            System.out.print("Irresistivel");
            break;    
         default: 
            System.out.print("Nao foi possivel verificar perfil");
         }
   }
}

