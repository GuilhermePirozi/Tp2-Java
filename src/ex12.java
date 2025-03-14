import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma frase: ");
        String fraseUsu = scanner.nextLine();

        String[] palavras = fraseUsu.split("\\s+");

        int contador = 0;

        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                contador++;
            }
        }

        System.out.println("Essa frase possui " + contador + " palavras.");
    }
}
