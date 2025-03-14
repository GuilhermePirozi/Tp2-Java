import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do primeiro lado: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Informe o tamanho do segundo lado: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Informe o tamanho do terceiro lado: ");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo formado é do tipo: Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo formado é do tipo: Isósceles.");
            } else {
                System.out.println("O triângulo formado é do tipo: Escaleno.");
            }
        } else {
            System.out.println("As medidas fornecidas não formam um triângulo válido.");
        }
    }
}