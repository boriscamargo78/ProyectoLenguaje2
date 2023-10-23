/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentame;

/**
 * La clase Vehículo constituye una "Abstracción" en sí. Puesto quecopia características de un objeto real. Es decir, los tipo de vehículo, el peso máximo y el valor de alquiler son características reales.
 * La clase vehículo es una subdivisión o módulo del programa. Es decir, nos ayuda a cumplir con el principio de modularidad puesto que es independiente, pero ayuda a componer el programa
 * @author jhon
 * //Vehículo es una extensión de la super clase Rentame, la cual recibe los parámetros e implementa el método de forma distinta de acuerdo a cada caso en la subclase Vehículo, constituyendo "Polimorfismo"
 * El polimorfismo, que se refiere a la idea de "tener muchas formas", ocurre cuando hay una jerarquía de clases relacionadas entre sí a través de la herencia.
 */
public class Vehiculo extends Rentame{
    private float resultado; //Se aplica "Ocultamiento" para esta variable ya que solo debe utilizarse en esta clase
    public String resulstr;
    
    //Los métodos y las variables han sido identificados como públicos, cumpliendo así con el concepto de "Encapsulamiento"
   
    public void coche(float d){    
     resultado=(float) ((50*d)+(1.5*d));
     resulstr="$"+resultado;
    }   
    public void microbus(float d){
     resultado=(float) (((50*d)+(1.5*d))+2);
     resulstr="$"+resultado; 
    }
    //Vamos a manejar "Excepción" cuando PMA se encuentra en blanco
    public void furgoneta(float d, String datos3)throws Exception{
     pma =  Float.parseFloat(datos3);   
     resultado=(float) (((50*d)+(20*pma)));
     resulstr="$"+resultado; 
    }
    public void camion(float d, String datos3)throws Exception{
     pma =  Float.parseFloat(datos3);   
     resultado=(float) (((50*d)+(20*pma))+40);
     resulstr="$"+resultado;
    }
}
