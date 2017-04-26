/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica77;

import java.util.Scanner;

/**
 * Clase principal. Encontraremos el acceso a las diferentes clases las cuales 
 * realizarán las operaciones para que nos devuelva el área y perímetro del 
 * círculo y poder mostrarlo.
 * @author pablo
 */
public class Practica77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float r;
    float resull;
    float resula;
    /*Hacemos la llamada a la clase areayl en la cual calcularemos el área y 
    perímetro*/
    areayl ayl = new areayl();
    Scanner teclado = new Scanner (System.in);
    System.out.println("Dame el radio: ");
    r = teclado.nextFloat();
    /*En las variables resull y resula guardaremos el valor que nos devuelva 
    los métodos de la clase areyl*/
    resull = ayl.getlongitud(r);
    resula = ayl.getarea(r);
    /*Mostramos por pantalla los resultados*/
    System.out.println("El área es "+ resula +" m2");
    System.out.println("El perímetro es "+ resull +" m");
    }  
}
