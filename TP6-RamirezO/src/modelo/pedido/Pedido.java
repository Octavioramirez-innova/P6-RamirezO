package modelo.pedido;
import java.util.List;

public class Pedido {
    private int id;
    private String fechaPedido;
    private String fechaEntrega;
    private String fechaEnvio;
    private String estado;
    private double montoTotal;
    private modelo.cliente.Cliente cliente;
    private modelo.empleado.Empleado empleado;
    private List<DetallePedido> detalles;

    public Pedido(int id, String fechaPedido, String fechaEntrega, String fechaEnvio, String estado, double montoTotal, modelo.cliente.Cliente cliente, modelo.empleado.Empleado empleado, List<DetallePedido> detalles) {
        this.id = id;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
        this.montoTotal = montoTotal;
        this.cliente = cliente;
        this.empleado = empleado;
        this.detalles = detalles;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFechaPedido() { return fechaPedido; }
    public void setFechaPedido(String fechaPedido) { this.fechaPedido = fechaPedido; }

    public String getFechaEntrega() { return fechaEntrega; }
    public void setFechaEntrega(String fechaEntrega) { this.fechaEntrega = fechaEntrega; }

    public String getFechaEnvio() { return fechaEnvio; }
    public void setFechaEnvio(String fechaEnvio) { this.fechaEnvio = fechaEnvio; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public double getMontoTotal() { return montoTotal; }
    public void setMontoTotal(double montoTotal) { this.montoTotal = montoTotal; }

    public modelo.cliente.Cliente getCliente() { return cliente; }
    public void setCliente(modelo.cliente.Cliente cliente) { this.cliente = cliente; }

    public modelo.empleado.Empleado getEmpleado() { return empleado; }
    public void setEmpleado(modelo.empleado.Empleado empleado) { this.empleado = empleado; }

    public List<DetallePedido> getDetalles() { return detalles; }
    public void setDetalles(List<DetallePedido> detalles) { this.detalles = detalles; }
}

class DetallePedido {
    private String nombreProducto;
    private double subtotal;

    public DetallePedido(String nombreProducto, double subtotal) {
        this.nombreProducto = nombreProducto;
        this.subtotal = subtotal;
    }

    public String getNombreProducto() { return nombreProducto; }
    public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }

    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double subtotal) { this.subtotal = subtotal; }
}
