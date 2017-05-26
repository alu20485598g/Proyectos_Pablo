/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica80;

import java.util.Scanner;

/**
 * Clase principal. Encontraremos el acceso a la clase areac la cual realizará
 * las operaciones para que nos devuelva el valor correcto del área del cubo
 * y poder mostrarlo.
 * @author pablo
 */
public class Practica80 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* Declaración de variable l (lado)*/
    float l;
     /*Hacemos la llamada a la clase areap en la cual calcularemos el área 
    cubo.*/
    areac ac = new areac();
    /*Entrada por teclado, pedimos del lado al usuario y adjudicamos
    los valores a las variables.*/
    Scanner teclado = new Scanner (System.in);
    System.out.println("Dame el radio: ");
    l = teclado.nextFloat();
    /*Mostramos el valor del área que nos devolverá el método getareal y 
    getareat de la clase areac*/
    System.out.println("El área lateral es "+ ac.getareal(l) +" m2");
    System.out.println("El área total es "+ ac.getareat(l) +" m2");
    }
    
}
