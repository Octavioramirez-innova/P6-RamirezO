package dto;
import java.util.List;

public class PedidoDTO {
    private int id_pedido;
    private String fecha_pedido;
    private String fecha_entrega;
    private String fecha_envio;
    private String estado;
    private double monto_total;
    private String cliente_nombre_completo;
    private String cliente_nombre_empresa;
    private String cliente_tipo_empresa;
    private String cliente_localidad;
    private String empleado_nombre_completo;
    private String empleado_cargo;
    private List<DetallePedidoDTO> detalles;

    public PedidoDTO(int id_pedido, String fecha_pedido, String fecha_entrega, String fecha_envio, String estado, double monto_total,
                     String cliente_nombre_completo, String cliente_nombre_empresa, String cliente_tipo_empresa, String cliente_localidad,
                     String empleado_nombre_completo, String empleado_cargo, List<DetallePedidoDTO> detalles) {
        this.id_pedido = id_pedido;
        this.fecha_pedido = fecha_pedido;
        this.fecha_entrega = fecha_entrega;
        this.fecha_envio = fecha_envio;
        this.estado = estado;
        this.monto_total = monto_total;
        this.cliente_nombre_completo = cliente_nombre_completo;
        this.cliente_nombre_empresa = cliente_nombre_empresa;
        this.cliente_tipo_empresa = cliente_tipo_empresa;
        this.cliente_localidad = cliente_localidad;
        this.empleado_nombre_completo = empleado_nombre_completo;
        this.empleado_cargo = empleado_cargo;
        this.detalles = detalles;
    }

    public int getId_pedido() { return id_pedido; }
    public void setId_pedido(int id_pedido) { this.id_pedido = id_pedido; }

    public String getFecha_pedido() { return fecha_pedido; }
    public void setFecha_pedido(String fecha_pedido) { this.fecha_pedido = fecha_pedido; }

    public String getFecha_entrega() { return fecha_entrega; }
    public void setFecha_entrega(String fecha_entrega) { this.fecha_entrega = fecha_entrega; }

    public String getFecha_envio() { return fecha_envio; }
    public void setFecha_envio(String fecha_envio) { this.fecha_envio = fecha_envio; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public double getMonto_total() { return monto_total; }
    public void setMonto_total(double monto_total) { this.monto_total = monto_total; }

    public String getCliente_nombre_completo() { return cliente_nombre_completo; }
    public void setCliente_nombre_completo(String cliente_nombre_completo) { this.cliente_nombre_completo = cliente_nombre_completo; }

    public String getCliente_nombre_empresa() { return cliente_nombre_empresa; }
    public void setCliente_nombre_empresa(String cliente_nombre_empresa) { this.cliente_nombre_empresa = cliente_nombre_empresa; }

    public String getCliente_tipo_empresa() { return cliente_tipo_empresa; }
    public void setCliente_tipo_empresa(String cliente_tipo_empresa) { this.cliente_tipo_empresa = cliente_tipo_empresa; }

    public String getCliente_localidad() { return cliente_localidad; }
    public void setCliente_localidad(String cliente_localidad) { this.cliente_localidad = cliente_localidad; }

    public String getEmpleado_nombre_completo() { return empleado_nombre_completo; }
    public void setEmpleado_nombre_completo(String empleado_nombre_completo) { this.empleado_nombre_completo = empleado_nombre_completo; }

    public String getEmpleado_cargo() { return empleado_cargo; }
    public void setEmpleado_cargo(String empleado_cargo) { this.empleado_cargo = empleado_cargo; }

    public List<DetallePedidoDTO> getDetalles() { return detalles; }
    public void setDetalles(List<DetallePedidoDTO> detalles) { this.detalles = detalles; }
}
