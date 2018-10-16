/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numromanos;

import java.util.Scanner;

import java.util.InputMismatchException;

/**
 *
 * @author denni
 */
public class NumRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaramos las variables
        String opcion;
        int valor = 0;
        do {
            System.out.println("Introduzca un número de 1 a 1000: ");

            try {
                valor = entrada.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Ingreso carácteres");
            }
        } while ((valor < 1) || (valor > 1000));
        String unidades, decenas, centenas, millar;
        int numeroVa;
        numeroVa = valor;

//Operación de unidades por el residuo
        int residuoUni = numeroVa % 10;

//Operación de decenas por el residuo
        int numeroDecena = numeroVa / 10;
        int residuoDec = numeroDecena % 10;

//Operación de centenas por el residuo
        int numeroCentena = numeroVa / 100;
        int residuoCen = numeroCentena % 10;

//Operación de millar por el residuo
        int residuoMi = numeroVa / 1000;
        
//En estos 3 switch hacemos una validación del residuo y de acuerdo al residuo se le asigna el valor 
//a las cadenas unidades, decenas, centenas y millar.

        switch (residuoUni) //Unidades
        {
            case 1:
                unidades = "I";
                break;
            case 2:
                unidades = "II";
                break;
            case 3:
                unidades = "III";
                break;
            case 4:
                unidades = "IV";
                break;
            case 5:
                unidades = "V";
                break;
            case 6:
                unidades = "VI";
                break;
            case 7:
                unidades = "VII";
                break;
            case 8:
                unidades = "VIII";
                break;
            case 9:
                unidades = "IX";
                break;
            default:
                unidades = "";
                break;
        }

        switch (residuoDec) //Decenas
        {
            case 1:
                decenas = "X";
                break;
            case 2:
                decenas = "XX";
                break;
            case 3:
                decenas = "XXX";
                break;
            case 4:
                decenas = "XL";
                break;
            case 5:
                decenas = "L";
                break;
            case 6:
                decenas = "LX";
                break;
            case 7:
                decenas = "LXX";
                break;
            case 8:
                decenas = "LXXX";
                break;
            case 9:
                decenas = "XC";
                break;
            default:
                decenas = "";
                break;
        }

        switch (residuoCen) //Centenas
        {
            case 1:
                centenas = "C";
                break;
            case 2:
                centenas = "CC";
                break;
            case 3:
                centenas = "CCC";
                break;
            case 4:
                centenas = "CD";
                break;
            case 5:
                centenas = "D";
                break;
            case 6:
                centenas = "DC";
                break;
            case 7:
                centenas = "DCC";
                break;
            case 8:
                centenas = "DCCC";
                break;
            case 9:
                centenas = "CM";
                break;
            default:
                centenas = "";
                break;
        }

        switch (residuoMi) //Millar
        {
            case 1:
                millar = "M";
                break;
            default:
                millar = "";
                break;
        }

//En esta parte convertimos la cadena a entero y validamos que el valor total introducido sea
//de un rango de 1 a 100
        System.out.println("En numero romano es: " + millar + centenas + decenas + unidades);

    }
}
