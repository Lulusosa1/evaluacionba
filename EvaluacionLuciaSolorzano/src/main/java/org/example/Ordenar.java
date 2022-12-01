package org.example;
import java.util.Arrays;

public class Ordenar {
    private  void ordenar(){
        int[] arr = new int[]{50,5,10,36,25,85,23,65};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        Arrays.sort(arr);
        System.out.println("\n Lista Ordenada: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }


    }


}
