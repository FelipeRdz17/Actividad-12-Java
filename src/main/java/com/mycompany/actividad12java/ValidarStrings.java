/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad12java;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author felip
 */
public class ValidarStrings {
    


    //SCANNER PARA OBTENER EL INPUT
    private Scanner string;
    
    //VALIDAR QUE EL INPUT ES STRING
    public ValidarStrings() {
        string = new Scanner(System.in);
        string.useDelimiter("\n"); //Usado para nextLine()
        string.useLocale(Locale.US); // Para double
    }
    public String pedirString(String mensaje) {
        System.out.println(mensaje);
        String cadena = string.next();
        return cadena;
    }
}