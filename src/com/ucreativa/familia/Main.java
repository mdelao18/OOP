package com.ucreativa.familia;

public class Main {

    public static void main(String[] args) {
        // Usando herencia
      Melissa hija = new Melissa("Hola mamita", 32, "ver peliculas");
        Lilliana mama = new Lilliana("Hola mi chiquita", 62, "hacer ejercicio");

        System.out.println("La edad de mi madre es " + mama.getAge() + " años, y su hobby es " + mama.getHobby());
        System.out.println("Mi edad es  " + hija.getAge() + " años, y mi hobby es " + hija.getHobby());

    }
}
