package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Familiar papa = new Familiar("Gerardo", "123456", 70, true, "papa");
        Familiar hermana = new Familiar("Cindy", "123456", 37, false, "hermana");
        Amigo amigo1 = new Amigo("Fabian", "123456", 26, false, "amigo", " Fabian Gonzalez");

        List<BitacoraVacunas> bitacora = new ArrayList<>();
        bitacora.add(new BitacoraVacunas(amigo1, "J&J", new Date()));
        bitacora.add(new BitacoraVacunas(hermana, "Astra", new Date()));
        bitacora.add(new BitacoraVacunas(papa, "Pfiserv", new Date()));

    }
}
