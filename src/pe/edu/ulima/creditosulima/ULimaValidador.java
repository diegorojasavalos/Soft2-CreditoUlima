
package pe.edu.ulima.creditosulima;

public class ULimaValidador {
    // Metodo que nos dice si se le realiza el prestamo a un alumno.
    // La funcionalidad de esta clase debe ser independiente de la central
    // de riesgo utilizada.
    
    private static ULimaValidador instancia = null;
    
    
    public static ULimaValidador getInstance(){
        if(instancia == null){
            instancia = new ULimaValidador();
        }
        return instancia;
    }
    
    
    
    public boolean esSujetoCredito(Alumno alumno, String tipoCentral){
        Factory factory = new Factory();
        Adapter cra = factory.obtenerAdapter(tipoCentral);
        
        
        
        return cra.validarEstadoCrediticio(alumno.getDni());
    }
}
