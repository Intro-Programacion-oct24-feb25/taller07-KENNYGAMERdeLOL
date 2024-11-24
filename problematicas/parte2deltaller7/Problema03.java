/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);
        datos.useLocale(Locale.US);
        int numero = 2;
        int incremento = 3;
        int limite = 6;
        int contador = 1;

        System.out.println("Serie numerica:");
        while (contador <= limite) {

            System.out.println(numero);

            numero += incremento;

            incremento += 2;

            contador++;
        }
    }
}

    
    
