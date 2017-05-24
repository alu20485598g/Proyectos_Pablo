/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica89;

import java.util.Calendar;
import java.util.Scanner;

/** Clase fecha. Encontramos diferentes métodos los cuales nos permitirá 
 * realizar diferentes operaciones como la comprobacion de una fecha o la 
 * impresión por pantalla de la fecha actual, además de los getters y setters.
 *
 * @author pablo
 */
public class fecha {
    private int day;
    private int month;
    private int year;
    private float r1;
    private float r2;
    private float r3;
    private int dact;
    private int mact;
    private int yact;
    
    
    public fecha(){ //Constructor por defecto
        
    }

    public fecha(int day, int month, int year){ //Constructor con parámetros
        this.day=day;
        this.month=month;
        this.year=year;
    }
    /** Método get de la variable day
     * @return Devuelve el valor de day
     */
    public int getday(){
        return day;
    }
    /**Método set de la variable day
     * @param day Variable con el valor de day
     */    
    public void setday(int day){
        this.day=day;
    }
    /** Método get de la variable month
     * @return Devuelve el valor de month
     */
    public int getmonth(){
        return month;
    }
    /**Método set de la variable month
     * @param month Variable con el valor de month
     */    
    public void setmonth(int month){
        this.month=month;
    }
    /** Método get de la variable year
     * @return Devuelve el valor de year
     */
    public int getyear(){
        return year;
    }
    /**Método set de la variable year
     * @param year Variable con el valor de year
     */    
    public void setyear(int year){
        this.year=year;
    }
 
    /** Método que nos permite comprobar si la fecha introducida es correcta.
     *
     */
    public void checkfecha(){
        
    r1 = year%4;
    r2 = year%400;
    r3 = year%100;
    
    if (month <= 0 || month > 12){System.out.println();
    System.out.println("Error. El mes "+ month 
            +" no existe.");}
    else{if (day <= 0 || day > 31) {System.out.println();
    System.out.println("Error. El día "+ day 
            +" no existe.");}
    else{if(r2 == 0 && r3 == 0 && month == 2 && day > 29){System.out.println();
        System.out.println("Error. El mes "+ month +" del año "+ year +
                " no tiene más de 29 días.");}
    else{if(r2 == 0 && r3 != 0 && month == 2 && day > 29){System.out.println(); 
        System.out.println("Error. El mes "+ month +" del año "+ year +
                " no tiene más de 29 días.");}
    else{if(r2 != 0 && r3 == 0 && month == 2 && day > 28){System.out.println();
        System.out.println("Error. El mes "+ month +" del año "+ year +
                " no tiene más de 28 días.");}       
    else{if (r1 == 0 && month == 2 && day > 29){System.out.println();
        System.out.println("Error. El mes "+ month +" del año "+ year +
                " no tiene más de 29 días.");}
    else{if (r1 != 0 && month == 2 && day > 28){System.out.println();
        System.out.println("Error. El mes "+ month +" del año "+ year +
                " no tiene más de 28 días.");}
    else{if (month == 4 || month == 6 || month == 9 || month == 11 && day > 30){
        System.out.println();
        System.out.println("Error. El mes "+ month +" del año "+ year +
                " no tiene más de 30 días.");}
    else{System.out.println();
    System.out.println("Fecha correcta. La fecha introducida es "
            + day +" del "+ month +" del "+ year +".");}
    }}}}}}}
    }

    /** Método que nos permite imprimir la fecha actual del sistema
     *
     */
    public void fechasys(){
        Calendar c = Calendar.getInstance();
        dact = c.get(Calendar.DATE);
        mact = c.get(Calendar.MONTH);
        yact = c.get(Calendar.YEAR);
        mact = mact+1;
        System.out.println();
        System.out.println("Fecha actual del sistema: "+ dact + " del "+ mact +
                " del "+ yact +".");       
    }

}


