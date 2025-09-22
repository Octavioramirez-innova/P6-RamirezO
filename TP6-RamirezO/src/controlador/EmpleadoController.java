package controlador;
import dao.EmpleadoDAO;
import dto.EmpleadoDTO;
import java.util.List;

public class EmpleadoController {
    private EmpleadoDAO empleadoDAO = new EmpleadoDAO();

    public void altaEmpleado(EmpleadoDTO empleado) {
        empleadoDAO.insertar(empleado);
    }

    public List<EmpleadoDTO> listarEmpleados() {
        return empleadoDAO.listar();
    }

    public void modificarEmpleado(EmpleadoDTO empleado) {
        empleadoDAO.actualizar(empleado);
    }

    public void eliminarEmpleado(int id) {
        empleadoDAO.eliminar(id);
    }
}
