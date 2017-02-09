package com.damm.algorithms;

/**
 * Created by Gary Damm garydamm@gmail.com on 12/22/16.
 *
 * O(n log(n))
 */
public class MergeSort {
	
	private int[] array;
    private int[] tempArray;
    private int length;
 
    public static void main(String[] args){
         
        int[] inputArr =  {10, 3, 5, 1, 9, 8, 2, 10};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
     
    public void sort(int[] inputArray) {
        this.array = inputArray;
        this.length = inputArray.length;
        this.tempArray = new int[length];
        mergeSort(0, length - 1);
    }
 
    private void mergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            mergeSort(lowerIndex, middle);
            mergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempArray[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
 
    }

}
