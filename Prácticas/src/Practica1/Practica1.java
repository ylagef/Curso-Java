package Practica1;

public class Practica1 {

    public static void main(String[] args) {

        promedio(1, 2, 7);
        volumenEsfera(5);
        parImpar(3);
        calificar(1);
        calificar(7);
        comprobarPrimo(8);
        calculoSerie();
        serieFactorial();

    }

    static void promedio(int a, int b, int c) {

        float promedio = (float) (a + b + c) / 3;

        System.out.println("1.1 El promedio de " + a + ", " + b + ", " + c + " es: " + promedio);

    }

    static void volumenEsfera(int r) {

        final double PI = Math.PI;

        float volumen = (float) ((4 * PI * (r * r * r)) / 3);

        System.out.println("1.2 El volumen de la esfera de radio " + r + " es: " + volumen);

    }

    static void parImpar(int numero) {

        if ((numero % 2) == 0) {
            System.out.println("2.1 El número " + numero + " es par");
        } else {
            System.out.println("2.1 El número " + numero + " es impar");
        }
    }

    static void calificar(int nota) {

        if (nota < 5 && nota >= 0) {
            System.out.println("2.2 Nota " + nota + " SUSPENSO.");
            return;
        }

        switch (nota) {
            case 5:
            case 6:
                System.out.println("2.2 Nota " + nota + " APROBADO.");
                break;
            case 7:
            case 8:
                System.out.println("2.2 Nota " + nota + " NOTABLE.");
                break;
            case 9:
            case 10:
                System.out.println("2.2 Nota " + nota + " SOBRESALIENTE.");
                break;
            default:
                System.out.println("2.2 No es una nota correcta (entre 0 y 10).");
        }

    }

    static void comprobarPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if ((numero % i) == 0) {
                System.out.println("3.1 El número " + numero + " NO ES PRIMO.");
                return;
            }
        }

        System.out.println("3.1 El número " + numero + " ES PRIMO.");
    }

    static void calculoSerie() {
        float resultado = 0, sumando = 1;
        int iteracion = 1;

        while (sumando > 10e-3) {
            resultado = resultado + sumando;
            iteracion *= 2;
            sumando = (float) 1 / iteracion;
        }

        System.out.println("3.2 El resultado de la serie es: " + resultado);
    }

    static void serieFactorial() {
        float resultado = 1, sumando;
        int iteracion = 1;

        do {
            int factorial = 1;
            for (int i = 1; i <= iteracion; i++) {
                factorial *= i;
            }
            sumando = (float) (1.0 / factorial);
            resultado += sumando;
            iteracion++;
        } while (sumando > 10e-6);

        System.out.println("3.3 El resultado de la serie con factoriales es: " + resultado);

    }
}
