package com.ucreativa;

import com.ucreativa.familia.Lilliana;
import com.ucreativa.familia.Melissa;
import com.ucreativa.vacunacion.Amigo;
import com.ucreativa.vacunacion.BitacoraVacunas;
import com.ucreativa.vacunacion.Familiar;
import com.ucreativa.vacunacion.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Usando herencia
      /*  Melissa hija = new Melissa("Hola mamita", 32, "ver peliculas");
        Lilliana mama = new Lilliana("Hola mi chiquita", 62, "hacer ejercicio");

        System.out.println("La edad de mi madre es " + mama.getAge() + " años, y su hobby es " + mama.getHobby());
        System.out.println("Mi edad es  " + hija.getAge() + " años, y mi hobby es " + hija.getHobby()); */

//Desde Main cree una Lista y agregue varias BitacorasVacunas

        Familiar papa = new Familiar("Gerardo", "123456", 70, true, "papa");
        Familiar hermana = new Familiar("Cindy", "123456", 37, false, "hermana");
        Amigo amigo1 =  new Amigo("Fabian","123456",26,false);

        List<BitacoraVacunas> bitacora =  new ArrayList<>();
        bitacora.add (new BitacoraVacunas(amigo1, "J&J", new Date()));
        bitacora.add (new BitacoraVacunas(hermana, "Astra", new Date()));
        bitacora.add (new BitacoraVacunas(papa, "Pfiserv", new Date()));

    }
}
