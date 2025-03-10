import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o seu nome completo:");
        String nomeProprio = leitor.nextLine();

        System.out.println("Informe a sua idade:");
        int idade = leitor.nextInt();

        System.out.println("Informe o nome do seu pai:");
        String nomePai = leitor.nextLine();

        System.out.println("Informe o nome da sua mãe:");
        String nomeMae = leitor.nextLine();

        System.out.println("=== Informações do Usuário ===");
        System.out.println("Nome: " + nomeProprio);
        System.out.println("Idade: " + idade);
        System.out.println("Nome da Mãe: " + nomeMae);
        System.out.println("Nome do Pai: " + nomePai);

        if (nomeProprio.length() > nomeMae.length() || nomeProprio.length() > nomePai.length()) {
            System.out.println("O nome do usuário tem mais letras do que pelo menos um dos pais.");
        } else {
            System.out.println("O nome do usuário não é maior do que o nome de nenhum dos pais.");
        }
    }
}

