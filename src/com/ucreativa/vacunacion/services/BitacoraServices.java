package com.ucreativa.vacunacion.services;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;

import java.util.Date;
import java.util.List;

public class BitacoraServices
{
    private Repository repository;

    public BitacoraServices(Repository repository){
        this.repository= repository;
    }

    public void save( String nombre, String cedula,String txtEdad, Boolean txtRiesgo, Boolean txtIsAmigo, String relacion,
                          String facebook,String  parentezco,String marca) {

        int edad = Integer.parseInt(txtEdad);
        boolean isAmigo = txtIsAmigo.equals("A");
        boolean riesgo = txtRiesgo.equals("S");
        Persona persona;

        if (isAmigo) {
            persona = new Amigo(nombre, cedula, edad, riesgo, relacion, facebook);

        } else {
            persona = new Familiar(nombre, cedula, edad, riesgo, parentezco);
        }
        this.repository.save(persona, marca, new Date());

    }
    public List<String> get(){
        return this.repository.get();
    }

}
