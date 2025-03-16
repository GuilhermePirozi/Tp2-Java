import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int valorInicial = leitor.nextInt();

        System.out.print("Digite o valor do incremento: ");
        int incremento = leitor.nextInt();

        System.out.print("Sequência: ");
        for (int i = valorInicial; ; i += incremento) {
            System.out.print(i);

            if (i > 100) {
                break;
            }

            System.out.print(", ");
        }
    }
}
