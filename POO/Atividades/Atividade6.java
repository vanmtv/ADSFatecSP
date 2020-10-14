/*
ATIVIDADE 06 - METODOS
Pesquise e apresente 3 métodos da classe Stringexemplificando seu uso.
*/

import java.util.Scanner;

public class Atividade6
{
   public static void main(String args[])
   {
      String str1, str2, str;
      //metodo toUpperCase()
      str1 = "vANesSa";
      System.out.println("Metodo toUpperCase()");
      System.out.println(str1.toUpperCase());
      
      //metodo equalIgnoreCase() - Comparacao Case Sensitive           
      System.out.println("equalIgnoreCase() - Comparacao Case Sensitive");
      str2 = "vanessa";
      System.out.println(str1.equalsIgnoreCase(str2) ? "Sao iguais" : "Nao sao iguais");    
      
      //metodo Replace - Substituir string ou parte dela
      System.out.println("metodo Replace - Substituir string ou parte dela");
      System.out.println(str1.replace("vANesSa", "Vanessa Regina"));         
      
      }
}
