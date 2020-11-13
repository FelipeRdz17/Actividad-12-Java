/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad12java;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author felip
 */
public class Create {
    
    String telefono;
    String nombre;
    
    //CREAMOS HASHMAP CON STRINGS
        AddressBook mapaAgenda = new AddressBook();
        
    //LLAMAR A CLASE VALIDARSTRING PARA LOS INPUTS
        ValidarStrings vString = new ValidarStrings();
        
    //MÉTODO PARA CREAR USUARIOS 
    public void crearUser(){
    HashMap<String, String> agenda = mapaAgenda.getAgendaMap();
    telefono = vString.pedirString("Escribe el número de la persona: "); 
    nombre = vString.pedirString("Escribe el nombre de la persona: "); 
                        if(!agenda.containsKey(telefono)){
                            agenda.put(telefono, nombre);
                            System.out.println("Se ha añadido correctamente.");
                        }else{
                            System.out.println("Ya existe el contacto.");
                        }
    }  
}
