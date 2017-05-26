/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica87;

/**
 * Clase principal. En esta clase encontraremos las diferentes llamadas a la 
 * clase libro, donde crearemos diferentes objetos(l1, l2, l3, l4 y l5).
 * @author pablo
 */
public class Practica87 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Declaramos 3 objetos nuevos de libro con sus datos y 2 vacíos.*/
    libro l1 = new libro(10,5,"Pablo Hontoria Cruz","Las pesadillas del programador","1000AAA");
    libro l2 = new libro(8,3,"Bill Gates","El mundo de JAVA","2000BBB");
    libro l3 = new libro(20,10,"Steve Jobs","C++ es una mierda","3000CCC");
    libro l4 = new libro();
    libro l5 = new libro();
    /*Llamamos a la clase menú para movernos entre las diferentes opciones*/
    menu m = new menu();
    int op1=0;
    int op2=0;
    int op3=0;
    while (op1!=5){
        op1=m.menuswitch1(op1, op2, op3, l1, l2, l3, l4, l5);
    if (op1 == 5){
            System.out.println("Saliendo del programa...");
        }
    }
    }
}
