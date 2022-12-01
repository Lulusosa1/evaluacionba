package org.example;

public class Multiplos {
    private void multiplos() {
        String valor = "";
        for (int i = 1; i <= 100; i++) {
            if (i == 3) {
                valor = "SOMOS";
            } else {
                if (i == 5) {
                    valor = "BA";
                } else {
                    if (i % 3 == 0 || i % 5 == 0) {
                        valor = "SOMOS BA";
                    } else {
                        valor = String.valueOf(i);
                    }
                }

            }
            System.out.println("Numero:" + valor);
        }

    }

}
