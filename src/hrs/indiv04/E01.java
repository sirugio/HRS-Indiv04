package hrs.indiv04;

import java.util.Scanner;

public class E01 {

    public static void main(String[] args) {
        int suma;
        int mayor;
        int menor;
        suma = 0;
        mayor = 0;
        menor = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el tamaño del Array: ");
        int TAM = in.nextInt();
        int[] Array = new int[TAM];
        for (int i = 0; i < TAM; i++) {
            Array[i] = (int) Math.round(Math.random() * 100);
        }
        for (int i = 0; i < TAM; i++) {
            if (mayor < Array[i]) {
                mayor = Array[i];
            }
            if (menor > Array[i]) {
                menor = Array[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        for (int i = 0; i < TAM; i++) {
            suma += Array[i];
            System.out.println(Array[i] + " ");
        }
        double resultado = suma / TAM;
        System.out.println("La media de los número es: " + resultado);
    }
}
