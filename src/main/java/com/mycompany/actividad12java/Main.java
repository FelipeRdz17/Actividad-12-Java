/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad12java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author felip
 */
public class Main {
    
    public static void main(String[] args) throws IOException{

        //INPUT SCANNER
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        boolean cantidad = false;
        int opcion;
        
        //LLAMAR A CLASE VALIDARSTRING PARA LOS INPUTS
        ValidarStrings vString = new ValidarStrings();
        
        //CREAMOS HASHMAP CON STRINGS
        AddressBook mapaAgenda = new AddressBook();
        //LLAMAR A CLASE LISTAR PARA LOS INPUTS
        List List = new List();
        //LLAMAR A CLASE CREATE PARA LOS INPUTS
        Create Create = new Create();
        //LLAMAR A CLASE DELETE PARA LOS INPUTS
        Delete Delete = new Delete();
        //LLAMAR A CLASE BUSCAR PARA LOS INPUTS
        Buscar Buscar = new Buscar();
        //LLAMAR A CLASE LOAD PARA LOS INPUTS
        Load Load = new Load();
        //LLAMAR A CLASE SAVE PARA LOS INPUTS
        Save Save = new Save();
        
        Load.loadFile();
        
        //DECLARACIÓN DE VARIABLES
        String nombre;
        String telefono;
        
         
   
        //
        while (!cantidad){
            //MENSAJES DEL MENÚ
            System.out.println("Opciones del menú:");
            System.out.println("1 para ver el listado.");
            System.out.println("2 para crear contacto.");
            System.out.println("3 para borrar contacto.");
            System.out.println("4 para buscar contacto.");
            System.out.println("0 para borrar salir.");
            try{
                System.out.println("Escribe el número de la opción que deseas.");
                opcion = input.nextInt();
                
                switch (opcion){
                    case 1:
                        List.listar();                     
                    break;
                    case 2:
                       Create.crearUser();
                    break;
                    case 3:
                       Delete.borrarUser();
                    break;
                    case 4:
                        Buscar.buscarUser();
                    break;
                    case 0:
                        Save.saveFile();
                    System.out.println("Gracias por usar la aplicación.");
                    cantidad = true;
                    break;
                    default:
                    System.out.println("Solo números entre 0 y 4");
                        
                }     
            }catch(Exception e){
                System.out.println("Selecciona una opción correcta del menú.");
                input.next();
            }         
        }
        Save.saveFile();
    } 
}