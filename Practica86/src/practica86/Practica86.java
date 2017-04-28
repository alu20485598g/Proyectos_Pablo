/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica86;

/**
 * Clase principal. En esta clase encontraremos las diferentes llamadas a la 
 * clase Distancia, la cual será la encargada de realizar las diferentes 
 * funciones a través de sus métodos.
 * @author pablo
 */
public class Practica86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float pies;
    /*Llamamos a la nueva clase Distancia a través del objeto d1.*/
    Distancia d1 = new Distancia();
    /*Con este método pedimos los pies a convertir al usuario.*/
    d1.PedirPies();
    /*Con este método convertimos los pies al resto de unidades.*/
    d1.Convertir();
    /*Con este método devolvemos las medidas convertidas.*/
    d1.GetConvertir();
    }
    
}
