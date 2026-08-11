public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] numeros = { 2, 5, 8, 11, 20 };
        int evenCount = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                evenCount += 1;
            }
        }
        System.out.println("El número de números pares es: " + evenCount);
    }
}
