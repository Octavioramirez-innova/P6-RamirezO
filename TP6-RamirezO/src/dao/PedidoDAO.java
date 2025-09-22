package dao;
import dto.PedidoDTO;
import dto.DetallePedidoDTO;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAO {
    private List<PedidoDTO> pedidos = new ArrayList<>();

    public void insertar(PedidoDTO pedido) {
        pedidos.add(pedido);
    }

    public List<PedidoDTO> listar() {
        return pedidos;
    }

    public PedidoDTO buscarPorId(int id) {
        for (PedidoDTO p : pedidos) {
            if (p.getId_pedido() == id) return p;
        }
        return null;
    }

    public void actualizar(PedidoDTO pedido) {
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getId_pedido() == pedido.getId_pedido()) {
                pedidos.set(i, pedido);
                return;
            }
        }
    }

    public void eliminar(int id) {
        pedidos.removeIf(p -> p.getId_pedido() == id);
    }

    public List<PedidoDTO> listarPorCliente(String nombre_completo) {
        List<PedidoDTO> resultado = new ArrayList<>();
        for (PedidoDTO p : pedidos) {
            if (p.getCliente_nombre_completo() != null && p.getCliente_nombre_completo().equals(nombre_completo)) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}
