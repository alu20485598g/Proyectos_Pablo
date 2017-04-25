/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica78;

/**
 * Clase areat. Encontramos el método getarea el cual nos permitirá calcular el 
 * área del triángulo.
 * @author pablo
 */
public class areat {
    private float resul;
    /** Método que devuelve el perímetro de la circunferencia
* @param b Variable que coje de la clase principal y donde encontramos la base 
* del triángulo pasado por el usuario.
* @param h Variable que coje de la clase principal y donde encontramos la altura 
* del triángulo pasado por el usuario.
* @return Devolverá un número de tipo float con el valor del perímetro(resul).*/
public float getarea(float b, float h){
    resul=h*b/2;
    return resul;
} 
}
