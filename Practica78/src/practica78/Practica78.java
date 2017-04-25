/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica78;

import java.util.Scanner;

/**
 * Clase principal. Encontraremos el acceso a la clase areat la cual realizará
 * las operaciones para que nos devuelva el resultado correcto y poder 
 * mostrarlo.
 * @author pablo
 */
public class Practica78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float h;
    float b;
    float resula;
    /*Hacemos la llamada a la clase areat en la cual calcularemos el área.*/
    areat at = new areat();
    /*Pedimos la base y la altura al usuario.*/
    Scanner teclado = new Scanner (System.in);
    System.out.println("Dame la base: ");
    b = teclado.nextFloat();
    Scanner teclado2 = new Scanner (System.in);
    System.out.println("Dame la altura: ");
    h = teclado.nextFloat();
    /*En la variable resula guardaremos el valor que nos devuelva el método
    de la clase areat*/
    resula= at.getarea(b, h);
    /*Mostramos por pantalla los resultados*/
    System.out.println("El área es "+ resula +" m2");
    }
    
}
