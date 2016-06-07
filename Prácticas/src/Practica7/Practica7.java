package Practica7;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Yeray on 07/06/2016.
 */
public class Practica7 {

    public static void main(String[] args) {
        Pila p1 = new Pila();
        p1.push(4);
        p1.push(3);
        p1.push(2);
        int sacado = p1.pop();
        System.out.println("Leído: " + sacado);
        System.out.println("Quedan " + p1.numElementos() + " elementos");
        int primero = p1.primero();
        int ultimo = p1.ultimo();
        System.out.println("Primero: " + primero);
        System.out.println("Último: " + ultimo);
        p1.clear(); // borra todos los elementos
        System.out.println("Tras el clear() quedan " + p1.numElementos() + " elementos");

        //Apartado 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduzca la cadena: ");
        String string = scanner.nextLine();
        System.out.println("");
        StringTokenizer st = new StringTokenizer(string, " ");
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            System.out.println(s);
        }
    }

}
