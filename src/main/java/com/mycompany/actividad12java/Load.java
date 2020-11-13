/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad12java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author felip
 */
public class Load {

        //CREAMOS HASHMAP CON STRINGS
        AddressBook mapaAgenda = new AddressBook();
        
    //LLAMAR A CLASE VALIDARSTRING PARA LOS INPUTS
        ValidarStrings vString = new ValidarStrings();
        
    //MÉTODO PUBLICO PARA LISTAR    
    public void loadFile() throws FileNotFoundException, IOException{
  String archivo = "test2.txt";
    HashMap<String, String> agenda = mapaAgenda.getAgendaMap();
    System.out.println("Contactos precargados del archivo: " + archivo);
    String line;
    BufferedReader reader = new BufferedReader(new FileReader(archivo));
    while ((line = reader.readLine()) != null)
    {
        String[] parts = line.split(",", 2);
        if (parts.length >= 2)
        {
            String key = parts[0];
            String value = parts[1];
            agenda.put(key, value);
        } else {
            System.out.println("archivos con mal formato: " + line);
        }
    }

    for (String key : agenda.keySet())
    {
        System.out.println(key + ":" + agenda.get(key));
    }
    System.out.println("---Finalización de cargar contactos del archivo---");
    reader.close();
    }  
    
}
