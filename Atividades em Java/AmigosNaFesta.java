 package com.mycompany.amigosnafesta;

 import java.util.Scanner;

 public class AmigosNaFesta {
 
     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         int qa;
         System.out.print("Quantos pessoas você ficou em uma festa: ");
         qa = teclado.nextInt();
         if(qa < 5){
             System.out.println("Você é uma  pessoa tranquila");
         }else{
             if(qa == 5){
                 System.out.println("Você é uma pessoa normal");
             }else{
                 if(qa > 5){
                     System.out.println("TU TÁ ANIMADO");
                 }
             }
         }
     }
 }