public class Empleado {

    private String nombre_empleado;
    private String email_empleado;
    private String empresa_empleado;
    private String rol_empleado;

    public Empleado(String nombre_empleado, String email_empleado, String empresa_empleado, String rol_empleado) {
        this.nombre_empleado = nombre_empleado;
        this.email_empleado = email_empleado;
        this.empresa_empleado = empresa_empleado;
        this.rol_empleado = rol_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getEmail_empleado() {
        return email_empleado;
    }

    public void setEmail_empleado(String email_empleado) {
        this.email_empleado = email_empleado;
    }

    public String getEmpresa_empleado() {
        return empresa_empleado;
    }

    public void setEmpresa_empleado(String empresa_empleado) {
        this.empresa_empleado = empresa_empleado;
    }

    public String getRol_empleado() {
        return rol_empleado;
    }

    public void setRol_empleado(String rol_empleado) {
        this.rol_empleado = rol_empleado;
    }
}
