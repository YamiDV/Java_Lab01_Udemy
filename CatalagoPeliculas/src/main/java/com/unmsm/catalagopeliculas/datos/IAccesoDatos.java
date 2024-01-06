
package com.unmsm.catalagopeliculas.datos;

import com.unmsm.catalagopeliculas.domain.Pelicula;
import com.unmsm.catalagopeliculas.excepciones.AccesoDatosEx;
import com.unmsm.catalagopeliculas.excepciones.EscrituraDatosEx;
import com.unmsm.catalagopeliculas.excepciones.LecturaDatosEx;
import java.util.List;


public interface IAccesoDatos {
    
    boolean isExiste(String nombreRecurso) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    void registrar(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crearFile(String nombreRecurso) throws AccesoDatosEx;

    void borrarFile(String nombreRecurso) throws AccesoDatosEx;

    
    
}
