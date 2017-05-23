/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica85_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 ** Clase Menu. Encontramos diferentes métodos los cuales nos permitirá 
 * movernos entre los diferentes menús para escoger diferentes opciones.
 * @author pablo
 */
public class Menu {
    /** Método que nos permite escoger con que cuenta queremos operar.
     * 
     * @return Nos devuelve la opción que hemos elegido.
     */    
    public int menucuentas(){
    System.out.println();
    Scanner teclado01 = new Scanner(System.in);
    System.out.println("Dime con que cuenta quieres operar:");
    System.out.println("1.Cuenta Nº1");
    System.out.println("2.Cuenta Nº2");
    System.out.println("3.Cuenta Nº3");
    System.out.println("4.Salir");
    System.out.println();
    return teclado01.nextInt();
    }
    /** Método que nos permite escoger que operación queremos realizar.
     *
     * @return Nos devuelve la opción que hemos elegido.
     */
    public int menuoperacion(){
    System.out.println();
    Scanner teclado02 = new Scanner(System.in);
    System.out.println("Dime que operación quieres realizar:");
    System.out.println("1.Ingresar");
    System.out.println("2.Extraer");
    System.out.println("3.Realizar una transferencia.");
    System.out.println("4.Mostrar datos.");
    System.out.println("5.Volver al menú anterior para elegir cuenta.");
    System.out.println();
    return teclado02.nextInt();
    }
    
