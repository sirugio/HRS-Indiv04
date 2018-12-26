package hrs.indiv04;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class E03 {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        int opcion;
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String apellidos;
        int edad;
        String dni;
        String basura;

        do {
            System.out.println("1. Insertar cliente");
            System.out.println("2. Mostrar cliente");
            System.out.println("3. Modificar cliente");
            System.out.println("4. Borrar cliente");
            System.out.println("5. Salir");

            System.out.print("Introduce una opcion: ");
            opcion = scanner.nextInt();
            basura = scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("Apellidos: ");
                    apellidos = scanner.nextLine();
                    System.out.print("Edad: ");
                    edad = scanner.nextInt();
                    basura = scanner.nextLine();
                    System.out.print("DNI: ");
                    dni = scanner.nextLine();
                    usuario.insertaUsuario(nombre, apellidos, edad, dni);
                    break;
                case 2:
                    System.out.print("DNI: ");
                    dni = scanner.nextLine();
                    usuario.muestraUsuario(dni);
                    break;
                case 3:
                    System.out.print("DNI: ");
                    dni = scanner.nextLine();
                    System.out.print("Nuevo nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("Nuevos apellidos: ");
                    apellidos = scanner.nextLine();
                    System.out.print("Nueva edad: ");
                    edad = scanner.nextInt();
                    basura = scanner.nextLine();
                    usuario.modificaUsuario(nombre, apellidos, edad, dni);
                    break;
                case 4:
                    System.out.print("DNI: ");
                    dni = scanner.nextLine();
                    usuario.borraUsuario(dni);
                    break;
            }
        } while (opcion != 5);
    }
}
