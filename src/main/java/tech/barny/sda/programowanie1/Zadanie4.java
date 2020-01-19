package tech.barny.sda.programowanie1;

public class Zadanie4 {

    public static int[] tworzTablice() {

        int[] arrayWyjsciowy = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] wynikowa = new int[arrayWyjsciowy.length];

        int suma = 0;
        for (int value : arrayWyjsciowy) {
            suma += value;
        }

        double srednia=  suma / arrayWyjsciowy.length;

        int n = arrayWyjsciowy.length - 1;
        for (int i = 0; i < n; i++) {
            if (arrayWyjsciowy[i]>srednia) {
                wynikowa[i] = arrayWyjsciowy[i];
            }
        }
        return wynikowa;

    }

}
