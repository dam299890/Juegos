/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author danielwilfredo.amobe
 */
public class ArraysEnters {
    
    public static int calMaxin(int[] notas){
    
        int max =notas[0];
        
         for (int i = 0; i < notas.length; i++) {
            
            if (notas[i]>max) {
               max = notas[i];  
            }
                       
        }
        
    return max;
    }
    
    
    
        public static int indexMaxBid(int[][] arrBid, int columna){
        
        int index=0;
        int maxPunts = arrBid[0][columna];
         for (int j = 0; j <arrBid.length&&arrBid[j][0]!=0; j++) {
         if (arrBid[j][columna] > maxPunts) {
         maxPunts = arrBid[j][columna];
         index = j;
         }        
    }
         return index;
    }
    
    public static int indexMinBid(int[][] arrBid, int columna){
        
        int index=0;
        int minPunts = arrBid[0][columna];
         for (int j = 0; j <arrBid.length&&arrBid[j][0]!=0; j++) {
         if (arrBid[j][columna] < minPunts) {
         minPunts = arrBid[j][columna];
         index = j;
         }        
    }
         return index;
    }
         
    public static int calMinin(int[] notas){
    
        int min =notas[0];
        
         for (int i = 0; i < notas.length; i++) {
            
            if (notas[i]<min) {
               min = notas[i];  
            }
                       
        }
        
    return min;
    }  
    
    
    public static int indexMinin(int[] notas){
    
        int min =notas[0];
        int pos =0;
         for (int i = 0; i < notas.length; i++) {
            
            if (notas[i]<min) {
               min = notas[i]; 
               pos=i;
              
            }
                       
        }
        
    return pos;
    }
    
    public static int indexMaxin(int[] notas){
    
        int max =notas[0];
        int  pos=0;
         for (int i = 0; i < notas.length; i++) {
            
            if (notas[i]>max) {
             max = notas[i]; 
             pos = i;
                                    
             }             
         }  
         return pos;
      }

     public static double calMedia(int[] notas){
    
        int suma=0;
     for (int i = 0; i < notas.length; i++) {
             suma += notas[i];
            
        }
        System.out.println(suma);
        
        double mediana = suma/notas.length;
        
    return mediana;
    }
 
 
    public static String toString(int[] notas){
        
        String matriz = "";
        
        for (int i = 0; i < notas.length; i++) {
            int nota = notas[i];
            matriz=matriz+notas[i]+",";
        }
    
    return "["+matriz+"]";
    }
    
    public static int indexArray(int[] doble, int v2){
        int pos = -1;
        for (int i = 0; i < doble.length; i++) {
            int d = doble[i];
            if (d==v2) {
                pos = i;
                return pos;
            }
        }
        return pos;
    }
    
    public static void orderArray(int[] enter){
            int i,j;
            int temp;
        for (i = 0; i < enter.length - 1; i++) {
            for (j = 0; j < enter.length - i - 1; j++) {                                                              
                if (enter[j + 1] < enter[j]) {
                    temp = enter[j + 1];
                    enter[j + 1] = enter[j];
                    enter[j] = temp;
                }
            }
        }
        
 
    }    
}
