package org.example;

public class Anagrama {

    private boolean esAnagrama(String s1, String s2) {
        boolean respuesta = false;
        if (s1.trim().length() == s2.trim().length()) {
            int contador2 = 0;
            for (int contador = 0; contador < s1.length(); contador++) {
                for (int contador1 = 0; contador1 < s1.length(); contador1++) {
                    if (s1.charAt(contador) == s2.charAt(contador1)) {
                        ++contador2;
                    }
                }
            }
            if (contador2 == s1.length()) {
                return (true);
                //System.out.println("Es un anagrama");
            } else {
                return (false);
                //System.out.println("No es un anagrama");
            }
        } else {
            return false;
        }
    }
    }
