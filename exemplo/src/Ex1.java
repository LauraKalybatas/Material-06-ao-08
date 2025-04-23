import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double prova1, prova2, mediaProva;
        System.out.println("Insira o valor da nota da primeira prova: ");
        prova1 = sc.nextDouble();
        System.out.println("Insira o valor da nota da segunda prova: ");
        prova2 = sc.nextDouble();

        mediaProva = (prova1 + prova2) / 2;

        double trabalho1, trabalho2, trabalho3, mediaTrabalho;
        System.out.println("Insira a nota do primeiro trabalho: ");
        trabalho1 = sc.nextDouble();
        System.out.println("Insira a nota do segundo trabalho: ");
        trabalho2 = sc.nextDouble();
        System.out.println("Insira a nota do terceiro trabalho: ");
        trabalho3 = sc.nextDouble();

        mediaTrabalho = (trabalho1 + trabalho2 + trabalho3) / 3;

        double mediaFinal;
        mediaFinal = mediaProva * 0.7 + mediaTrabalho * 0.3;

        System.out.println("Sua media final é: " + mediaFinal);
        if (mediaFinal >= 6){
            System.out.println("Aprovado :D");
        } else{
            System.out.println("Reprovado D:");
        }

    }
}
