package com.ucreativa;

import com.ucreativa.familia.Lilliana;
import com.ucreativa.familia.Melissa;

public class Main {

    public static void main(String[] args) {
	Melissa bella = new Melissa();
    Lilliana mama = new Lilliana("Hola mi chiquita");
    mama.setAge();

    int age = mama.getAge();
        System.out.println("La edad de mi madre es " + age +" años, y su hobby es " +mama.getHobby());
    }
}
