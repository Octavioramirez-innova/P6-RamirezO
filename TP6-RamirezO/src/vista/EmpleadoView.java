package vista;

import controlador.EmpleadoController;
import dto.EmpleadoDTO;
import java.util.List;
import java.util.Scanner;

public class EmpleadoView {
    private EmpleadoController controller = new EmpleadoController();

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Gestión de Empleados ---");
            System.out.println("1. Alta Empleado");
            System.out.println("2. Listar Empleados");
            System.out.println("3. Modificar Empleado");
            System.out.println("4. Eliminar Empleado");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Nombre completo: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Antigüedad: ");
                    int antiguedad = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Bonificación: ");
                    double bonificacion = scanner.nextDouble(); scanner.nextLine();
                    System.out.print("Localidad: ");
                    String localidad = scanner.nextLine();
                    EmpleadoDTO emp = new EmpleadoDTO(id, nombre, antiguedad, bonificacion, localidad);
                    controller.altaEmpleado(emp);
                    System.out.println("Empleado agregado.");
                    break;
                case 2:
                    List<EmpleadoDTO> empleados = controller.listarEmpleados();
                    System.out.println("Empleados:");
                    for (EmpleadoDTO e : empleados) {
                        System.out.println(e.getId_empleado() + " - " + e.getNombre_completo());
                    }
                    break;
                case 3:
                    System.out.print("ID a modificar: ");
                    int idMod = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Nueva antigüedad: ");
                    int nuevaAnt = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Nueva bonificación: ");
                    double nuevaBon = scanner.nextDouble(); scanner.nextLine();
                    System.out.print("Nueva localidad: ");
                    String nuevaLoc = scanner.nextLine();
                    EmpleadoDTO empMod = new EmpleadoDTO(idMod, nuevoNombre, nuevaAnt, nuevaBon, nuevaLoc);
                    controller.modificarEmpleado(empMod);
                    System.out.println("Empleado modificado.");
                    break;
                case 4:
                    System.out.print("ID a eliminar: ");
                    int idElim = scanner.nextInt(); scanner.nextLine();
                    controller.eliminarEmpleado(idElim);
                    System.out.println("Empleado eliminado.");
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
