package Practica7;

import java.util.ArrayList;

/**
 * Created by Yeray on 07/06/2016.
 */
public class Pila {

    ArrayList<Integer> array = new ArrayList();

    public void push(Integer i) {
        array.add(i);
    }

    public int pop() {
        int aux = array.get(array.size() - 1);
        array.remove(aux);
        return aux;
    }

    public void clear() {
        while (!array.isEmpty()) {
            array.remove(0);
        }
        return;
    }

    public int numElementos() {
        return array.size();
    }

    public int primero() {
        return array.get(0);
    }

    public int ultimo() {
        return array.get(array.size() - 1);
    }

}
