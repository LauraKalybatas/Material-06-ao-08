import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("Insira o valor do primeiro lado: ");
        a = sc.nextDouble();
        System.out.println("Insira o valor do segundo lado: ");
        b = sc.nextDouble();
        System.out.println("Insira o valor do terceiro lado: ");
        c = sc.nextDouble();

        if(a < (b + c) && b < (a + c) && c < (a + b)){
            System.out.println("Os valores inseridos formam um triangulo!");
        } else {
            System.out.println("Os valores inseridos nao formam um triangulo!");
        }


    }
}
