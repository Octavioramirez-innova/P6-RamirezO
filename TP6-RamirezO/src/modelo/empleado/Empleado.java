package modelo.empleado;

public class Empleado {
    private int id;
    private String nombreCompleto;
    private int antiguedad;
    private double bonificacion;
    private String localidad;
    private String cargo;

    public Empleado(int id, String nombreCompleto, int antiguedad, double bonificacion, String localidad, String cargo) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.antiguedad = antiguedad;
        this.bonificacion = bonificacion;
        this.localidad = localidad;
        this.cargo = cargo;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public int getAntiguedad() { return antiguedad; }
    public void setAntiguedad(int antiguedad) { this.antiguedad = antiguedad; }

    public double getBonificacion() { return bonificacion; }
    public void setBonificacion(double bonificacion) { this.bonificacion = bonificacion; }

    public String getLocalidad() { return localidad; }
    public void setLocalidad(String localidad) { this.localidad = localidad; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
}
