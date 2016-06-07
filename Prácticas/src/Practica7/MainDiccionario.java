package Practica7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Yeray on 07/06/2016.
 */
public class MainDiccionario {

    public static void main(String[] args) {
        boolean sigue = true;

        Diccionario diccionario = new Diccionario();
        System.out.println("BIENVENIDO AL DICCIONARIO.\nSeleccione qué desea hacer:\n1. Añadir definición.\n2. Buscar.");
        System.out.println("3. Salir.");

        while (sigue) {

            System.out.print("OPCION: ");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("¿Qué palabra desea introducir?");
                scanner = new Scanner(System.in);
                String palabra = scanner.next();

                ArrayList<String> definiciones = new ArrayList<>();
                boolean otra = true;

                System.out.println("Introduzca su definición. Para detener la introducción introduzca FIN.");

                while (otra) {
                    scanner = new Scanner(System.in);
                    String definicion = scanner.nextLine();
                    if (definicion.contains("FIN")) {
                        otra = false;
                    } else {
                        definiciones.add(definicion);
                    }
                }

                diccionario.addEntry(palabra, definiciones);

            } else if (opcion == 2) {

                boolean noExiste = true;
                boolean menu = false;
                String palabra = "";

                while (noExiste) {
                    System.out.println("¿Qué palabra desea buscar?");
                    scanner = new Scanner(System.in);
                    palabra = scanner.next();

                    if (palabra.startsWith("S") && palabra.length() == 1) {
                        menu = true;
                        break;
                    }

                    if (!diccionario.contains(palabra)) {
                        System.out.println("ERROR. No existe la palabra en el diccionario. Vuelva a intentarlo. (S para SALIR).");
                        noExiste = true;
                    } else {
                        noExiste = false;
                    }
                }

                if (menu) {
                    continue;
                }

                System.out.println("Sus definiciones son:");
                ArrayList<String> definiciones = diccionario.search(palabra);

                for (int i = 0; i < definiciones.size(); i++) {
                    System.out.println("Definición " + (i + 1) + ": " + definiciones.get(i));
                }

            } else if (opcion == 3) {
                sigue = false;
            } else {
                System.out.println("OPCION INCORRECTA.");
            }
        }
    }


}
