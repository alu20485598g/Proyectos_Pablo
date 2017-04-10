/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica83;

/**
 *
 * @author pablo
 */
public class Practica83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ecuacion2 ec = new ecuacion2();
    ec.pedira();
    ec.pedirb();
    ec.pedirc();
    ec.calculoraiz();
    ec.resultado1();
    ec.resultado2();
    System.out.println("Los dos resultados de la ecuación de 2º grado son: ");
    System.out.print("Resultado 1: "+ ec.getresultado1());
    System.out.println("");
    System.out.print("Resultado 2: "+ ec.getresultado2());
    System.out.println("");
    }
    
}
