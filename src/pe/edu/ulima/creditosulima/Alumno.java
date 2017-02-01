 
package pe.edu.ulima.creditosulima;

public class Alumno {
    private String codigo;
    private String dni;

    public Alumno() {
    }

    public Alumno(String codigo, String dni) {
        this.codigo = codigo;
        this.dni = dni;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
}
