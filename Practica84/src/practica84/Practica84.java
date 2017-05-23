/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica84;

/**
 * Clase principal. En esta clase encontraremos las diferentes llamadas a la 
 * clase pitagoras, la cual será la encargada de realizar las diferentes 
 * funciones a través de sus métodos. En esta clase imprimiremos el resultado 
 * final.
 * @author pablo
 */
public class Practica84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Llamamos a la nueva clase pitagoras a través del objeto p1.*/
    pitagoras p1 = new pitagoras();
    /*Con este método pedimos el primer cateto al usuario.*/
    p1.pedircateto1();
    /*Con este método pedimos el segundo cateto al usuario.*/
    p1.pedircateto2();
    /*Con este método calculamos la hipotenusa.*/
    p1.calculohipo();
    /*Mostramos por pantalla los resultados devueltos por el método getrhipo.*/
    System.out.println("La hipotenusa es igual a: "+ p1.gethipo());
    }
    
}
