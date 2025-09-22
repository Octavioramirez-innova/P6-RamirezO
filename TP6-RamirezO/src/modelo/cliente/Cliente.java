package modelo.cliente;

public class Cliente {
    private int id;
    private String nombreCompleto;
    private String nombreEmpresa;
    private String tipoEmpresa;
    private String localidad;
    private String fechaAlta;

    public Cliente(int id, String nombreCompleto, String nombreEmpresa, String tipoEmpresa, String localidad, String fechaAlta) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.nombreEmpresa = nombreEmpresa;
        this.tipoEmpresa = tipoEmpresa;
        this.localidad = localidad;
        this.fechaAlta = fechaAlta;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getNombreEmpresa() { return nombreEmpresa; }
    public void setNombreEmpresa(String nombreEmpresa) { this.nombreEmpresa = nombreEmpresa; }

    public String getTipoEmpresa() { return tipoEmpresa; }
    public void setTipoEmpresa(String tipoEmpresa) { this.tipoEmpresa = tipoEmpresa; }

    public String getLocalidad() { return localidad; }
    public void setLocalidad(String localidad) { this.localidad = localidad; }

    public String getFechaAlta() { return fechaAlta; }
    public void setFechaAlta(String fechaAlta) { this.fechaAlta = fechaAlta; }
}
