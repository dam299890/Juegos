/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf4.practica.juegos7;

import static LecturaConsola.LectorConsola.cleanBuffer;
import static LecturaConsola.LectorConsola.leerEnter;
import static LecturaConsola.LectorConsola.leerLine;
import interfaces.*;
import numeros.*;
import java.util.ArrayList;
import java.util.Scanner;
import juego.letras.JuegoColgado;

/**
 *
 * @author Daniel
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
          
          boolean jugarOtraVez=true;
          Scanner sc = new Scanner(System.in);
          do{
          Jugable juego = eligeJuego();
          
          juego.muestraNombre();
          juego.muestraInfo();
          juego.juega();
          
          System.out.println("""
                             Desea volver a jugar
                             S/N""");
                             String respuesta = sc.nextLine();
                                  
               if (respuesta.equalsIgnoreCase("n")) {
                   
                  jugarOtraVez = false;
              }
                   
          
          
          } while(jugarOtraVez);

    }
      
    public static Jugable eligeJuego(){
        
        JuegoAdivinaNumero juegoAdivinaNumero = new JuegoAdivinaNumero(5);
        
        JuegoAdivinaPar juegoAdivinaPar = new JuegoAdivinaPar(5);
        
        JuegoAdivinaImpar juegoAdivinaImpar = new JuegoAdivinaImpar(5);
        
        JuegoColgado juegoColgado = new JuegoColgado(5,"avanza");
        
        ArrayList<Jugable> listaJugable = new ArrayList<Jugable>();
        
        listaJugable.add(juegoAdivinaNumero);
        listaJugable.add(juegoAdivinaPar);
        listaJugable.add(juegoAdivinaImpar);
        listaJugable.add(juegoColgado);
        
        int numero=0;
        boolean numeroValido= false;
        
        do{
            System.out.println("""
                               Ingrese el numero del juego que desea inciar
                               0. Adivina un numero
                               1. Adivina un numero par
                               2. Adivina un numero impar
                               3. Adivina la palabra""");
                                numero = leerEnter();
                                
                                
                               
            if (numero<4&&numero>=0) {
  
                    numeroValido= true; 
            }
                                       
        }while(!numeroValido);
        cleanBuffer();
                
        return listaJugable.get(numero);
        
        
    }
    
}
