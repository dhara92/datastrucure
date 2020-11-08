package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class SiblingSearch {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,6};
        int item  = 5;
        findSubling(arr,item);

    }
    public static  void findSubling(int[] arr, int item) {
        List<Integer> arrList = new ArrayList<Integer>();


        for (int i = 0; i <= arr.length -1; i++) {

            if (arr[i] == item) {
                if (arr[i - 1] < arr[i]) {
                    arrList.add(arr[i - 1]);
                }
                if (arr[i + 1] > arr[i]) {
                    arrList.add(arr[i + 1]);
                }
            }

        }
            int[] finalArr = convertIntegers(arrList);

        for (int out: finalArr
             ) {
            System.out.println(out);

        }
    }

    public static int[] convertIntegers(List<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
 }