    /**Método que nos permite ir a un menú u otro dependiendo de la cuenta que 
     * hemos elegido.
     *
     * @param op1 Variable que guarda la opción escogida en el menucuentas()
     * @param op2 Variable que guarda la opción escogida en el menuoperacion()
     * @param cuentas ArrayList con todos los objetos de la clase cuenta
     * @return Nos devuelve la opción que hemos elegido.
     */
    public int menuswitch1(int op1, int op2, ArrayList<cuenta> cuentas){
    op1=menucuentas();
    switch(op1){
        case 1:
            menuswitch2(op1, op2, cuentas);
        break;
        case 2:
            menuswitch2(op1, op2, cuentas);
        break;
        case 3:
            menuswitch2(op1, op2, cuentas);
        break;
        case 4:
        break;
        default:
            System.out.println("No has escogido una opción correcta.");
    }
    return op1;
    }
     /** Método que nos permite realizar una operación u otra dependiendo del 
     * valor op2
     *
     * @param op1 Variable que guarda la opción escogida en el menucuentas()
     * @param op2 Variable que guarda la opción escogida en el menuoperacion()
     * @param cuentas ArrayList con todos los objetos de la clase cuenta
     */
    public void menuswitch2(int op1, int op2, ArrayList<cuenta> cuentas){
        float ingreso;
        float reintegro;
        while (op2!=5){
            op2=menuoperacion();
            switch(op2){
                case 1:
                    ingreso=cantingreso();
                    if (op1==1){
                        cuentas.get(0).ingreso(ingreso);
                        System.out.println("Ingreso realizado. Tu saldo actual "
                                + "es de "+ cuentas.get(0).getsaldo()+" €.");}
                     if (op1==2){
                        cuentas.get(1).ingreso(ingreso);
                        System.out.println("Ingreso realizado. Tu saldo actual "
                                + "es de "+ cuentas.get(1).getsaldo()+" €.");}
                      if (op1==3){
                        cuentas.get(2).ingreso(ingreso);
                        System.out.println("Ingreso realizado. Tu saldo actual "
                                + "es de "+ cuentas.get(2).getsaldo()+" €.");}
                break;
                case 2:
                    reintegro=cantreintegro();
                    if (op1==1){
                      cuentas.get(0).reintegro(reintegro);
                      System.out.println("Reintegro realizado. Tu saldo actual "
                                + "es de "+ cuentas.get(0).getsaldo());}
                    if (op1==2){
                      cuentas.get(1).reintegro(reintegro);
                      System.out.println("Reintegro realizado. Tu saldo actual "
                                + "es de "+ cuentas.get(1).getsaldo());}
                    if (op1==3){
                      cuentas.get(2).reintegro(reintegro);
                      System.out.println("Reintegro realizado. Tu saldo actual "
                                + "es de "+ cuentas.get(2).getsaldo());}
                break;
                case 3:
                    transferencia(op1, cuentas);
                break;
                case 4:
                    System.out.println("Datos de la cuenta del titular:");
                    if (op1==1){
                      System.out.println("Nombre completo: "+ cuentas.get(0).getnombre()+" "
                            + cuentas.get(0).getapellido1() +" "+ cuentas.get(0).getapellido2());
                      System.out.println("DNI: " + cuentas.get(0).getDNI());
                      System.out.println("Tipo de interés: "+ cuentas.get(0).getinteres());
                      System.out.println("Saldo: "+ cuentas.get(0).getsaldo());
                    }
                    if (op1==2){
                      System.out.println("Nombre completo: "+ cuentas.get(1).getnombre()+" "
                            + cuentas.get(1).getapellido1() +" "+ cuentas.get(1).getapellido2());
                      System.out.println("DNI: " + cuentas.get(1).getDNI());
                      System.out.println("Tipo de interés: "+ cuentas.get(1).getinteres());
                      System.out.println("Saldo: "+ cuentas.get(1).getsaldo());
                    }
                    if (op1==3){
                        System.out.println("Nombre completo: "+ cuentas.get(2).getnombre()+" "
                            + cuentas.get(2).getapellido1() +" "+ cuentas.get(2).getapellido2());
                      System.out.println("DNI: " + cuentas.get(2).getDNI());
                      System.out.println("Tipo de interés: "+ cuentas.get(2).getinteres());
                      System.out.println("Saldo: "+ cuentas.get(2).getsaldo());
                    }
                break;
                case 5:
                break;
                default:
                    System.out.println("No has escogido una opción correcta.");                    
            }
        if (op2 == 5){
            System.out.println("Volviendo al menú para elegir cuenta...");
        }
    }
    }
     /** Método para preguntarle el usuario la cantidad que desea ingresar.
     *
     * @return Nos devuelve la cantidad a ingresar
     */
    public float cantingreso(){
        Scanner teclado01 = new Scanner(System.in);
        System.out.print("Cantidad a ingresar: ");
        return teclado01.nextFloat();
    }
    /** Método para preguntarle el usuario la cantidad que desea retirar.
     *
     * @return Nos devuelve la cantidad a retirar
     */
    public float cantreintegro(){
        Scanner teclado02 = new Scanner(System.in);
        System.out.print("Cantidad a retirar: ");
        return teclado02.nextFloat();
    }
    /** Método para realizar las diferentes transferencia entre cuentas
     *
     * @param op1 Variable que guarda la opción escogida en el menucuentas()
     * @param cuentas ArrayList con todos los objetos de la clase cuenta
     */
    public void transferencia(int op1, ArrayList<cuenta> cuentas){
        int cuentadestino;
        float cantidad;
        switch (op1){
            case 1:
                System.out.println("Ahora se encuentra en la cuenta Nº1.");
                Scanner teclado03 = new Scanner(System.in);
                System.out.println("¿A que cuenta quieres realizar una "
                        + "transferencia?");
                System.out.println("1. A la cuenta Nº2");
                System.out.println("2. A la cuenta Nº3");
                cuentadestino=teclado03.nextInt();
                System.out.println();
                Scanner teclado04 = new Scanner(System.in);
                System.out.println("¿Cuánto quieres transferir?");
                cantidad=teclado04.nextFloat();
                cuentas.get(0).transferencianeg(cantidad);
                if (cuentadestino==1){
                    cuentas.get(1).transferenciapos(cantidad);
                }
                if (cuentadestino==2){
                    cuentas.get(2).transferenciapos(cantidad);
                }
                System.out.println("Operacion realizada con éxito. Su saldo "
                        + "actual es de "+ cuentas.get(0).getsaldo()+"€.");
            break;
            case 2:
                System.out.println("Ahora se encuentra en la cuenta Nº2.");
                Scanner teclado05 = new Scanner(System.in);
                System.out.println("¿A que cuenta quieres realizar una "
                        + "transferencia?");
                System.out.println("1. A la cuenta Nº1");
                System.out.println("2. A la cuenta Nº3");
                cuentadestino=teclado05.nextInt();
                System.out.println();
                Scanner teclado06 = new Scanner(System.in);
                System.out.println("¿Cuánto quieres transferir?");
                cantidad=teclado06.nextFloat();
                cuentas.get(1).transferencianeg(cantidad);
                if (cuentadestino==1){
                    cuentas.get(0).transferenciapos(cantidad);
                }
                if (cuentadestino==2){
                    cuentas.get(2).transferenciapos(cantidad);
                }
                System.out.println("Operacion realizada con éxito. Su saldo "
                        + "actual es de "+ cuentas.get(1).getsaldo()+"€.");
            break;
            case 3:
                System.out.println("Ahora se encuentra en la cuenta Nº3.");
                Scanner teclado07 = new Scanner(System.in);
                System.out.println("¿A que cuenta quieres realizar una "
                        + "transferencia?");
                System.out.println("1. A la cuenta Nº1");
                System.out.println("2. A la cuenta Nº2");
                cuentadestino=teclado07.nextInt();
                System.out.println();
                Scanner teclado08 = new Scanner(System.in);
                System.out.println("¿Cuánto quieres transferir?");
                cantidad=teclado08.nextFloat();
                cuentas.get(2).transferencianeg(cantidad);
                if (cuentadestino==1){
                    cuentas.get(0).transferenciapos(cantidad);
                }
                if (cuentadestino==2){
                    cuentas.get(1).transferenciapos(cantidad);
                }
                System.out.println("Operacion realizada con éxito. Su saldo "
                        + "actual es de "+ cuentas.get(2).getsaldo()+"€.");
            break;
        }
    }
}