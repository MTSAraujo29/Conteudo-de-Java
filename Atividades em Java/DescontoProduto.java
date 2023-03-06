import java.util.Scanner;

public class DescontoProduto {

      public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor gasto na loja de informática: ");
        float valorin = teclado.nextFloat();
        float valorfim = 0;
        
        if (valorin > 150.00){
            valorfim = valorin - ((valorin / 100) * 10) ;
            System.out.print("Sua compra deu o valor de R$" + valorin + " reias com isso você teve um desconto de 10%, e o valor ficou R$" + valorfim);
        }else{
             if (valorin == 150.00){
                valorfim = valorin - ((valorin / 100) * 7);
                System.out.print("Sua compra deu o valor de R$" + valorin + " reias com isso você teve um desconto de 7%, e o valor ficou R$" + valorfim);
             }else{
                 if (valorin < 150.00){
                     valorfim = valorin - ((valorin / 100) * 4);
                     System.out.print("Sua compra deu o valor de R$" + valorin + " reias com isso você teve um desconto de 4%, e o valor ficou R$" + valorfim);
                 }
             }         
        }      
    }
}