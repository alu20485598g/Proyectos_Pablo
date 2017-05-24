/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica89;

import java.util.Scanner;

/**
 ** Clase Menu. Encontramos diferentes métodos los cuales nos permitirá 
 * movernos entre los diferentes menús para escoger diferentes opciones.
 * @author pablo
 */
public class menu {
    private int d, m, y;

    /** Método que nos permite escoger que queremos realizar
     *
     * @return Devuelve el valor de la opción elegida
     */
    public int menuopcion(){
        System.out.println();
        Scanner teclado01 = new Scanner(System.in);
        System.out.println("Dime que quieres realizar:");
        System.out.println("1. Comprobar si la fecha es correcta.");
        System.out.println("2. Obtener fecha actual.");
        System.out.println("3. Salir.");
        System.out.println();
        return teclado01.nextInt();
    }
    
    /** Método que nos permite preguntarle al usuario una fecha
     *
     * @param f Variable donde se guardan los datos del objeto f
     */
    public void dimefecha(fecha f){
        System.out.println();
        System.out.println("Introduce la fecha a comprobar:");
        Scanner teclado01 = new Scanner(System.in);
        System.out.print("Dime el día: ");
        d = teclado01.nextInt();
        f.setday(d);
    
        Scanner teclado02 = new Scanner(System.in);
        System.out.print("Dime el mes: ");
        m = teclado02.nextInt();
        f.setmonth(m);
        
        Scanner teclado03 = new Scanner(System.in);
        System.out.print("Dime el año: ");
        y = teclado03.nextInt();
        f.setyear(y);
    }
}
