/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf4.practica.juegos2;

import uf4.practica.juegos.*;

/**
 *
 * @author Daniel
 */
public class Juego {
    
    private final int vidasIni=5;
    private int numVida;
    private static int record=0;

    public Juego(int num_vida) {
        this.numVida = num_vida;
    }

    public void mostrarVidas() {
        
        System.out.println("Juego{" + "num_vida=" + numVida + '}');
        
    }
    
    public boolean restarVida(){      
        numVida-=1;
        
        if (numVida>0) {
            return true;
        } else {
            System.out.println("Juego acabado");
            return false;
        }
        
    }
    
    
    public void reiniciarPartida(){
        
        numVida=vidasIni;
        
    }
    
    public void actualizaRecord(){
    
        if (numVida==record) {
            
            System.out.println("Has conseguido el record");
            
        } else if(numVida>record){
            
            record=numVida;
            System.out.println("has batido el record, tu record actual es:"+record);
            
        }
    
    }
    
    
    
    
    
}
