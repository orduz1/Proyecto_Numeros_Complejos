/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import complejos.Complejos;
import complejos.ExcepcionDivisionPorCero;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos Javier Orduz Trujillo
 */
public class Pruebas {
    Complejos complejos;
    @Before
    public void before(){
        complejos= new Complejos();
    }
    @Test
    /**
     * 
     *  
     */
    public void sumaComplejosTest(){
        double[]complejo1= {1,2};
        double []complejo2={2,3};
        double [] esperado={3,5};
       double []resultado= complejos.sumarComplejos(complejo1, complejo2);
        assertArrayEquals(esperado, resultado, 0);
    }
   @Test
   public void restaComplejosTest(){
       double []complejo1= {10,11};
       double []complejo2= {3,4};
       double []esperado={7,7};
       double []resultado=complejos.restaComplejos(complejo1, complejo2);
       assertArrayEquals(esperado, resultado, 0);
   }
   @Test
   public void productoComplejosTest(){
       double []complejo1={3,4};
       double [] complejo2={7,8};
       double [] esperado={-11,52};
       double []resultado= complejos.productoComplejos(complejo1, complejo2);
       assertArrayEquals( esperado, resultado, 0);
   }
   @Test
   public void divisionComplejosTest() throws ExcepcionDivisionPorCero{
       double []complejo1={3,4};
       double []complejo2={7,8};
       double esperado[]= {0.469,0.4601};
       double resultado[]=complejos.divisionComplejos(complejo1, complejo2);
       assertArrayEquals( esperado, resultado, 3);
   }
   @Test
   public void faseComplejoTest(){
       double[]complejo={3,4};
       
       double esperado=0.64;
       double resultado=complejos.faseDeUnComplejo(complejo);
       assertEquals(esperado, resultado, 3);
   }
   @Test
   public void conjugadoComplejoTest(){
       double[]complejo={3,4};
       double []esperado={3,-4};
       
       double []resultado= complejos.conjugado(complejo);
       
       assertArrayEquals(esperado, resultado, 0);
       
   }
   @Test 
   public void moduloComplejoTest(){
       double []complejo={3,4};
       double esperado=5;
       
       double resultado=complejos.moduloComplejos(complejo);
       assertEquals( esperado, resultado, 2);
   }
   @Test
   public void polarACartesianoTest(){
       double moduloDelComplejo=5;
       double anguloDelComplejo=0.927;
       double [] esperado={3.001,3.999};
       double[]resultado=complejos.polarACartesiana(moduloDelComplejo, anguloDelComplejo);
       
       assertArrayEquals(esperado, resultado, 2);
   }
   
   @Test
   public void cartesianoAPolarTest(){
       double complejo[]={3,4};
       double []esperado={5,0.927};
       
       double []resultado=complejos.cartesianaAPolar(complejo);
       
       assertArrayEquals( esperado, resultado, 2);
   }
   // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
