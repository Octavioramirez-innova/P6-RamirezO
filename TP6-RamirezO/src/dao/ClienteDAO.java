package dao;
import dto.ClienteDTO;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private List<ClienteDTO> clientes = new ArrayList<>();

    public void insertar(ClienteDTO cliente) {
        clientes.add(cliente);
    }

    public List<ClienteDTO> listar() {
        return clientes;
    }

    public ClienteDTO buscarPorId(int id) {
        for (ClienteDTO c : clientes) {
            if (c.getId_cliente() == id) return c;
        }
        return null;
    }

    public void actualizar(ClienteDTO cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId_cliente() == cliente.getId_cliente()) {
                clientes.set(i, cliente);
                return;
            }
        }
    }

    public void eliminar(int id) {
        clientes.removeIf(c -> c.getId_cliente() == id);
    }
}
