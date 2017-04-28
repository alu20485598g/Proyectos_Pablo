/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica86;

import java.util.Scanner;

/**
 * Clase Distancia. Encontramos diferentes métodos los cuales nos permitirá 
 * pedir los pies al usuario y convertir los pies al resto de unidades.
 * @author pablo
 */
public class Distancia {
    private float pies;
    private float yardas;
    private float pulgadas;
    private float metros;
    private float cm;
    /**Método que pide al usuario los pies a converir.
     * 
     */
    public void PedirPies(){
        System.out.print("Dime cuantos pies quieres convertir: ");
        Scanner teclado = new Scanner(System.in);
        pies=teclado.nextInt();
    }
    /**Método que convierte los pies en el resto de unidades.
     * 
     */
    public void Convertir(){
        yardas = pies/3;
        pulgadas = pies*12;
        metros = (float) (pies*0.3048);
        cm = (float) (pies*30.48);
    }
    /**Método que devuelve las unidades convertidas.
     * 
     */
    public void GetConvertir(){
        System.out.println("-----------------------------------");
        System.out.println("Los piess introducidos equivalen a:");
        System.out.println("-----------------------------------");
        System.out.println("Yardas: "+ yardas);
        System.out.println("Pulgadas: "+ pulgadas);
        System.out.println("Metros: "+ metros);
        System.out.println("Centimetros: "+ cm);
        }
}
