package controlador;
import dao.PedidoDAO;
import dto.PedidoDTO;
import java.util.List;

public class PedidoController {
    private PedidoDAO pedidoDAO = new PedidoDAO();

    public void altaPedido(PedidoDTO pedido) throws Exception {
        // Validaciones: monto > 0, fechas, estado
        pedidoDAO.insertar(pedido);
    }

    public List<PedidoDTO> listarPedidos() {
        return pedidoDAO.listar();
    }

    public void modificarPedido(PedidoDTO pedido) {
        pedidoDAO.actualizar(pedido);
    }

    public void eliminarPedido(int id) {
        pedidoDAO.eliminar(id);
    }

    public List<PedidoDTO> listarPedidosPorCliente(String nombre_completo) {
        return pedidoDAO.listarPorCliente(nombre_completo);
    }

    public void cambiarEstadoPedido(int id, String nuevoEstado) throws Exception {
        PedidoDTO pedido = pedidoDAO.buscarPorId(id);
        if (pedido != null) {
            pedido.setEstado(nuevoEstado);
            pedidoDAO.actualizar(pedido);
        }
    }
}
