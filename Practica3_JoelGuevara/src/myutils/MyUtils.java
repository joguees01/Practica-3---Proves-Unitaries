/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

/**
 *
 * @author Raúl Classe de funcions pròpies utils.
 */

public class MyUtils {
   
    /**
     * @param cadena String cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        if (cadena == null) {
            return null;
        }
        String resultat = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultat += cadena.charAt(i);
        }
        return resultat;
    }
    
    /**
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates impossibles retorna -2
     */
    public static int edat(int day, int month, int year) {
        int currentYear = java.time.Year.now().getValue();
        if (year > currentYear || year <= 0 || month <= 0 || month > 12 || day <= 0 || day > 31) {
            return -2; // fecha incorrecta
        }
        int age = currentYear - year;
        if (age > 150) {
            return -1; // edad improbable
        }
        if (month > java.time.MonthDay.now().getMonthValue() || 
            (month == java.time.MonthDay.now().getMonthValue() && day > java.time.MonthDay.now().getDayOfMonth())) {
            age--; // todavía no ha pasado el cumpleaños
        }
        return age;
    }

    /**
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna -1.
     */
    public static double factorial(double numero) {
        if (numero < 0) {
            return -1;
        }
        if (numero == 0) {
            return 1;
        } else {
            double resultat = numero * factorial(numero - 1);
            return resultat;
        }
    }
}