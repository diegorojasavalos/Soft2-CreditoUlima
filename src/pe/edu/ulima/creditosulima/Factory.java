
package pe.edu.ulima.creditosulima;


public class Factory {
    
    public Adapter obtenerAdapter(String tipoCR){
        
        if(tipoCR.equals("cer")){
            return new CertiflexAdapter();
            
        }else if(tipoCR.equals("equi")){
            return new EquitelAdapter();
        }else{
            return null;
        }
        
        
    }
    
}
