/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeros;

import static LecturaConsola.LectorConsola.leerEnter;
import juego.*;
import interfaces.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class JuegoAdivinaNumero extends Juego implements Jugable {
    
    protected int numero_adivinar;
    protected Random rdn =  new Random(System.currentTimeMillis());

    public JuegoAdivinaNumero(int num_vida) {
        super(num_vida);    
    }

    @Override
    public void juega() {
        
        reiniciarPartida();
        boolean numAcertado = false;
        System.out.println(numero_adivinar);
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
    
        
        
        System.out.println("ingrese un numero del 0 al 10");
        int numero = leerEnter();
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
    
    @Override
    public void reiniciarPartida(){
        
        numero_adivinar = rdn.nextInt(11);
        
    }
    
 
    
    
    
    
    
}
