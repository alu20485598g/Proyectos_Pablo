/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica90;

/**
 * Clase principal. En esta clase encontraremos las diferentes llamadas a la 
 * clase nif, donde crearemos el objeto n, con el que posteriormente llamaremos
 * al método pedirdni() y buscarletra().
 * @author pablo
 */
public class Practica90 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*Creamos la clase nif con el objeto n por donde le pasaremos los datos*/
     nif n = new nif();
     /*Realizamos una llamada al siguiente método para pedir el DNI al usuario*/
     n.pedirdni(n);
     /*Realizamos una llamada al siguiente método para devolverle la letra 
     correspondiente al DNI del usuario*/
     n.buscaletra();
    }
    
}
