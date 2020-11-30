package binaryTree;

import java.io.IOException;

public class sibling3 {
    public static void main(String[] args) throws IOException {

        int[] inputArray = new int[] {1, 2, 3, 4, 5};
        int siblingsToFindOf = 4;
        int[] results = findSiblings(inputArray.length, inputArray, siblingsToFindOf);//lenth as array len

        for(int i=0;i<results.length;i++){ //be aware of output arrays item by item. println cant print arrays as well
            System.out.print(String.valueOf(results[i]) + ",");
        }

    }

    public static int[] findSiblings(int input1, int[] input2, int input3) {
        int[] result = new int[] {-1};
        if (input2[0] == input3) {
            return result;
        }

        int siblingFindIndex = -1;
        for(int i=0;i<input2.length;i++){
            if(input2[i]==input3) { //If element at i position is search element
                siblingFindIndex = i;
                break; // end loop
            }
        }
        if(siblingFindIndex>-1){ //index was found in integer array
            result = new int[]{input2[siblingFindIndex-1],input2[siblingFindIndex+1]}; // add found index+1 as upper sibling and found Index -1 as lower sibling
            //to do -> check if both elements exists so there can be no array out of bounds
        }

        return result;

    }

}
