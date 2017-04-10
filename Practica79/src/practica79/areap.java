/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica79;

/**
 *
 * @author pablo
 */
public class areap {
    private float resul;
    private float apotema;
    private float perimetro;
public float getarea(float r, float l){
    apotema = (float) Math.sqrt(Math.pow(r,2) - Math.pow((l/2),2));
    perimetro = l*5;
    resul= perimetro*apotema/2;
    return resul;
} 
}
