package com;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n = args.length;
        double[] array = new double[n * 2];
        double[] sumValues = new double[n];
        double resultMax = 0;

        for (int i = 0; i < args.length; i++) {
            array[i] = Double.parseDouble(args[i]);
            array[n + i] = Double.parseDouble(args[i]);
        }

        //filling sumValues with sum of i and 2n-i elements
        for (int i = 0; i < n ;i++){
           sumValues[i] = array[i] + array[2*n - i-1];
        }

        //getting maximum value of the array above
        for (int i = 0; i < n-1 ; i++){
            if(i == 0)
                resultMax = sumValues[i];
            resultMax=Math.max(resultMax,sumValues[i+1]);
        }
        System.out.println("INPUT: " + Arrays.toString(args));
        System.out.println("Sum array:" + Arrays.toString(sumValues));
        System.out.println("Max value = " + resultMax);
    }


}
