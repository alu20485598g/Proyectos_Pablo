/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica89;

/**
 * Clase principal. En esta clase encontraremos las diferentes llamadas a la 
 * clase fecha, donde crearemos el objeto f para guardar los datos de la fecha,
 * y la clase Menu, donde podremos elegir las diferentes opciones.
 * @author pablo
 */
public class Practica89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* Creamos la clase fecha con el objeto f para guardar los datos que nos 
        pase el usuario*/ 
    fecha f = new fecha();
    /*Creamos la clase menu*/
    menu m = new menu();
    int op1=0;
    /* Creamos un bucle para nuestro menú y con la ayuda del switch iremos 
    realizando diferentes operaciones según escoja el usuario*/
    while (op1!=3){
        op1=m.menuopcion();
        switch(op1){
            case 1:
                m.dimefecha(f);
                f.checkfecha();
            break;
            case 2:
                f.fechasys();
            break;
            case 3:
            break;
            default: 
                System.out.println("No has escogido una opción correcta");
            break;
        }
    if (op1 == 3){
            System.out.println("Saliendo del programa...");
        }
    }
       
       
    }
}