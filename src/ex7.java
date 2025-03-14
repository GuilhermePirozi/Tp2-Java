import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu salário bruto anual: ");
        double salarioPessoa = leitor.nextDouble();

        double impostoGov = 0;

        if (salarioPessoa <= 22000) {
            impostoGov = 0;
        } else if (salarioPessoa <= 35000) {
            impostoGov = (salarioPessoa - 22000) * 0.075;
        } else if (salarioPessoa <= 55000) {
            impostoGov = (35000 - 22000) * 0.075 + (salarioPessoa - 35000) * 0.15;
        } else if (salarioPessoa <= 85000) {
            impostoGov = (35000 - 22000) * 0.075 + (55000 - 35000) * 0.15 + (salarioPessoa - 55000) * 0.225;
        } else {
            impostoGov = (35000 - 22000) * 0.075 + (55000 - 35000) * 0.15 + (85000 - 55000) * 0.225 + (salarioPessoa - 85000) * 0.275;
        }

        System.out.printf("Você pagará um valor de %.2f de imposto, e o valor do seu salário líquido será %.2f", impostoGov, salarioPessoa - impostoGov);

    }
}