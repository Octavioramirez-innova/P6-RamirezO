package dto;

public class ProductoDTO {
    private int id_producto;
    private String nombre;
    private int stock;
    private boolean disponible;
    private boolean necesitaReposicion;

    public ProductoDTO(int id_producto, String nombre, int stock, boolean disponible, boolean necesitaReposicion) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.stock = stock;
        this.disponible = disponible;
        this.necesitaReposicion = necesitaReposicion;
    }

    public int getId_producto() { return id_producto; }
    public void setId_producto(int id_producto) { this.id_producto = id_producto; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    public boolean isNecesitaReposicion() { return necesitaReposicion; }
    public void setNecesitaReposicion(boolean necesitaReposicion) { this.necesitaReposicion = necesitaReposicion; }
}
