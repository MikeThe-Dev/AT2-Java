/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package at2fatura;
import java.util.Scanner;

/**
 *
 * @author MIKE
 */
public class AT2FATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner ent = new Scanner(System.in);
    System.out.print("Digite o valor total da fatura: ");
    double valorTotal = ent.nextDouble();
        System.out.print("Digite o número de parcelas: ");
        int numeroParcelas = ent.nextInt();
        System.out.print("Digite o percentual de desconto para pagamento antecipado (em %): ");
        double percentualDesconto = ent.nextDouble();
        System.out.print("Digite o percentual de multa por atraso (em %): ");
        double percentualMulta = ent.nextDouble();
        double valorComDesconto = valorTotal - (valorTotal * percentualDesconto / 100);
        double valorParcela = valorTotal / numeroParcelas;
        double valorParcelaComMulta = valorParcela + (valorParcela * percentualMulta / 100);
        double valorMulta = valorParcela * percentualMulta / 100;

        System.out.printf("Valor total com desconto para pagamento antecipado: R$ %.2f%n", valorComDesconto);
   
                System.out.println("Valor de cada parcela com multa: ");
        for (int n = 1; n <= numeroParcelas; n++) {
            System.out.printf("Parcela %d: R$ %.2f (Multa: R$ %.2f)%n", n, valorParcelaComMulta, valorMulta);
            
       }    
    }
}
