/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad12java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author felip
 */
public class Save {
    //CREAMOS HASHMAP CON STRINGS
        AddressBook mapaAgenda = new AddressBook();
        
    //MÉTODO PUBLICO PARA LISTAR    
    public void saveFile() throws IOException{
    HashMap<String, String> agenda = mapaAgenda.getAgendaMap();
    int cantidad = 999999999;

    FileWriter fstream;
    BufferedWriter out;

    //SE CREA EL FILWWRITER Y EL BUFFERED WRITER
    fstream = new FileWriter("values.txt");
    out = new BufferedWriter(fstream);

    //CONTADOR DE REGISTROS
    int count = 0;

    //SE CREA ITERADOR PARA LOS REGISTROS DEL HASHMAP
    Iterator<Map.Entry<String, String>> it = agenda.entrySet().iterator();

    //SE CREA EL LOOP PARA IMPRIMIR POR LA CANTIDAD DE REGISTROS DEL HASHMAP
    while (it.hasNext() && count < cantidad) {

        //SE ALMACENA EN PARES
        Map.Entry<String, String> pairs = it.next();


        //FORMATO DE IMPRESIÓN DEL ARCHIVO
        out.write("{" + pairs.getKey() + "}" + "," + "{" + pairs.getValue() + "}" + "\n");
        count++;
    }
    out.close();
    }  
    
}
