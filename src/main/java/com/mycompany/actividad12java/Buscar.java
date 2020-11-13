/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad12java;

import java.util.HashMap;

/**
 *
 * @author felip
 */
public class Buscar {
        
    String telefono;
    String nombre;
    
    //CREAMOS HASHMAP CON STRINGS
        AddressBook mapaAgenda = new AddressBook();
        
    //LLAMAR A CLASE VALIDARSTRING PARA LOS INPUTS
        ValidarStrings vString = new ValidarStrings();
        
    //MÉTODO PARA BUSCAR CONTACTO
    public void buscarUser(){
    HashMap<String, String> agenda = mapaAgenda.getAgendaMap();
    telefono = vString.pedirString("Escribe el número de la persona a buscar: "); 
                       if(agenda.containsKey(telefono)){
                       System.out.println("El nombre del contacto es: " + agenda.get(telefono));
                       }else{
                       System.out.println("No existe el contacto.");
                       }
                       
    }  
}
