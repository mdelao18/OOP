package com.ucreativa.vacunacion;




import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.repositories.Repository;
import com.ucreativa.vacunacion.services.BitacoraServices;
import com.ucreativa.vacunacion.ui.FrontEnd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FrontEnd fe =  new FrontEnd("Sistema de Vacunacion");
        fe.build();

       /* Scanner in = new Scanner(System.in);
        BitacoraServices services = new BitacoraServices(new FileRepository());
        Repository repo = new FileRepository();
        Persona persona;

        while (true) {
            String nombre, cedula, edad, riesgo, isAmigo, relacion = null, facebook = null, parentezco = null, marca, print;

            System.out.println("Nombre");
            nombre = in.nextLine();
            System.out.println("Cedula");
            cedula = in.nextLine();
            System.out.println("Edad");
            edad = in.nextLine();
            System.out.println("Riesgo (S/N)");
            riesgo = in.nextLine();
            System.out.println("Amigo (A) /Familiar (F)");
            isAmigo = in.nextLine();

            if (isAmigo.equals("A")) {
                System.out.println("Relacion");
                relacion = in.nextLine();
                System.out.println("Facebook");
                facebook = in.nextLine();
                //persona =  new Amigo(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), relacion, facebook);

            } else {
                System.out.println("Parentezco");
                parentezco = in.nextLine();
                //persona =  new Familiar(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), parentezco);

            }
            System.out.println("Vacuna -- Marca");
            marca = in.nextLine();
            services.save(nombre, cedula, edad, riesgo, isAmigo,relacion, facebook,parentezco, marca);
            System.out.println("Quiere imprimir lista (S)");
            print = in.nextLine();
            if (print.equals("s")) {
                for (String item : repo.get()) {
                    System.out.println(item);
                }

            }

        }*/
    }

}

