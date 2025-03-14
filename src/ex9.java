import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua senha: ");
        String senhaUsu = leitor.next();

        System.out.println("Confirme sua senha: ");
        String confirmarSenhaDoUsu = leitor.next();

        while (!confirmarSenhaDoUsu.equals(senhaUsu)) {
            System.out.println("Senhas diferentes, tenha certeza de que ambas as senhas coincidam.");
            confirmarSenhaDoUsu = leitor.next();
        }

        System.out.println("Senha criada com sucesso!");

    }
}