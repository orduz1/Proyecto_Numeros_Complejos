/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejos;

/**
 *En este proyecto realizaremos una calculadora de operaciones basicas entre numeros complejos
 * @author Carlos Javier Orduz Trujillo
 */
public class Complejos {
    /**
     * Metodo que recibe dos numeros complejos y retorna la suma de ellos
     * @param complejo1
     * @param complejo2
     * @return resultado
     */
  public double [] sumarComplejos(double []complejo1, double []complejo2){
      double resultado[]= new double[2];
      resultado[0]=complejo1[0]+complejo2[0];
      resultado[1]=complejo1[1]+complejo2[1];
      
      return resultado;
  }
  
  /**
   * Metodo que recibe dos numeros complejos y retorna la resta de ellos
     * @param complejo1
     * @param complejo2
   * @return resultado
   */
    public double [] restaComplejos(double complejo1[], double complejo2[]){
       double resultado[]= new double[2];
      resultado[0]=complejo1[0]-complejo2[0];
      resultado[1]=complejo1[1]-complejo2[1];
      
      return resultado;
    }
    
    /**
     * Metodo que recibe un numero complejo y retorna el conjugado de este
     * @param complejo
     * @return conjugado
     */
    public double [] conjugado(double complejo[]){
        double conjugado []= new double[2];
        conjugado[0]=complejo[0];
        conjugado[1]=(-1)*complejo[1];
        
        return conjugado;
    }
    
    /**
     * Metodo que recibe un numero complejo y retorna el modulo de este 
     * @param complejo
     * @return modulo
     */
    public double moduloComplejos(double[] complejo){
        return  Math.sqrt((complejo[0]*complejo[0])+(complejo[1]*complejo[1]));
    }
    
    /**
     * Funcion que por medio de dos numeros complejos 
     * @param complejo1
     * @param complejo2
     * @return
     * @throws ExcepcionDivisionPorCero 
     */
  public double[] divisionComplejos (double complejo1[], double complejo2[])throws ExcepcionDivisionPorCero{
      
      double resDivision[]= new double[2];
      if(moduloComplejos(complejo2)==0.0){
          throw new ExcepcionDivisionPorCero("No se puede dividir por cero");
      }else{
      double []conjugado=conjugado(complejo2);
      double multiplicacion1[]=productoComplejos(complejo1, conjugado);
      double multiplicacion2[]=productoComplejos(complejo2, conjugado);
      
      resDivision[0]= multiplicacion1[0]/multiplicacion2[0];
      resDivision[1]=multiplicacion1[1]/multiplicacion2[0];
      }
      
      return resDivision;
  }
  
  
  
  
  /**
   * Funcion que toma dos numeros complejos y retorna la multiplicacion de ellos
   * @param complejo1
   * @param complejo2
   * @return multiplicacion
   */
  public double[] productoComplejos(double complejo1[], double complejo2[]){
      double []multiplicacion= new double[2];
      multiplicacion[0]=(complejo1[0]*complejo2[0])-(complejo1[1]*complejo2[1]);
      multiplicacion[1]=(complejo1[0]*complejo2[1])+(complejo1[1]*complejo2[0]);
      
      return multiplicacion;
      
  }
  
  
  
  
  /**
   * Metodo que reice como parametro un numero complejo y devuelve el angulo del numero
   * @param complejo
   * @return anguloRad
   */
  public double faseDeUnComplejo(double complejo[]){
      double anguloRad=Math.atan2(complejo[1], complejo[0]);
      if(anguloRad<0){
          anguloRad+=Math.PI*2;
      }
      
      return anguloRad;
  }
  
  /**
   * Metodo que recibe un numero complejo y lo imprime en pantalla
   * @param complejo 
   */
  public void imprimirComplejo(double[] complejo){
      for(int i=0;i<complejo.length;i++){
          if(i==0){
              System.out.println("Parte Real: "+complejo[i]);
          }else System.out.println("Parte imaginaria: "+complejo[i]);
          
      }
  }
  /**
   * Metodo que recibe un numero complejo de forma polar y devuelve el numero en forma cartesiana
   * @param modulo
   * @param alfa
   * @return resultado
   */
  /**
   * Metodo que recibe un numero complejo en su forma polar y lo devuelve en forma cartesiana
   * @param modulo
   * @param alfa
   * @return forma cartesiana
   */
  public double []polarACartesiana(double modulo, double alfa){
      double resultado[]= new double[2];
      double x= Math.cos(alfa)*modulo;
      double y=Math.sin(alfa)*modulo;
      
      resultado[0]=x;
      resultado[1]=y;
      
      return resultado;
  }
  /**
   * Metodo que recibe un numero complejo expresado en forma cartesiana y lo devuelve expresado en forma polar
   * @param complejo
   * @return forma polar
   */
  public double[] cartesianaAPolar(double[] complejo){
      double polar[]= new double[2];
      polar[0]=moduloComplejos(complejo);
      polar[1]=faseDeUnComplejo(complejo);
      
      return polar;
  }
}
