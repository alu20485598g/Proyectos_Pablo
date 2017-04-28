/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica82;

/**
 * Clase principal. En esta clase encontraremos las diferentes llamadas a la 
 * clase monedas, la cual será la encargada de realizar las diferentes 
 * funciones a través de sus métodos.
 * @author pablo
 */
public class Practica82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int cantidad;
     /*Llamamos a la nueva clase monedas a través del objeto m1*/
    monedas m1 = new monedas();
    /*Con este método pediremos la cantidad al usuario*/
    m1.PedirCantidad();
    /*El siguiente método desglosará la cantidad*/
    m1.Desglosar();
    /*Por último devolvemos la cantidad desglosada para mostrarla por pantalla*/
    m1.GetDesglose();
    }
}
