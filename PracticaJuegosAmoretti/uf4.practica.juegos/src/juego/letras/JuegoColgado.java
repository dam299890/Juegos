/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego.letras;

import interfaces.Jugable;
import java.util.Scanner;
import juego.Juego;

/**
 *
 * @author Daniel
 */
public class JuegoColgado extends Juego implements Jugable {

    private String cadenaAdivinar;

    public JuegoColgado(int numVida, String cadenaAdivinar) {
        super(numVida);
        this.cadenaAdivinar = cadenaAdivinar;
    }

    @Override
    public void juega() {
        reiniciarPartida();

        String cadena = crearCadena();

        System.out.println(cadena);

        boolean cadenaAcertada = false;
        char[] letras = cadena.toCharArray();

        do {

            char letraChar = pedirLetra();
            String letra = String.valueOf(letraChar);

            if (cadenaAdivinar.contains(letra)) {

                for (int i = 0; i < letras.length; i++) {
                    if (cadenaAdivinar.charAt(i) == letraChar) {

                        letras[i] = letraChar;
                    }
                }

                String cadenaPista = new String(letras);

                System.out.println(cadenaPista);

                if (cadenaPista.equalsIgnoreCase(cadenaAdivinar)) {
                    System.out.println("Felicidades has acertado");
                    cadenaAcertada = true;
                }

            } else {

                if (restarVida()) {

                    System.out.println("La letra no se encuentra en la palabra");
                    mostrarVidas();

                } else {

                    System.out.println("no quedan mas vidas");
                    cadenaAcertada = true;

                }

            }
        } while (!cadenaAcertada);

    }

    private String crearCadena() {

        String cadenaCreada = "";

        for (int i = 0; i < cadenaAdivinar.length(); i++) {

            cadenaCreada = cadenaCreada + "-";
        }
        return cadenaCreada;
    }

    private char pedirLetra() {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese una letra");
        char letra = sc.nextLine().charAt(0);

        return letra;

    }

    @Override
    public void muestraNombre() {
        System.out.println("Adivina la palabra");
    }

    @Override
    public void muestraInfo() {
        System.out.println("Introduce una letra para ir adivinando la palabra");
    }

}
