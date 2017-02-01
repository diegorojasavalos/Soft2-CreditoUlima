/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ulima.creditosulima;

import pe.com.certiflex.Validador;

/**
 *
 * @author Administrator
 */
public class CertiflexAdapter implements Adapter{

    @Override
    public boolean validarEstadoCrediticio(String dni) {
        Validador validador = new Validador();
        return validador.validar(dni);
    }
    
}
