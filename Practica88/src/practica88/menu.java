/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica88;

import java.util.ArrayList;
import java.util.Scanner;

/**
 ** Clase Menu. Encontramos diferentes métodos los cuales nos permitirá 
 * movernos entre los diferentes menús para escoger diferentes opciones.
 * @author pablo
 */
public class menu {
    /** Método que nos permite elegir la operación que deseamos realizar.
     *
     * @return Devuelve el valor de la opción elegida.
     */
 public int menuopcion(){
        Scanner teclado01 = new Scanner(System.in);
        System.out.println("Dime que quieres realizar:");
        System.out.println("1. Dar de alta un libro.");
        System.out.println("2. Dar de baja un libro.");
        System.out.println("3. Coger prestado un libro.");
        System.out.println("4. Devolver un libro.");
        System.out.println("5. Salir.");
        System.out.println();
        return teclado01.nextInt();
    }
    
    /** Método que imprime por pantalla todos los libros disponible y nos 
     * permite escoger uno de ellos
     *
     * @param libros ArrayList con todos los objetos de la clase cuenta
     * @return Devuelve el valor de la opción elegida.
     */
    public int menulibros(ArrayList<libro> libros){
    Scanner teclado02 = new Scanner(System.in);
    int aux2=0;
    for (int i=0;i<libros.size();i++){
        System.out.println(i+1+". " + libros.get(i).gettitulo() +
            " de "+ libros.get(i).getautor());
        aux2=i;
    }
    System.out.println(aux2+2+".Volver al menú principal.");
    return teclado02.nextInt();
    }
             
    /** Método que nos permite ir moviéndonos entre los menús para escoger la 
     * opción deseada.
     *
     * @param op1 Variable que guarda la opción escogida en menuopcion()
     * @param op2 Variable que guarda la opción escogida en menulibros()
     * @param op3 Variable que guarda la opción escogida en menulibros()
     * @param libros ArrayList con todos los objetos de la clase libro
     * @return
     */
    public int menuswitch1(int op1, int op2, int op3, ArrayList<libro> libros){
    op1=menuopcion();
    switch(op1){
        case 1:
            libro nuevo = new libro();
            libros.add(nuevo);
            nuevo.altalibro(libros);
            System.out.println("");
        break;
        case 2:
            libro baja = new libro();
            System.out.println("Estos son todos los registros, "
                    + "selecciona el que quieras dar de baja.");
            System.out.println();
            op3=menulibros(libros);
            if (op3==libros.size()+1){}
            else{baja.bajalibro(op3, libros);}
            System.out.println("");
        break;
        case 3:
            System.out.println("Dime que libro quieres coger prestado:");
            op2=menulibros(libros);
             if (op2>libros.size()+1 || op2==0){
                System.out.println("No me has dado una opción correcta");
            }else{if (op2==libros.size()+1){}
            else{libros.get(op2-1).prestamo();}}
            System.out.println("");
        break;
        case 4:
            System.out.println("");
            System.out.println("Dime que libro quieres devolver:");
            op2=menulibros(libros);
            if (op2>libros.size()+1 || op2==0){
                System.out.println("No me has dado una opción correcta");
            }else{if (op2==libros.size()+1){}
            else{libros.get(op2-1).devolucion();}}
            System.out.println("");
        break;
        case 5:
        break;
        default:
            System.out.println("No has escogido una opción correcta.");
            System.out.println("");
    }
    return op1;
    }
}
