/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejos;

/**
 *
 * @author Carlos Javier Orduz
 */
public class Ejecucion {
    public static void main(String args[]){
       Complejos complejos= new Complejos();
       double complejo1[]= new double[2];
       double complejo2[]= new double[2];
      
       complejo1[0]=1/(Math.sqrt(2));
       complejo1[1]=-7/(Math.sqrt(2));
       
       double res=(complejos.moduloComplejos(complejo1))*complejos.moduloComplejos(complejo1);
        System.out.println(res);
       
    }
}
 
