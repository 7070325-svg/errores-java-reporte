public class LogicoError {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            suma = suma + i; // corregido: sumar i en lugar de i*2
        }
        System.out.println("La suma de los primeros 5 números es: " + suma);
    }
}
