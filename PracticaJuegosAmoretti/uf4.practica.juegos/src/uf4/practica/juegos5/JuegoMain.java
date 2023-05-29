/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf4.practica.juegos5;


/**
 *
 * @author Daniel
 */
public class JuegoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JuegoAdivinaNumero juegoAdivinaNumero = new JuegoAdivinaNumero(8,3);
  
        JuegoAdivinaPar juegoAdivinaPar = new JuegoAdivinaPar(4,3);
        
        juegoAdivinaPar.juega();
        
        JuegoAdivinaImpar juegoAdivinaImpar = new JuegoAdivinaImpar(7,3);
        
        juegoAdivinaImpar.juega();

    }
    
}
