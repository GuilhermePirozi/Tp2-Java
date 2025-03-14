import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um ano para verificar se ele é bissexto: ");
        int anoInformado = leitor.nextInt();

        if (anoInformado % 4 == 0) {
            System.out.printf("O ano %d é bissexto!", anoInformado);
        } else {
            System.out.printf("O ano %d não é bissexto!", anoInformado);
        }
    }
}