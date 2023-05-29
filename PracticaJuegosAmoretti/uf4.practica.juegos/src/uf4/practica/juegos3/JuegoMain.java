/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf4.practica.juegos3;

import uf4.practica.juegos2.*;
import uf4.practica.juegos.*;

/**
 *
 * @author Daniel
 */
public class JuegoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Juego juegoAdivinaNumero = new JuegoAdivinaNumero(4,5);
        
        juegoAdivinaNumero.juega();              

    }
    
}
