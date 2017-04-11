/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica76;

/**
 * Clase Calculadora. Encontramos todos los métodos para realizar las 
 * diferentes operaciones.
 * @author pablo
 */
public class Calculadora {
    /** Método que devuelve la suma de num1 y num2
     * @param num1 Variable donde encontramos el valor del primer número.
     * @param num2 Variable donde encontramos el valor del segundo número.
     * @return Devolverá un número de tipo float como resultado 
     * de la operación suma.*/
    public float suma(float num1, float num2) {
		return num1 + num2;
	}
     /** Método que devuelve la resta de num1 y num2
     * @param num1 Variable donde encontramos el valor del primer número.
     * @param num2 Variable donde encontramos el valor del segundo número.
     * @return Devolverá un número de tipo float como resultado 
     * de la operación resta.*/
    public float resta(float num1, float num2) {
		return num1 - num2;  
	}
    /** Método que devuelve la multiplicación de num1 y num2
     * @param num1 Variable donde encontramos el valor del primer número.
     * @param num2 Variable donde encontramos el valor del segundo número.
     * @return Devolverá un número de tipo float como resultado 
     * de la operación multiplicación.*/
    public float multi(float num1, float num2) {
		return num1 * num2;
        }
    /** Método que devuelve la división de num1 y num2
     * @param num1 Variable donde encontramos el valor del primer número.
     * @param num2 Variable donde encontramos el valor del segundo número.
     * @return Devolverá un número de tipo float como resultado 
     * de la operación división.*/
    public float divi(float num1, float num2) {
		return num1 / num2;
	}
}
