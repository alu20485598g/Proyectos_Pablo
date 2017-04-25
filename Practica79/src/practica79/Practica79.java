/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica79;

import java.util.Scanner;

/**
 * Clase principal. Encontraremos el acceso a la clase areap la cual realizará
 * las operaciones para que nos devuelva el resultado correcto y poder 
 * mostrarlo.
 * @author pablo
 */
public class Practica79 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Declaración de variables*/
    float r;
    float l;
    /*Hacemos la llamada a la clase areap en la cual calcularemos el área 
    pentágono.*/
    areap ap = new areap();
    /*Entrada por teclado, pedimos lel radio y el lado al usuario y adjudicamos
    los valores a las variables*/
    Scanner teclado = new Scanner (System.in);
    System.out.println("Dame el radio: ");
    r = teclado.nextFloat();
    Scanner teclado2 = new Scanner (System.in);
    System.out.println("Dame el lado: ");
    l = teclado2.nextFloat();
    /*Mostramos el valor del área que nos devolverá el método getarea de la 
    clase areap*/
    System.out.println("El área es "+ ap.getarea(r, l) +" m2");
        }
    
}
