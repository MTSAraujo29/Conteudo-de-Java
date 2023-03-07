 package com.mycompany.iptu;

 import java.util.Scanner;
 
 public class Iptu {
 
     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         String nome, end;
         int n1;
         System.out.print("Qual seu nome? ");
         nome = teclado.next();
         System.out.print("Qual seu endereço? ");
         end = teclado.next();
         System.out.print("Qual o numero da sua casa? ");
         n1 = teclado.nextInt();
         if (n1 < 65){  
             System.out.println("Olá " + nome);
             System.out.println("Seu endereço é " + end );
             System.out.print("Você pagara o IPTU deste ano parcelado em 3 vezes; ");      
         }else{
             if(n1 == 65){
                 System.out.println("Olá " + nome);
                 System.out.println("seu endereço é " + end );
                 System.out.println("Você pagara o IPTU em duas parcelas");
             }else{
                 if(n1 > 65){
                     System.out.println("Olá " + nome);
                     System.out.println("seu endereço é " + end );
                     System.out.println("Você pagara o IPTU à vista");
                 }
             }
         }
     } 
     
 }