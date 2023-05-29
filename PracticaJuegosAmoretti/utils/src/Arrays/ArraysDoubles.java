/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author danielwilfredo.amobe
 */
public class ArraysDoubles {
     public static double calMaxin(double[] notas){
    
        double max =notas[0];
        
         for (int i = 0; i < notas.length; i++) {
            
            if (notas[i]>max) {
               max = notas[i];  
            }
                       
        }
        
    return max;
    }
    
        public static double calMinin(double[] notas){
    
        double min =notas[0];
        
         for (int i = 0; i < notas.length; i++) {
            
            if (notas[i]<min) {
               min = notas[i];  
            }
                       
        }
        
    return min;
    }
        
    public static int indexMinin(double[] notas){
    
        double min =notas[0];
        int pos =0;
         for (int i = 0; i < notas.length; i++) {
            
            if (notas[i]<min) {
               min = notas[i]; 
               pos=i;
              
            }
                       
        }
        
    return pos;
    } 
    
    
        public static int indexMaxin(double[] notas){
    
        double max =notas[0];
        int  pos=0;
         for (int i = 0; i < notas.length; i++) {
            
            if (notas[i]>max) {
             max = notas[i]; 
             pos = i;
                                    
             }             
         }  
         return pos;
      }
        
        
    public static double calMedia(double[] notas){
    
        double suma=0;
     for (int i = 0; i < notas.length; i++) {
             suma += notas[i];
            
        }
        System.out.println(suma);
        
        double mediana = suma/notas.length;
        
    return mediana;
    }


    public static String toString(double[] notas){
        
        String matriz = "";
        
        for (int i = 0; i < notas.length; i++) {
            double nota = notas[i];
            matriz=matriz+notas[i]+",";
        }
    
    return "["+matriz+"]";
    }
    
    public static int indexArray(double[] doble, double v2){
        int pos = -1;
        for (int i = 0; i < doble.length; i++) {
            double d = doble[i];
            if (d==v2) {
                pos = i;
                return pos;
            }
        }
        return pos;
    }
    
    public static void orderArray(double[] doble){
            int i,j;
            double temp;
        for (i = 0; i < doble.length - 1; i++) {
            for (j = 0; j < doble.length - i - 1; j++) {                                                              
                if (doble[j + 1] < doble[j]) {
                    temp = doble[j + 1];
                    doble[j + 1] = doble[j];
                    doble[j] = temp;
                }
            }
        }
        
 
    }
    
}
