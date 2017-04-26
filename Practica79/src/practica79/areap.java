/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica79;

/**
 * Clase areap. Encontramos el método getarea el cual nos permitirá calcular el 
 * área del pentágono.
 * @author pablo
 */
public class areap {
    private float resul;
    private float apotema;
    private float perimetro;
    /** Método que devuelve el área del pentágono
* @param r Variable que coje de la clase principal y donde encontramos el radio 
* del pentágono pasado por el usuario.
* @param l Variable que coje de la clase principal y donde encontramos el lado 
* del pentágono pasado por el usuario.
* @return Devolverá un número de tipo float con el valor del área(resul).*/
public float getarea(float r, float l){
    apotema = (float) Math.sqrt(Math.pow(r,2) - Math.pow((l/2),2));
    perimetro = l*5;
    resul= perimetro*apotema/2;
    return resul;
} 
}
