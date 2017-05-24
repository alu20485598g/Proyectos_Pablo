/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica88;

import java.util.ArrayList;

/**
 * Clase principal. En esta clase encontraremos las diferentes llamadas a la 
 * clase libro, donde crearemos diferentes objetos (l1, l2 y l3), además 
 * crearemos un ArrayList donde guardaremos todos los objetos de la clase libro.
 * @author pablo
 */
public class Practica88 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Declaramos el ArrayList para los objetos de libros*/
    ArrayList<libro> libros = new ArrayList();
    /*Declaramos 3 objetos nuevos de libro con sus datos*/
    libro l0 = new libro(10,5,"Pablo Hontoria Cruz","Las pesadillas del programador","1000AAA");
    libro l1 = new libro(8,3,"Bill Gates","El mundo de JAVA","2000BBB");
    libro l2 = new libro(20,10,"Steve Jobs","C++ es una mierda","3000CCC");
    /*Añadimos los 3 objetos al ArrayList*/
    libros.add(l0);
    libros.add(l1);
    libros.add(l2);
    /*Llamamos a la clase menú para movernos entre las diferentes opciones*/
    menu m = new menu();
    int op1=0;
    int op2=0;
    int op3=0;
    while (op1!=5){
        op1=m.menuswitch1(op1, op2, op3, libros);
    if (op1 == 5){
            System.out.println("Saliendo del programa...");
        }
    }
    }
}
