package vista;
import java.util.Scanner;

public class ClienteView {
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Gestión de Clientes ---");
            System.out.println("1. Alta Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Modificar Cliente");
            System.out.println("4. Eliminar Cliente");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Alta de Cliente");
                    // Pedir datos y llamar al controlador
                    break;
                case 2:
                    System.out.println("Listado de Clientes");
                    // Mostrar clientes
                    break;
                case 3:
                    System.out.println("Modificar Cliente");
                    // Pedir datos y llamar al controlador
                    break;
                case 4:
                    System.out.println("Eliminar Cliente");
                    // Pedir datos y llamar al controlador
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }
}
