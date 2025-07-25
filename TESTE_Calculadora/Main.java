import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o valor da compra (R$): ");
            double valorCompra = scanner.nextDouble();

            System.out.print("Digite a distância da entrega (km): ");
            double distanciaKm = scanner.nextDouble();

            double frete = CalculadoraFrete.calcularFrete(valorCompra, distanciaKm);
            System.out.printf("Valor do frete: R$ %.2f\n", frete);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Entrada inválida. Certifique-se de digitar números válidos.");
        }

        scanner.close();
    }
}
