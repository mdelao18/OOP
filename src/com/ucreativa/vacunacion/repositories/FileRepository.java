package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.Persona;

import java.io.*;
import java.util.Date;
import java.util.List;

public class FileRepository implements Repository {


    FileWriter fichero = null;
    PrintWriter pw = null;


    @Override
    public void save(Persona persona, String marca, Date date) throws IOException {
        System.out.println("metodo save");
        /*fichero = new FileWriter("C:\\Users\\USER\\Desktop\\Cert QA Auto\\Programación Orientada a Objetos con JAVA\\Semana 4/prueba.txt\",true");
        pw = new PrintWriter(fichero);
        pw.println(persona.getNombre() + marca + date);*/

        String sFichero = "fichero.txt";
        File fichero = new File(sFichero);
        BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));
        bw.write(persona.getNombre()+marca+date);
    }

    @Override
    public List<String> get() {
        return null;
    }
}
