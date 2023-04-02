/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myutils;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here

        // Cadena
        System.out.println("-Ejemplos de cadena:");
        String cadena1 = "Hola mundo!";
        String cadena2 = "";
        String cadena3 = null;

        System.out.println(MyUtils.inverteix(cadena1)); // Output: !odnum aloH
        System.out.println(MyUtils.inverteix(cadena2)); // Output: 
        System.out.println(MyUtils.inverteix(cadena3)); // Output: null
        System.out.println();

        // Factorial
        System.out.println("-Ejemplos de factorial:");
        int day1 = 1, month1 = 1, year1 = 2000; // cumpleaños pasado
        int day2 = 1, month2 = 4, year2 = 2003; // cumpleaños aún no pasado
        int day3 = 29, month3 = 2, year3 = 2020; // año bisiesto
        int day4 = 31, month4 = 4, year4 = 2001; // mes con 31 días
        int day5 = 31, month5 = 6, year5 = 2001; // mes con 30 días
        

        System.out.println(MyUtils.edat(day1, month1, year1)); // Output: 23
        System.out.println(MyUtils.edat(day2, month2, year2)); // Output: 19
        System.out.println(MyUtils.edat(day3, month3, year3)); // Output: 3
        System.out.println(MyUtils.edat(day4, month4, year4)); // Output: -2 (fecha incorrecta)
        System.out.println(MyUtils.edat(day5, month5, year5)); // Output: 21
        System.out.println();

        // Edat
        System.out.println("-Ejemplos de edat:");
        double numero1 = 5;
        double numero2 = 0;
        double numero3 = -1;

        System.out.println(MyUtils.factorial(numero1)); // Output: 120.0
        System.out.println(MyUtils.factorial(numero2)); // Output: 1.0
        System.out.println(MyUtils.factorial(numero3)); // Output: -1.0
        System.out.println();

    }
}
