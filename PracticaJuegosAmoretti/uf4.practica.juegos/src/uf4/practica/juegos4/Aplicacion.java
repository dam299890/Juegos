/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf4.practica.juegos4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
          
          Scanner sc= new Scanner(System.in);
          do{
          Jugable juego = eligeJuego();
          
          juego.muestraNombre();
          juego.muestraInfo();
          juego.juega();
          
          System.out.println("Desea volver a jugar\n"+
                             "S/N");
                             String respuesta = sc.nextLine();
                                  
               if (respuesta.equalsIgnoreCase("n")) {
                   
                  jugarOtraVez = false;
              }
                   
          
          
          } while(jugarOtraVez);

    }
      
    public static Jugable eligeJuego(){
        
        JuegoAdivinaNumero juegoAdivinaNumero = new JuegoAdivinaNumero(8,5);
        
        JuegoAdivinaPar juegoAdivinaPar = new JuegoAdivinaPar(4,5);
        
        JuegoAdivinaImpar juegoAdivinaImpar = new JuegoAdivinaImpar(7,5);
        
        ArrayList<Jugable> listaJugable = new ArrayList<Jugable>();
        
        listaJugable.add(juegoAdivinaNumero);
        listaJugable.add(juegoAdivinaPar);
        listaJugable.add(juegoAdivinaImpar);
        
        int numero=0;
        boolean numeroValido= false;
        Scanner sc= new Scanner(System.in);
        
        do{
            System.out.println("Ingrese el numero del juego que desea inciar\n"+
                               "0. Adivina un numero\n"+
                               "1. Adivina un numero par\n"+
                               "2. Adivina un numero impar");
                                numero = sc.nextInt();
                                
                                
                               
            if (numero<3&&numero>=0) {
  
                    numeroValido= true; 
            }
                                       
        }while(!numeroValido);
                
        return listaJugable.get(numero);
        
        
    }
    
}
