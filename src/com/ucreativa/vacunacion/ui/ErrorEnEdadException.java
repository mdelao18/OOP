package com.ucreativa.vacunacion.ui;

public class ErrorEnEdadException extends Exception {


    public ErrorEnEdadException (String edad){
        super("Favor colocar la edad en números, el valor colocado:  " + edad+" , es incrrecto");

    }
}
