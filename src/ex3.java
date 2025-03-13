import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        double brasilEuro = 0.16;
        double brasilLibra = 0.14;
        double brasilDolar= 0.17;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor em reais: ");
        double valor = leitor.nextDouble();

        System.out.println("Informe a moeda desejada (EUR, GBP, USD): ");
        String moeda = leitor.next().toUpperCase();

        double valorConvertido = 0;

        switch (moeda) {
            case "EUR":
                valorConvertido = valor * brasilEuro;
                System.out.printf("O valor em euros é: %.2f", valorConvertido);
                break;

            case "GBP":
                valorConvertido = valor * brasilLibra;
                System.out.printf("O valor em libras é: %.2f", valorConvertido);
                break;

            case "USD":
                valorConvertido = valor * brasilDolar;
                System.out.printf("O valor em dólares é: %.2f", valorConvertido);
                break;

            default:
                System.out.println("Moeda não identificada! Tente Novamente!");
        }

    }
}
