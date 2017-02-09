package com.damm.algorithms;

/**
 * Created by Gary Damm garydamm@gmail.com on 12/22/16.
 *
 * Average O(n log(n)) Worst O(n^2)
 */
public class QuickSort {

    private int[] numbers;

    public static void main(String a[]) {
        int[] input = {10, 3, 5, 1, 9, 8, 2, 10};
        QuickSort quickSort = new QuickSort();
        quickSort.print(input);
        quickSort.print(quickSort.sort(input));
    }

    public int[] sort(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        numbers = input;
        sort(0, input.length - 1);
        return numbers;
    }

    private void sort(int lowIndex, int highIndex) {
        int i = lowIndex;
        int j = highIndex;
        int pivot = numbers[lowIndex + (highIndex - lowIndex) / 2];
        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
            }
            while (numbers[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swapNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowIndex < j) {
            sort(lowIndex, j);
        }
        if (i < highIndex) {
            sort(i, highIndex);
        }
    }

    private void swapNumbers(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    private void print(int[] input) {
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("\n");
    }
}
