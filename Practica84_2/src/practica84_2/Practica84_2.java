/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica84_2;

/**
 * Clase principal. En esta clase encontraremos las diferentes llamadas a la 
 * clase cuenta, donde crearemos diferentes objetos para las tres cuentas 
 * (c1, c2 y c3), y la clase Menu, donde podremos elegir las diferentes opciones.
 * @author pablo
 */
public class Practica84_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Creamos el primer objeto a través de la clase cuenta.*/
    cuenta c1 = new cuenta("Pablo","Hontoria","Cruz","20485598G",100000,4,1);
    /*Copiaremos nombre, apellidos y DNI del titular de la c1*/
    cuenta c2 = new cuenta(c1);
    cuenta c3 = new cuenta(c1);
    /*Introducimos los datos de las 2 cuentas restantes que posee nuestro único 
    propietario*/
    c2.setsaldo(50000);
    c3.setsaldo(10000);
    c2.setinteres(3);
    c3.setinteres(2);
    c2.setncuenta(2);
    c3.setncuenta(3);
    /*Realizamos la llamada a la clase Menú para elegir las diferentes opciones*/
    Menu m = new Menu();
    int op1=0;
    int op2=0;
    while (op1!=4){
        op1=m.menuswitch1(op1, op2, c1, c2, c3);
    if (op1 == 4){
            System.out.println("Saliendo del programa...");
        }
    }
    }
}
