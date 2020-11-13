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
public class List {
    //CREAMOS HASHMAP CON STRINGS
        AddressBook mapaAgenda = new AddressBook();
        
    //LLAMAR A CLASE VALIDARSTRING PARA LOS INPUTS
        ValidarStrings vString = new ValidarStrings();
        
    //MÉTODO PUBLICO PARA LISTAR    
    public void listar(){
    HashMap<String, String> agenda = mapaAgenda.getAgendaMap();
    if(agenda.entrySet().isEmpty()){
                            System.out.println("No hay contactos registrados.");
                        }else{
                            for(Map.Entry<String, String> entry: agenda.entrySet()){
                            System.out.println("Telefono: " + entry.getKey() + " Nombre: " + entry.getValue());
                        }
    }  
    }  
}
