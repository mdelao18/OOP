package com.ucreativa.vacunacion.services;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;
import com.ucreativa.vacunacion.ui.ErrorEnEdadException;

import java.util.Date;
import java.util.List;

public class BitacoraServices
{
    private final Repository repository;
    private ContadorRiesgo contador;

    public BitacoraServices(Repository repository){
        this.repository= repository;
        this.contador =  new ContadorRiesgo().getInstance();
    }

    public void save( String nombre, String cedula,String txtEdad, Boolean riesgo, Boolean isAmigo, String relacion,
                          String facebook,String  parentesco,String marca) throws ErrorEnEdadException {


        int edad;
        try {
            edad = Integer.parseInt(txtEdad);
        }catch  (NumberFormatException x ) {

            throw new ErrorEnEdadException(txtEdad);
        }
    if (riesgo){
        this.contador.sumarRiesgo();
    }

        Persona persona;

        if (isAmigo) {
            persona = new Amigo(nombre, cedula, edad, riesgo, relacion, facebook);

        } else {
            persona = new Familiar(nombre, cedula, edad, riesgo, parentesco);
        }
        this.repository.save(persona, marca, new Date());

    }
    public List<String> get(){
        System.out.println( "La cantidad de personas con riesgo es: " + this.contador.getCantidadRiesgo());
        return this.repository.get();
    }

}
