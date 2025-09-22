package dao;
import dto.EmpleadoDTO;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {
    private List<EmpleadoDTO> empleados = new ArrayList<>();

    public void insertar(EmpleadoDTO empleado) {
        empleados.add(empleado);
    }

    public List<EmpleadoDTO> listar() {
        return empleados;
    }

    public EmpleadoDTO buscarPorId(int id) {
        for (EmpleadoDTO e : empleados) {
            if (e.getId_empleado() == id) return e;
        }
        return null;
    }

    public void actualizar(EmpleadoDTO empleado) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getId_empleado() == empleado.getId_empleado()) {
                empleados.set(i, empleado);
                return;
            }
        }
    }

    public void eliminar(int id) {
        empleados.removeIf(e -> e.getId_empleado() == id);
    }
}
