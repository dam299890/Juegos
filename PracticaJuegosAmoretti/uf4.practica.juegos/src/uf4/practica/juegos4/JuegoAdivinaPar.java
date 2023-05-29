/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf4.practica.juegos4;

/**
 *
 * @author Daniel
 */
public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    
    public JuegoAdivinaPar(int numero_adivinar, int num_vida) {
        super(numero_adivinar, num_vida);
    }
    
    
    
    
    
    @Override
     public boolean validarNumero(int numero){
         
         if(numero%2==0){
             
             return true;
         
            } else {
         
             System.out.println("el numero no es par");
            return false;
         }
          
    }
     
     
         @Override
    public void muestraNombre() {
        System.out.println("Adivina un numero par");
    }
     
     
     @Override
    public void muestraInfo() {
        System.out.println("Debes Adivinar un numero par del 1 al 10, tienes 5 intentos");
    }
    
    
}
