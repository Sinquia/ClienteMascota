/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Computer
 */
public interface IMascota {

    public abstract boolean guardarMascota(Mascota mascota);
    public abstract ArrayList<Mascota> listarMascotas();
    public abstract boolean actualizarMascota(Mascota mascota);
    public abstract List<Mascota> listarMascotaRaza(String raza);
    public abstract List<Mascota> listarNombreMascota(String nombreMascota);
    public abstract Integer CantidadMascota();
    public abstract boolean eliminarMascota(Mascota mascota);

}

//los frameworks utilizados son JSF (F) y HIBERNATE (P) //
// usamos XHTML para poder utilizar las librerias de prinface  //
//index.xhtml (vista) y mascotaBean  ( controladores)son FRONTEND  //
// mascotaDao y IMascota son BACKEND   //
// tarea investigar :::  librerias de JSF-----

// tarea crear pojos -- hibernatereveng crear otra interfaz llamado cliente tambiem dao y managedBean
//crear entidad  todo los pasos para cliente 
// datos del cliente codigo int, nombre, apellido, direccion, fecha nac date or varchar, direccion, num telf varchar, e-mail
//