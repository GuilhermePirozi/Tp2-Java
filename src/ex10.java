import java.util.Random;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int palpiteUsu = 0;

        while (palpiteUsu != numeroSecreto) {
            System.out.print("Informe um número (entre 1 e 100): ");
            palpiteUsu = leitor.nextInt();

            if (palpiteUsu < numeroSecreto) {
                System.out.println("O número secreto é maior!");
            } else if (palpiteUsu > numeroSecreto) {
                System.out.println("O número secreto é menor!");
            }
        }

        System.out.println("Parabéns! Você acertou o número secreto.");
    }
}