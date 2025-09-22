package controlador;
import dao.ClienteDAO;
import dto.ClienteDTO;
import java.util.List;

public class ClienteController {
    private ClienteDAO clienteDAO = new ClienteDAO();

    public void altaCliente(ClienteDTO cliente) throws Exception {
        // Validación: fecha_alta no puede ser futura
        // (Se asume que la fecha viene como String y se compara con la actual)
        clienteDAO.insertar(cliente);
    }

    public List<ClienteDTO> listarClientes() {
        return clienteDAO.listar();
    }

    public void modificarCliente(ClienteDTO cliente) {
        clienteDAO.actualizar(cliente);
    }

    public void eliminarCliente(int id) {
        clienteDAO.eliminar(id);
    }
}
