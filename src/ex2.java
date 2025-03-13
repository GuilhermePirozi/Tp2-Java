import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a nota 1:");
        double primeiraNota = leitor.nextDouble();
        System.out.println("Informe a nota 2:");
        double segundaNota = leitor.nextDouble();
        System.out.println("Informe a nota 3:");
        double terceiraNota = leitor.nextDouble();
        System.out.println("Informe a nota 4:");
        double quartaNota = leitor.nextDouble();

        double minhaMedia = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        if (minhaMedia >= 7) {
            System.out.printf("Você foi aprovado! Sua média é %.2f", minhaMedia);
        } else if (minhaMedia >= 5 && minhaMedia <= 6.9) {
            System.out.printf("Você está de recuperação. Sua média é %.2f", minhaMedia);
        } else {
            System.out.printf("Você foi reprovado. Sua média é %.2f", minhaMedia);
        }
    }
}
