package com.ucreativa.vacunacion;




import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.repositories.Repository;
import com.ucreativa.vacunacion.services.BitacoraServices;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in);
        BitacoraServices services = new BitacoraServices(new FileRepository());
        Repository repo = new FileRepository();

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

            } else {
                System.out.println("Parentezco");
                parentezco = in.nextLine();

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

        }
    }

}

