package vista;
import java.util.Scanner;

public class ProductoView {
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Gestión de Productos ---");
            System.out.println("1. Alta Producto");
            System.out.println("2. Listar Productos");
            System.out.println("3. Modificar Producto");
            System.out.println("4. Eliminar Producto");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Alta de Producto");
                    // Pedir datos y llamar al controlador
                    break;
                case 2:
                    System.out.println("Listado de Productos");
                    // Mostrar productos
                    break;
                case 3:
                    System.out.println("Modificar Producto");
                    // Pedir datos y llamar al controlador
                    break;
                case 4:
                    System.out.println("Eliminar Producto");
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
