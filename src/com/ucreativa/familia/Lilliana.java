package com.ucreativa.familia;

public class Lilliana {

    private  int age;
    private  String hobby;

    public Lilliana(String saludo, int age, String hobby){
        this.age = age;
        this.hobby = hobby;
        System.out.println(saludo);
    }

    public void setAge (){
        this.age = this.age + 1;
    }

    public int getAge (){
        return this.age;
    }

    public String getHobby(){
        return hobby;
    }
}


