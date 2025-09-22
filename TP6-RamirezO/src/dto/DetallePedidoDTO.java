package dto;

public class DetallePedidoDTO {
    private String nombre_producto;
    private double subtotal;

    public DetallePedidoDTO(String nombre_producto, double subtotal) {
        this.nombre_producto = nombre_producto;
        this.subtotal = subtotal;
    }

    public String getNombre_producto() { return nombre_producto; }
    public void setNombre_producto(String nombre_producto) { this.nombre_producto = nombre_producto; }

    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double subtotal) { this.subtotal = subtotal; }
}
