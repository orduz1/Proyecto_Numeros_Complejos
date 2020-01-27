/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejos;

/**
 *Permite generr la excepcion al dividir un numero por cero
 * @author Carlos Javier Orduz Trujillo
 */
public class ExcepcionDivisionPorCero extends Exception {
    public ExcepcionDivisionPorCero(){
        super();
    }
    public ExcepcionDivisionPorCero(String s){
        super(s);
    }
    
}
