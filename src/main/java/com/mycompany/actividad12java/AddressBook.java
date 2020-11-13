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
public class AddressBook {
    //DECLARACIÓN DEL HASHMAP
        private static HashMap<String, String> agenda = new HashMap<String, String>();
         public static HashMap<String, String> getAgendaMap() {
         return agenda;
                }      
}
