// Crear un programa que calcule el promedio de notas de un array.
// 

public class AverageGrade {
    public static void main(String[] args) {

        int[] grades = { 4, 5, 3, 4 };
        int sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        double average = (double) sum / grades.length;
        System.out.println("El promedio de las notas es: " + average);
    }
}
