
package com.unmsm.catalagopeliculas.excepciones;

////Creamos la clases para el manejo de Excepciones en este claso extendemos directamente de la clase Exception 
//para forzar el uso del try cath 
public class AccesoDatosEx  extends Exception{

    public AccesoDatosEx(String message) {
        super(message);
//        Constructor que recibe el msj
    }
    
    
}
