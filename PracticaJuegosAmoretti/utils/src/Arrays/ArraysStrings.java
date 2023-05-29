/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;


/**
 *
 * @author Daniel
 */
public class ArraysStrings {
    
    /**
     * copia array String
     * @param arrStart
     * @param arrEnd
     */
    public static void copiarArray(String[] arrStart,String[] arrEnd){
        
        
                for (int i = 0; i < arrStart.length; i++) {
                        arrEnd[i] = arrStart[i];
                }
    
    }
    
    /**
     * Ordena array de String alfabeticamente
     * @param A
     * @param izq
     * @param der
     */
    public static void quicksortString(String[] A, int izq, int der) {
     String pivote=A[izq]; // tomamos primer elemento como pivote
     int i=izq;         // i realiza la búsqueda de izquierda a derecha
    int j=der;         // j realiza la búsqueda de derecha a izquierda
    String aux;
 
    while(i < j){                          // mientras no se crucen las búsquedas                                   
        while(A[i].compareToIgnoreCase(pivote) <= 0 && i < j) i++; // busca elemento mayor que pivote
        while(A[j].compareToIgnoreCase(pivote) > 0) j--;           // busca elemento menor que pivote
        if (i < j) {                        // si no se han cruzado                      
         aux= A[i];                      // los intercambia
         A[i]=A[j];
         A[j]=aux;
        }
    }
   
        A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
   
        if(izq < j-1)
        quicksortString(A,izq,j-1);          // ordenamos subarray izquierdo
        if(j+1 < der)
        quicksortString(A,j+1,der);          // ordenamos subarray derecho
    
}

    /**
     * busca un elemento en un array de String
     * @param string
     * @param v2
     * @return index String[i]
     */
    public static int indexArray(String[] string, String v2){
        int pos = -1;
        for (int i = 0; i < string.length&&string[i]!=null; i++) {
            String d = string[i];
            if (d.equalsIgnoreCase(v2)) {
                pos = i;
                return pos;
            }
        }
        return pos;
    }
    
}
