package Practica7;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Yeray on 07/06/2016.
 */
public class Diccionario {

    HashMap<String, ArrayList> diccionario = new HashMap<>();

    public void addEntry(String word, ArrayList def) {
        diccionario.put(word, def);
    }

    public ArrayList search(String word) {
        return diccionario.get(word);
    }

    public boolean contains(String word) {
        return diccionario.containsKey(word);
    }
}
