
package com.unmsm.catalagopeliculas.datos;

import com.unmsm.catalagopeliculas.domain.Pelicula;
import com.unmsm.catalagopeliculas.excepciones.AccesoDatosEx;
import com.unmsm.catalagopeliculas.excepciones.EscrituraDatosEx;
import com.unmsm.catalagopeliculas.excepciones.LecturaDatosEx;
import java.util.List;


public interface IAccesoDatos {
    
    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRecurso) throws AccesoDatosEx;
    
}
