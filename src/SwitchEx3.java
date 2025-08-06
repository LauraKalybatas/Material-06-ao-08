//programa em java para ler um valor inteiro.
//se o valor for par, imprimir uma mensagem e tambem imprimir o dobro do numero
//se o Valor for impar, imprimir uma msg e tambem o triplo do numero

import java.util.Scanner;

public class SwitchEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, resultado;

        System.out.println("Insira um valor numerico -> ");
        valor = sc.nextInt();

        resultado = switch (valor % 2) {
            case 0 -> {
                System.out.println("Seu nurmero eh par");
                yield 2*valor;
            }
            default -> {
                System.out.println("Seu nurmero eh impar");
                yield 3*valor;
            }
        };
    }
}
