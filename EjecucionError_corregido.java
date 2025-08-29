public class EjecucionError {
    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 0;
        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error en ejecución: división por cero.");
            e.printStackTrace();
        }
    }
}
