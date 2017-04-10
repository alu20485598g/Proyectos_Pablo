/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica81;

/**
 *
 * @author pablo
 */
public class ayve {
    private float resul;
    
public float getarea(float r){
    resul=(float) (4*Math.PI*Math.pow(r,2));
    return resul;
}
public float getvolumen(float r){
    resul=(float) ((4*Math.PI*Math.pow(r,3))/3);
    return resul;
} 
}
