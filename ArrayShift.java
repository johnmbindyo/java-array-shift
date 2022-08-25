package dsa;

 

import java.util.Arrays;

 

public class ArrayShift {

 

    public static void main(String... args) {

 

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};

        int shiftFactor = 12;

        System.out.println("Original Array=" + Arrays.toString(arr));

        System.out.println("Shifted by factor " + shiftFactor + "= " + Arrays.toString(solution(arr, shiftFactor)));

    }

 

    private static int[] solution(int arr[], int factor) {

        if (arr.length == 0 || factor == 0) {

            return arr;

        }

        int len = arr.length;

        int newPos;

        int[] shifted = new int[len];

        factor = factor % len;

 

        System.out.println("Real shift factor:" + factor);

        if (factor == 0) {

            return arr;

        }

        for (int i = 0; i < len; i++) {

            newPos = i + factor;

            if (newPos >= len) {

                newPos = newPos - len;

            }

            if (newPos < 0) {

                newPos = newPos + len;

            }

            shifted[newPos] = arr[i];

        }

        return shifted;

 

    }

}