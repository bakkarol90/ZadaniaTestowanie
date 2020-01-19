package tech.barny.sda.programowanie1;

import org.w3c.dom.ls.LSOutput;

public class OdwracanieTablicy {


    public static void main(String[] args) {

           int [] a = {1,2,3,4,5,6,7,8,9,10};


//        int dlugoscTablicy  = arr.length;
//        int[] arr2 = {0,0,0,0,0,0,0,0,0,0};
//
//        //arr2[0]= 10;
//        int dlogosctablicy2 = arr2.length;
//        for (int i=0; i< dlugoscTablicy; i++){
//        for (int k=9; k==0; k--)
//            arr2[k] = arr[i];
//            //arr2=
//            System.out.print(arr2[9]);
//        }

    }
     public int[]  odwrocTablice() {
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[10];
        int j = 10;
        for (int i = 0; i < 10; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        for (int k = 0; k < 10; k++) {
            System.out.print(b[k] + ", ");
        }
    return b;
    }

}
