package vista;
import java.util.Scanner;

public class PedidoView {
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Gestión de Pedidos ---");
            System.out.println("1. Alta Pedido");
            System.out.println("2. Listar Pedidos");
            System.out.println("3. Modificar Pedido");
            System.out.println("4. Eliminar Pedido");
            System.out.println("5. Listar Pedidos de un Cliente");
            System.out.println("6. Cambiar Estado de Pedido");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Alta de Pedido");
                    // Pedir datos y llamar al controlador
                    break;
                case 2:
                    System.out.println("Listado de Pedidos");
                    // Mostrar pedidos
                    break;
                case 3:
                    System.out.println("Modificar Pedido");
                    // Pedir datos y llamar al controlador
                    break;
                case 4:
                    System.out.println("Eliminar Pedido");
                    // Pedir datos y llamar al controlador
                    break;
                case 5:
                    System.out.println("Listar Pedidos de un Cliente");
                    // Pedir datos y mostrar pedidos
                    break;
                case 6:
                    System.out.println("Cambiar Estado de Pedido");
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
