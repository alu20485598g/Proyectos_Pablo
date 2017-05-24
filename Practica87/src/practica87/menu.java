/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica87;

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
     * @param l1 Variable donde se guardan los datos del objeto l1, del primer libro
     * @param l2 Variable donde se guardan los datos del objeto l2, del segundo libro
     * @param l3 Variable donde se guardan los datos del objeto l3, del tercer libro
     * @param l4 Variable donde se guardan los datos del objeto l4, del cuarto libro
     * @param l5 Variable donde se guardan los datos del objeto l5, del quinto libro
     * @return Devuelve el valor de la opción elegida.
     */
    public int menulibros(libro l1, libro l2, libro l3, libro l4, libro l5){
    Scanner teclado02 = new Scanner(System.in);
    if(l1.gettitulo() != null){System.out.println("1. "+ l1.gettitulo() +
            " de "+ l1.getautor());
    }else{
        System.out.println("1.[Registro vacío]");}
    if(l2.gettitulo() != null){System.out.println("2. "+ l2.gettitulo() +
            " de "+ l2.getautor());
    }else{
        System.out.println("2.[Registro vacío]");}
    if(l3.gettitulo() != null){System.out.println("3. "+ l3.gettitulo() +
            " de "+ l3.getautor());
    }else{
        System.out.println("3.[Registro vacío]");}
    if(l4.gettitulo() != null){System.out.println("4. "+ l4.gettitulo() +
            " de "+ l4.getautor());
    }else{
        System.out.println("4.[Registro vacío]");}
    if(l5.gettitulo() != null){System.out.println("5. "+ l5.gettitulo() +
            " de "+ l5.getautor());
    }else{
        System.out.println("5.[Registro vacío]");}
    System.out.println("6.Volver al menú principal.");
    System.out.println();
    return teclado02.nextInt();
    }
         
    /** Método que nos permite ir moviéndonos entre los menús para escoger la 
     * opción deseada 
     *
     * @param op1 Variable que guarda la opción escogida en menuopcion()
     * @param op2 Variable que guarda la opción escogida en menulibros()
     * @param op3 Variable que guarda la opción escogida en menulibros()
     * @param l1 Variable donde se guardan los datos del objeto l1, del primer libro
     * @param l2 Variable donde se guardan los datos del objeto l2, del segundo libro
     * @param l3 Variable donde se guardan los datos del objeto l3, del tercer libro
     * @param l4 Variable donde se guardan los datos del objeto l4, del cuarto libro
     * @param l5 Variable donde se guardan los datos del objeto l5, del quinto libro
     * @return
     */
    public int menuswitch1(int op1, int op2, int op3, libro l1, libro l2, 
            libro l3, libro l4, libro l5){
    op1=menuopcion();
    switch(op1){
        case 1:
            System.out.println("Estos son todos los registros, selecciona "
                    + "uno vacío.");
            System.out.println("Si seleccionas un registro ocupado se "
                    + "sobrescribirán los datos.");
            System.out.println();
            op3=menulibros(l1, l2, l3, l4, l5);
            switch(op3){
                case 1:
                    l1.altalibro();
                break;
                case 2:
                    l2.altalibro();
                break;
                case 3:
                    l3.altalibro();
                break;
                case 4:
                    l4.altalibro();
                break;
                case 5:
                    l5.altalibro();
                break;        
            }
        break;
        case 2:
            System.out.println("Estos son todos los registros, "
                    + "selecciona el que quieras dar de baja.");
            System.out.println();
            op3=menulibros(l1, l2, l3, l4, l5);
            switch(op3){
                case 1:
                    l1.bajalibro();
                break;
                case 2:
                    l2.bajalibro();
                break;
                case 3:
                    l3.bajalibro();
                break;
                case 4:
                    l4.bajalibro();
                break;
                case 5:
                    l5.bajalibro();
                break;        
            }
        break;
        case 3:
            System.out.println("Dime que libro quieres coger prestado:");
            op2=menulibros(l1, l2, l3, l4, l5);
            switch(op2){
                case 1:
                    l1.prestamo();
                break;
                case 2:
                    l2.prestamo();
                break;    
                case 3:
                    l3.prestamo();
                break;
                case 4:
                    l4.prestamo();
                break;
                case 5:
                    l5.prestamo();
                break;
                case 6:
                break;
                default:
                System.out.println("No has escogido una opción correcta.");
            }
        break;
        case 4:
            System.out.println("");
            System.out.println("Dime que libro quieres devolver:");
            op2=menulibros(l1, l2, l3, l4, l5);
            switch(op2){
                case 1:
                    l1.devolucion();
                break;
                case 2:
                    l2.devolucion();
                break;    
                case 3:
                    l3.devolucion();
                break;
                case 4:
                    l4.devolucion();
                break;
                case 5:
                    l5.devolucion();
                break;
                case 6:
                break;
                default:
                System.out.println("No has escogido una opción correcta.");
            break;
            }
        case 5:
        break;
        default:
            System.out.println("No has escogido una opción correcta.");
    }
    return op1;
    }
}
