/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package     LecturaConsola;

import java.util.Scanner;

    
public class LectorConsola {
    static  Scanner sc = new Scanner(System.in);
    
    public static int leerEnter(){
       
        int entero = 0;
       boolean ok = false; 
        do {
            
            
            if (sc.hasNextInt()) {
                
             entero = sc.nextInt();
              ok = true;
            } else {
                sc.nextLine();
                System.out.println("introduce un entero");               
            }
            
        } while (!ok);
        

        
       return entero; 
    }
    
        public static void cleanBuffer(){
        sc.nextLine();
        
        }
        public static String leerLine(){
       
        String linea = sc.nextLine();
        
       return linea; 
    }
    
    
        public static double leerDouble(){
       
       double doble = 0;
       boolean ok = false; 
        do {
            
            
            if (sc.hasNextDouble()) {
                
             doble = sc.nextDouble();
              ok = true;
            } else {
                sc.nextLine();
                System.out.println("introduce un double");               
            }            
        } while (!ok);               
       return doble; 
    }
    
        public static float leerFloat(){
       
        float flotante = 0;
       boolean ok = false; 
        do {
            
            
            if (sc.hasNextFloat()) {
                
                flotante = sc.nextFloat();
                ok = true;
                } else {
                sc.nextLine();
                System.out.println("introduce un float");
                
                }
            
            } while (!ok);            
       return flotante; 
    }
        
    public static byte leerByte(){
       
        byte bite = 0;
       boolean ok = false; 
        do {
            
            
            if (sc.hasNextByte()) {
                
                bite = sc.nextByte();
                ok = true;
                } else {
                sc.nextLine();
                System.out.println("introduce un Byte");
                
                }
            
            } while (!ok);            
       return bite; 
    }    
        
    public static short leerShort(){
       
        short corto = 0;
       boolean ok = false; 
        do {
            
            
            if (sc.hasNextShort()) {
                
                corto = sc.nextShort();
                ok = true;
                } else {
                sc.nextLine();
                System.out.println("introduce un Short");
                
                }
            
            } while (!ok);            
       return corto; 
    }
        
        
    public static long leerLong(){
       
        long larg = 0;
       boolean ok = false; 
        do {
            
            
            if (sc.hasNextLong()) {
                
                larg = sc.nextLong();
                ok = true;
                } else {
                sc.nextLine();
                System.out.println("introduce un Long");
                
                }
            
            } while (!ok);            
       return larg; 
    }
    
    public static boolean leerBoolean(){
       
        boolean bool= true ;
       boolean ok = false; 
        do {
            
            
            if (sc.hasNextBoolean()) {
                
                bool = sc.nextBoolean();
                ok = true;
                } else {
                sc.nextLine();
                System.out.println("introduce un booleano");
                
                }
            
            } while (!ok);            
       return bool; 
    }
}
