package hrs.indiv04;

import java.util.Scanner;

public class E02 {

    public static void main(String[] args) {
        int par;
        int impar;
        par = 0;
        impar = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el tamaño del Array: ");
        int TAM = in.nextInt();
        int[] Array = new int[TAM];
        for (int i = 0; i < TAM; i++) {
            Array[i] = (int) Math.round(Math.random() * 100);
            if (Array[i] % 2 != 0) {
                System.out.println("El número " + Array[i] + " es impar.");
                impar++;
            } else {
                System.out.println("El número " + Array[i] + " es par.");
                par++;
            }
        }
        System.out.println("Hay " + par + " números pares, y " + impar + " números imapares.");
    }
}
