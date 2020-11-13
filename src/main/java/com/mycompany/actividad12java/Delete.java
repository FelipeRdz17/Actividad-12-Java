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
public class Delete {
        String telefono;
    String nombre;
    
    //CREAMOS HASHMAP CON STRINGS
        AddressBook hashmap = new AddressBook();
        
    //LLAMAR A CLASE VALIDARSTRING PARA LOS INPUTS
        ValidarStrings vString = new ValidarStrings();
    
    //MÉTODO PARA BORRAR USUARIO   
    public void borrarUser(){
    HashMap<String, String> agenda = hashmap.getAgendaMap();
                       telefono = vString.pedirString("Escribe el número de la persona: ");
                        
                       if(agenda.containsKey(telefono)){
                           System.out.println("El contacto ha sido removido exitosamente.");
                           agenda.remove(telefono);
                       }else{
                            System.out.println("No existe el contacto.");
                        }
    }  
}
