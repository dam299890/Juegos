/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf4.practica.juegos4;

import uf4.practica.juegos3.*;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class JuegoAdivinaNumero extends Juego implements Jugable {
    
    private int numero_adivinar;

    public JuegoAdivinaNumero(int numero_adivinar, int num_vida) {
        super(num_vida);
        this.numero_adivinar = numero_adivinar;
    }

    @Override
    public void juega() {
        boolean numAcertado = false;
        
       do {            
             
        int numero;
        boolean numValido;
        
        do{
            numero = pedirNumero();
            
            numValido = validarNumero(numero);
        } while(!numValido);
                
        if (numero==numero_adivinar) {
            
            System.out.println("has acertado");
            actualizaRecord();
            numAcertado = true;
            
        } else {
        
            if(restarVida()){
                
                if (numero > numero_adivinar) {
                    System.out.println("el numero es menor al que introduciste");
                    
                } else {
                        System.out.println("el numero es mayor al que introduciste");
                        
                }
            
                
            } else{
            
                System.out.println("no quedan mas vidas");
                numAcertado = true;
                
            }
            
        }
        } while (!numAcertado);
        
    }
    
    private int pedirNumero(){
    
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero del 0 al 10");
        int numero = sc.nextInt();
            return numero;

    }
    
    
    public boolean validarNumero(int numero){
    
    return true;
    }

    @Override
    public void muestraNombre() {
        System.out.println("Adivina un numero");
    }

    @Override
    public void muestraInfo() {
        System.out.println("Debes Adivinar un numero del 1 al 10, tienes 5 intentos");
    }
    
    
    
    
    
}
