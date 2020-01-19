package tech.barny.sda.programowanie1;

public class Zadanie3 {

    public static int[] zamieniajNastepny() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] result = new int[arr.length];
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            result[i] = arr[i + 2];

            i++;
            if (i +2 < arr.length) {
                result[n] = arr[n];
            }
        }

        return result;

    }
}
