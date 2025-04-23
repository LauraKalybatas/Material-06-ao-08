import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y, x;

        System.out.println("Insira um valor para o x: ");
        x = sc.nextDouble();

        if(x > 5 || x < -5){
            y = 8 / Math.sqrt(Math.pow(x, 2) - 25);
            System.out.println("O resultado da operação é: " + y);
        } else{
            System.out.println("Voce inseriu um numero invalido");
        }

    }
}
