package modelo.producto;

public class Producto {
    private int id;
    private String nombre;
    private int stock;
    private boolean disponible;
    private boolean necesitaReposicion;

    public Producto(int id, String nombre, int stock, boolean disponible, boolean necesitaReposicion) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.disponible = disponible;
        this.necesitaReposicion = necesitaReposicion;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    public boolean isNecesitaReposicion() { return necesitaReposicion; }
    public void setNecesitaReposicion(boolean necesitaReposicion) { this.necesitaReposicion = necesitaReposicion; }
}
