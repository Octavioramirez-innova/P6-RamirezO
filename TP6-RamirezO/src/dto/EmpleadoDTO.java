package dto;

public class EmpleadoDTO {
    private int id_empleado;
    private String nombre_completo;
    private int antiguedad;
    private double bonificacion;
    private String localidad;

    public EmpleadoDTO(int id_empleado, String nombre_completo, int antiguedad, double bonificacion, String localidad) {
        this.id_empleado = id_empleado;
        this.nombre_completo = nombre_completo;
        this.antiguedad = antiguedad;
        this.bonificacion = bonificacion;
        this.localidad = localidad;
    }

    public int getId_empleado() { return id_empleado; }
    public void setId_empleado(int id_empleado) { this.id_empleado = id_empleado; }

    public String getNombre_completo() { return nombre_completo; }
    public void setNombre_completo(String nombre_completo) { this.nombre_completo = nombre_completo; }

    public int getAntiguedad() { return antiguedad; }
    public void setAntiguedad(int antiguedad) { this.antiguedad = antiguedad; }

    public double getBonificacion() { return bonificacion; }
    public void setBonificacion(double bonificacion) { this.bonificacion = bonificacion; }

    public String getLocalidad() { return localidad; }
    public void setLocalidad(String localidad) { this.localidad = localidad; }
}
