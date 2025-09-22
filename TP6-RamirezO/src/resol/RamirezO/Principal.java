package resol.RamirezO;

import java.util.Scanner;
import vista.EmpleadoView;
import vista.ProductoView;
import vista.ClienteView;
import vista.PedidoView;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmpleadoView empleadoView = new EmpleadoView();
        ProductoView productoView = new ProductoView();
        ClienteView clienteView = new ClienteView();
        PedidoView pedidoView = new PedidoView();
        int opcion;
        do {
            System.out.println("\nBienvenido al TP6 - Ramírez O");
            System.out.println("1. Gestión Empleados");
            System.out.println("2. Gestión Productos");
            System.out.println("3. Gestión Clientes");
            System.out.println("4. Gestión Pedidos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    empleadoView.mostrarMenu();
                    break;
                case 2:
                    productoView.mostrarMenu();
                    break;
                case 3:
                    clienteView.mostrarMenu();
                    break;
                case 4:
                    pedidoView.mostrarMenu();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}
