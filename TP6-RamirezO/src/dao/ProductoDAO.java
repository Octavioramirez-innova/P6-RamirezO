package dao;
import dto.ProductoDTO;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
    private List<ProductoDTO> productos = new ArrayList<>();

    public void insertar(ProductoDTO producto) {
        productos.add(producto);
    }

    public List<ProductoDTO> listar() {
        return productos;
    }

    public ProductoDTO buscarPorId(int id) {
        for (ProductoDTO p : productos) {
            if (p.getId_producto() == id) return p;
        }
        return null;
    }

    public void actualizar(ProductoDTO producto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId_producto() == producto.getId_producto()) {
                productos.set(i, producto);
                return;
            }
        }
    }

    public void eliminar(int id) {
        productos.removeIf(p -> p.getId_producto() == id);
    }
}
