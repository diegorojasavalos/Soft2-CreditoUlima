/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ulima.creditosulima;

import pe.com.equitel.Equitel;

/**
 *
 * @author Administrator
 */
public class EquitelAdapter implements Adapter{

    @Override
    public boolean validarEstadoCrediticio(String dni) {
        Equitel equitel = new Equitel();
       
        if(equitel.verificarSiExiste(dni)){
            return equitel.validarSiEsSujetoCredito().equals("SI");
        }else{
            return false;
        }
        
    }
    
}
