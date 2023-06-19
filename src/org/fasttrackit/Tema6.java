package org.fasttrackit;

import java.util.Random;
import java.util.Scanner;

public class Tema6 {
    public static void main(String[] args) {
        int[] A = {34, 55, 2, 14, 146, 155, 198};
        int x = 67;
        // NrIntregi(A);
        //int sum = NrIntregi(A);
        //System.out.println(sum);
        //NrImpare(A);
        //int impare = NrImpare(A);
        //System.out.println(impare);

        // int[] F = { };
        //F = MaiMari(A,67);
        // for (int i = 0; i < F.length; i++){

        // System.out.println(F[i] + " " );
        // }
        //Ex4();
        //Ex5();
        Ex6();
    }

    public static int NrIntregi(int[] vector) {
        int sum = 0;

        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }
        return sum;
    }

    public static int NrImpare(int[] vector) {
        int impare = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 != 0) {
                impare++;

            }

        }
        return impare;
    }

    public static int[] MaiMari(int[] vector, int x) {

        int d = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > x) {

                d += 1;
            }
        }
        int[] B = new int[d];
        d = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > x) {
                B[d] = vector[i];
                d += 1;
            }
        }

        return B;
    }

    public static void Ex4() {
        Random donatii = new Random();
        int sumaFinala = 500;
        int sumaCurenta = 0;

        while (sumaCurenta < sumaFinala) {
            sumaCurenta += donatii.nextInt(10) + 1;

        }
        if (sumaCurenta >= sumaFinala) {
            System.out.println(sumaCurenta + " Succes!!! ");
        }
    }
    public static void Ex5() {
        Random donatii = new Random();
        int sumaFinala = 500;
        int sumaCurenta = 0;
        int nrMaxDonatii = 50;
        int nrCurentDonatii = 0;
        while (sumaCurenta < sumaFinala && nrCurentDonatii <= nrMaxDonatii) {
            sumaCurenta += donatii.nextInt(10) + 1;
            nrCurentDonatii += 1;
        }
        if (sumaCurenta >= sumaFinala) {
            System.out.println(sumaCurenta + " Succes!!! ");
        } else {
            System.out.println(sumaCurenta);
        }
    }
    public static void Ex6() {
        String propozitii =  "Andrei si-a cumparat o masina care era stricata. El a reparart-o. In cateva saptamani aceasta s-a stricat din nou.";
        String[] impartire = propozitii.split("\\.");

        for (int i = 0; i < impartire.length; i++) {
            System.out.println(impartire[i]);

        }

    }
}
