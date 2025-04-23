import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorTotal, valorPago, desconto;

        System.out.println("Insira o valor total da compra: ");
        valorTotal = sc.nextDouble();

        if(valorTotal >= 1000){
            valorPago = valorTotal * 85 / 100;
        } else{
            valorPago = valorTotal * 95 / 100;
        }

        desconto = valorTotal - valorPago;
        System.out.println("O valor a ser pago é: " + valorPago + " reais");
        System.out.println("O desconto aplicado é de " + desconto + " reais");
    }
}
