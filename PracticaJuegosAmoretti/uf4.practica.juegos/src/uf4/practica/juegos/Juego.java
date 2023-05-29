/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf4.practica.juegos;

/**
 *
 * @author Daniel
 */
public class Juego {
    
    private int num_vida;

    public Juego(int num_vida) {
        this.num_vida = num_vida;
    }

    public void mostrarVidas() {
        
        System.out.println("Juego{" + "num_vida=" + num_vida + '}');
        
    }
    
    public void restarVida(){      
        num_vida-=1;
        
    }
    
    
    
    
    
}
