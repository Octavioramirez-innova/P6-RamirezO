package controlador;
import dao.ProductoDAO;
import dto.ProductoDTO;
import java.util.List;

public class ProductoController {
    private ProductoDAO productoDAO = new ProductoDAO();

    public void altaProducto(ProductoDTO producto) {
        productoDAO.insertar(producto);
    }

    public List<ProductoDTO> listarProductos() {
        return productoDAO.listar();
    }

    public void modificarProducto(ProductoDTO producto) {
        productoDAO.actualizar(producto);
    }

    public void eliminarProducto(int id) {
        productoDAO.eliminar(id);
    }
}
