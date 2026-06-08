// Crear un programa que devuelva el número más grande de un array de números enteros.

public class LargestNumber {

    public static void main(String[] args) {
        int[] numeros = { 10, 25, 8, 40, 15 };
        int largest = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > largest) {
                largest = numeros[i];
            }
        }
        System.out.println("El número más grande es: " + largest);
    }
}
