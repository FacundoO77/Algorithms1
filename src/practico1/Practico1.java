/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Practico1;

/**
 *
 * @author Facundo
 */
public class Practico1 {

    public static void main(String[] args) {
        ejercicio8(8);
    }

    // Ejercicio 3
    // Implemente un método que, dado un número entero N, muestre los primeros N números
    // impares, comenzando desde 1
    public static void ejercicio3(int num) {
        /* 
        for(int i=1; i <= num;i++){
        if((i % 2)!= 0){
            System.out.println(i);
        }
         */
        for (int i = 1; i <= num; i = i + 2) {
            System.out.println(i);
        }

    }

    //Ejercicio 4
    //Implemente un método que reciba un número entero positivo e imprima en pantalla sus dígitos
    //por separado.
    //Pruebe el método con los siguientes valores: 5, 1523, 20, 100000.
    public static void ejercicio4(int num) {

        String cadena = "" + num;

        for (int i = 0; i < cadena.length(); i++) {

            System.out.println(cadena.charAt(i));

        }

    }

    //Ejercicio 5
    //Implemente un método que reciba un número entero y retorne su versión invertida.
    //Ejemplo: 1234 → 4321
    public static void ejercicio5(int num) {

        String cadena = "" + num;
        String temp = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {

            temp += cadena.charAt(i);

        }

        System.out.println(temp);

    }

    //Ejercicio 6
    //Implemente un método que reciba una palabra (String) y retorne un valor booleano,
    //indicando si la palabra es un palíndromo
    public static void ejercicio6(String palabra) {

        String invertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }

        boolean resultado = palabra.equals(invertida);

        System.out.println(resultado);

    }
//Ejercicio 7
//Implemente un método que reciba un N y muestre por pantalla un triángulo de N filas
//con *:
//Ej: para N = 4
//*
//**
//***
//****

    public static void ejercicio7(int n) {
        String ret = "*";
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.println(ret);
                ret += "*";

            }
        }
    }
//Ejercicio 8
//Implemente un método que reciba un número entero positivo N y muestre por pantalla los primeros
//N términos de la serie de Fibonacci.
//Ejemplo para N = 6: Salida: 0 1 1 2 3 5
    public static void ejercicio8(int n) { //F(n) = F(n-1) + F(n-2)

        int a = 0;
        int b = 1;
        int next = 0;
        for (int i = 1; i < n; i++) {
            next += a +b; //1, 2
            a = next; //1 2
        }
        System.out.println(a + "\n" +b);
    }


}
