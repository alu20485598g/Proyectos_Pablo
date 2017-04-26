/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica81;

import java.util.Scanner;

/**
 * Clase principal. Encontraremos el acceso a la clase ayve la cual realizará
 * las operaciones para que nos devuelva el valor correcto del área y volumen 
 * de la esfera y poder mostrarlo.
 * @author pablo
 */
public class Practica81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Declaración de variables*/
    float r;
     /*Hacemos la llamada a la clase ayve en la cual calcularemos el área y 
    volumen del cubo.*/
    ayve e = new ayve();
    /*Entrada por teclado, pedimos el radio al usuario y adjudicamos los valores a las variables*/
    Scanner teclado = new Scanner (System.in);
    System.out.println("Dame el radio: ");
    r = teclado.nextFloat();
    /*Mostramos el valor del área que nos devolverá el método getarea y 
    getvolumen de la clase ayve*/
    System.out.println("El área es "+ e.getarea(r) +" m2");
    System.out.println("El volumen es "+ e.getvolumen(r) +" m3");
    }
    
}
