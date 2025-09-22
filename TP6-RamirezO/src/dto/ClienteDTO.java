package dto;

public class ClienteDTO {
    private int id_cliente;
    private String nombre_completo;
    private String nombre_empresa;
    private String tipo_empresa;
    private String localidad;

    public ClienteDTO(int id_cliente, String nombre_completo, String nombre_empresa, String tipo_empresa, String localidad) {
        this.id_cliente = id_cliente;
        this.nombre_completo = nombre_completo;
        this.nombre_empresa = nombre_empresa;
        this.tipo_empresa = tipo_empresa;
        this.localidad = localidad;
    }

    public int getId_cliente() { return id_cliente; }
    public void setId_cliente(int id_cliente) { this.id_cliente = id_cliente; }

    public String getNombre_completo() { return nombre_completo; }
    public void setNombre_completo(String nombre_completo) { this.nombre_completo = nombre_completo; }

    public String getNombre_empresa() { return nombre_empresa; }
    public void setNombre_empresa(String nombre_empresa) { this.nombre_empresa = nombre_empresa; }

    public String getTipo_empresa() { return tipo_empresa; }
    public void setTipo_empresa(String tipo_empresa) { this.tipo_empresa = tipo_empresa; }

    public String getLocalidad() { return localidad; }
    public void setLocalidad(String localidad) { this.localidad = localidad; }
}
