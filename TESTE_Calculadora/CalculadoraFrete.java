public class CalculadoraFrete {
     public static double calcularFrete(double valorCompra, double distanciaKm) {
        // Validações obrigatórias
        if (valorCompra <= 0) {
            throw new IllegalArgumentException("O valor da compra deve ser maior que zero.");
        }
        if (distanciaKm < 0) {
            throw new IllegalArgumentException("A distância não pode ser negativa.");
        }

        double freteBase = 10.0 + (0.5 * distanciaKm);
        double freteFinal;

        // Aplicação das regras de desconto
        if (valorCompra > 100.0) {
            freteFinal = 0.0;
        } else if (valorCompra >= 70.0) {
            freteFinal = freteBase * 0.5;
        } else {
            freteFinal = freteBase;
        }

        return freteFinal;
    }

}
