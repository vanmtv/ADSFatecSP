/*
ATIVIDADE 04 - MEDIA
Refaça o programa Media usando outra estratégia para sua solução (aninhada ou encadeada). */
import java.util.Scanner;

public class Atividade4Media
{
   public static void main(String args[])
   { 
      double n1, n2, media;
      Scanner entrada;
      entrada = new Scanner(System.in);
      
      System.out.print("Digite a nota 01: ");
      n1 = entrada.nextDouble();
      System.out.print("Digita a nota 02: ");
      n2 = entrada.nextDouble();
      media = (n1+n2)/2;
      
      if(media<4)
         System.out.println("Reprovado com "+ media);
      else if (media>=7)
         System.out.println("Aprovado com "+media);
      else 
         System.out.println("Recuperacao com "+media);
    }
}