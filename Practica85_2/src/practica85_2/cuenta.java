/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica85_2;

/**
 * Clase cuenta. Encontramos diferentes métodos los cuales nos permitirá 
 * realizar diferentes operaciones como el ingreso, el reintegro o la 
 * transferencia.
 * @author pablo
 */
public class cuenta {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String DNI;
    private float saldo;
    private float tipo_interes;
    private int num_cuenta;
    
    /*Constructor por defecto*/
    public cuenta(){
        
    }
    /*Constructor con parámetros*/
    public cuenta(String nombre, String apellido1, String apellido2, String DNI,
            float saldo, float tipo_interes, int num_cuenta){
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.DNI=DNI;
        this.saldo=saldo;
        this.tipo_interes=tipo_interes;
        this.num_cuenta=num_cuenta;
    }
    /*Constructor copia*/
    public cuenta(cuenta c1) {
        this.tipo_interes=c1.tipo_interes;
    }
    /*Getters y Setters para guardar los datos de cada objeto de la clase*/
     public void setnombre(String nombre){
        this.nombre=nombre;
    }
      public void setapellido1(String apellido1){
        this.apellido1=apellido1;
    }
       public void setapellido2(String apellido2){
        this.apellido2=apellido2;
    }
        public void setDNI(String DNI){
        this.DNI=DNI;
    }
    public void setsaldo(float saldo){
        this.saldo=saldo;
    }
    public void setinteres(float tipo_interes){
        this.tipo_interes=tipo_interes;
    }
    public void setncuenta(int num_cuenta){
        this.num_cuenta=num_cuenta;
    }    
    
    public String getnombre(){
        return nombre;
    }
    public String getapellido1(){
        return apellido1;
    }
    public String getapellido2(){
        return apellido2;
    }
    public String getDNI(){
        return DNI;
    }
    public float getsaldo(){
        return saldo;
    }
    public float getinteres(){
        return tipo_interes;
    }
    public int getncuenta(){
        return num_cuenta;
    }
    
    /**Método para realizar un ingreso en las cuentas
     * @param ingreso Variable con la cantidad que se desea ingresar en la cuenta.
     */
    public void ingreso(float ingreso){
        saldo=saldo+ingreso;
}
    /**Método para realizar un reintegro en las cuentas
     * @param reintegro Variable con la cantidad que se desea sacar de la cuenta
     */
    public void reintegro(float reintegro) {
        saldo=saldo-reintegro;
}
    /**Métodos para realizar una trensferencia negativa en las cuentas
     * @param reintegro Variable con la cantidad que se desea sacar de la cuenta
     */
    public void transferencianeg(float reintegro) {
        saldo=saldo-reintegro;
}
    /**Métodos para realizar una trensferencia positiva en las cuentas
     * @param ingreso Variable con la cantidad que se desea ingresar en la cuenta
     */
    public void transferenciapos(float ingreso) {
        saldo=saldo+ingreso;
}
}
