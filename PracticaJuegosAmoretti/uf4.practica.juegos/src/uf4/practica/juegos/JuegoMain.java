/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf4.practica.juegos;

/**
 *
 * @author Daniel
 */
public class JuegoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Juego juego = new Juego(5);
        
        juego.mostrarVidas();
        juego.restarVida();
        juego.mostrarVidas();
        
        Juego juego2 = new Juego(5);
        
        juego2.mostrarVidas();
    }
    
}
