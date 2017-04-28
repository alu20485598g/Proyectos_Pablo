/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica83;

/**
 * Clase principal. En esta clase encontraremos las diferentes llamadas a la 
 * clase ecuacion2, la cual será la encargada de realizar las diferentes 
 * funciones a través de sus métodos. En esta clase imprimiremos el resultado 
 * final.
 * @author pablo
 */
public class Practica83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   /*Llamamos a la nueva clase ecuacion2 a través del objeto ec.*/
    ecuacion2 ec = new ecuacion2();
    /*Con este método pedimos la variable a de la ecuación al usuario.*/
    ec.pedira();
    /*Con este método pedimos la variable b de la ecuación al usuario.*/
    ec.pedirb();
    /*Con este método pedimos la variable c de la ecuación al usuario.*/
    ec.pedirc();
    /*Con este método calculamos la parte de la raíz de la ecuación.*/
    ec.calculoraiz();
    /*Con este método calculamos el primer resultado de la ecuación.*/
    ec.resultado1();
    /*Con este método calculamos el segundo resultado de la ecuación.*/
    ec.resultado2();
    /*Mostramos por pantalla los resultados devueltos por los métodos 
    getresultado1 y getresultado2.*/
    System.out.println("Los dos resultados de la ecuación de 2º grado son: ");
    System.out.print("Resultado 1: "+ ec.getresultado1());
    System.out.println("");
    System.out.print("Resultado 2: "+ ec.getresultado2());
    System.out.println("");
    }
    
}