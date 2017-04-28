/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica85;

/**
 * Clase principal. En esta clase encontraremos las diferentes llamadas a la 
 * clase convTiempo, la cual será la encargada de realizar las diferentes 
 * funciones a través de sus métodos.
 * @author pablo
 */
public class Practica85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int segundos;
    /*Llamamos a la nueva clase convTiempo a través del objeto t1.*/
    convTiempo t1 = new convTiempo();
    /*Con este método pedimos los segundos a convertir al usuario.*/
    t1.PedirSegundos();
    /*Con este método convertimos los segundos dados por el usuario.*/
    t1.Convertir();
    /*Con este método devolvemos la cantidad convertida.*/
    t1.GetConvertir();
    
    }
    
}
