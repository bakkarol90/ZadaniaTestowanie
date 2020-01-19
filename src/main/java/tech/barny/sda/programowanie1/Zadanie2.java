package tech.barny.sda.programowanie1;



public class Zadanie2 {

    public static int[] zamieniajNastepny() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] result = new int[arr.length];
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            result[i] = arr[i + 1];
            result[i + 1] = arr[i];
            i++;
        }
        if (arr.length % 2 != 0) {
            result[n] = arr[n];
        }
        return result;

    }
}
