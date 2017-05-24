/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica88;

import java.util.ArrayList;
import java.util.Scanner;

/**
 ** Clase libro. Encontramos diferentes métodos los cuales nos permitirá 
 * realizar diferentes operaciones como prestar o devolver un ejemplar y 
 * dar de baja o de alta un libro, además todos los getters y setters para 
 * guardar y devolver los datos.
 * @author pablo
 */
public class libro {
 private int prestado;
 private int ejemplar;
 private String autor;
 private String titulo;
 private String isbn;
    
    public libro(){ //Constructor por defecto
        
    }

    public libro(int ejemplar, int prestado, String autor, String titulo, String isbn){ //Constructor con parámetros
        this.ejemplar=ejemplar;
        this.prestado=prestado;
        this.autor=autor;
        this.titulo=titulo;
        this.isbn=isbn;
    }

    public libro (libro l){ //Constructor copia.
        autor=l.autor;
    }
    /** Método get de la variable isbn
     * @return Devuelve el valor de isbn
     */
    public String getisbn(){
        return isbn;
    }
    /**Método set de la variable isbn
     * @param isbn Variable con el valor de isbn
     */    
    public void setisbn(String isbn){
        this.isbn=isbn;
    }
    /** Método get de la variable autor
     * @return Devuelve el valor de autor
     */
    public String getautor(){
        return autor;
    }
    /**Método set de la variable autor
     * @param autor Variable con el valor de autor
     */   
    public void setautor(String autor){
        this.autor=autor;
    }
    /** Método get de la variable titulo
     *  @return Devuelve el valor de titulo
     */
    public String gettitulo(){
        return titulo;
    }
    /**Método set de la variable titulo
     * @param titulo Variable con el valor de titulo
     */    
    public void settitulo(String titulo){
        this.titulo=titulo;
    }
    /** Método get de la variable ejemplar
     * @return Devuelve el valor de ejemplar
     */
    public int getejemplar(){
        return ejemplar;
    }
    /**Método set de la variable ejemplar
     * @param ejemplar Variable con el valor de ejemplar
     */    
    public void setejemplar(int ejemplar){
        this.ejemplar=ejemplar;
    }
    /**Método get de la variable prestado
     * @return Devuelve el valor de prestado
     */
    public int getprestado(){
        return prestado;
    }
    /**Método set de la variable prestado
     * @param prestado Variable con el valor de prestado
     */    
    public void setprestado(int prestado){
        this.prestado=prestado;
    }
    
    /** Método que nos permite realizar un prestamo de un ejemplar.
     *
     */
    public void prestamo(){
        if (prestado<ejemplar){
            prestado++;
            System.out.println("Ahora hay "+ prestado +" ejemplares prestados.");
            System.out.println("Ejemplares totales: "+ ejemplar+".");
            System.out.println();
        }else{
            System.out.println("Todos los ejemplares están prestados.");
            System.out.println();
        }
    }
    /** Método que nos permite realizar una devolución de un ejemplar.
     *
     */
    public void devolucion(){
        if (prestado==0){
            System.out.println("No hay ningún ejemplar prestado de este "
                    + "libro.");
            System.out.println();
        }else{
            prestado--;
            System.out.println("Ahora hay "+ prestado +" ejemplares prestados.");
            System.out.println("Ejemplares totales: "+ ejemplar+".");
            System.out.println();
        }
    }
    
    /** Método que nos permite dar de alta un nuevo libro. 
     *
     * @param libros ArrayList con todos los objetos de la clase libro
     */
    public void altalibro(ArrayList<libro> libros){
        String aux;
        int n;
        int p=0;
        Scanner teclado01 = new Scanner(System.in);   
        System.out.print("Dime el título del libro: ");
        aux=teclado01.nextLine();
        libros.get(libros.size()-1).settitulo(aux);
        Scanner teclado02 = new Scanner(System.in);   
        System.out.print("Dime el autor del libro: ");
        aux=teclado02.nextLine();
        libros.get(libros.size()-1).setautor(aux);
        Scanner teclado04 = new Scanner(System.in);   
        System.out.print("Dime el ISBN del libro: ");
        aux=teclado04.nextLine();
        libros.get(libros.size()-1).setisbn(aux);
        Scanner teclado03 = new Scanner(System.in);   
        System.out.print("Dime el nº de ejemplares: ");
        n=teclado03.nextInt();
        libros.get(libros.size()-1).setejemplar(n);
        libros.get(libros.size()-1).setprestado(p);
        System.out.println();
    }
    
    /** Método que nos permite dar de baja un libro ya existente. 
     *
     * @param op3 Variable que contiene el valor del tamaña del ArrayList
     * @param libros ArrayList con todos los objetos de la clase libro
     */
    public void bajalibro(int op3, ArrayList<libro> libros){
        if (op3>libros.size()+1 || op3==0){
                System.out.println("No me has dado una opción correcta");
            }else{libros.remove(op3-1);}
        
    }

}