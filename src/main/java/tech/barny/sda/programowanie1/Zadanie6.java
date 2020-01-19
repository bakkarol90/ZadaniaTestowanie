package tech.barny.sda.programowanie1;

import java.util.ArrayList;

public class Zadanie6 {

        public static void main(String[] args) {
            int[] arr = {9, 10, 5, 4, 8, 5, 7, 6, 1, 10};
            sortujNieparzyste(arr);
        }
        public static int[] sortujNieparzyste(int[] arr) {
            int[] arr2 = new int[arr.length];
            ArrayList<Integer> listaNieparzystych = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    listaNieparzystych.add(arr[i]);
                }
            }
            listaNieparzystych.sort(null);
            System.out.println(listaNieparzystych);
            int ii = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    arr2[i] = listaNieparzystych.get(ii);
                    ii++;
                } else {
                    arr2[i] = arr[i];
                }
                System.out.println(arr2[i]);
            }
            return arr2;
        }
}

