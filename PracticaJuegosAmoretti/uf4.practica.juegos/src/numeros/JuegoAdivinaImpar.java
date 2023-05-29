/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeros;


/**
 *
 * @author Daniel
 */
public class JuegoAdivinaImpar extends JuegoAdivinaNumero{
    
    public JuegoAdivinaImpar( int num_vida) {
        super(num_vida);
    }
    
 
    @Override
     public boolean validarNumero(int numero){
         
         if(numero%2!=0){
             
             return true;
         
            } else {
         
             System.out.println("el numero no es Impar");
            return false;
         }
          
    }
     
     
    @Override
    public void muestraNombre() {
        System.out.println("Adivina un numero impar");
    }
     
     
     @Override
    public void muestraInfo() {
        System.out.println("Debes Adivinar un numero impar del 1 al 10, tienes 5 intentos");
    }
    
        @Override
    public void reiniciarPartida(){
        
        numero_adivinar = rdn.nextInt(5) * 2 + 1;
        
    }
    
}
