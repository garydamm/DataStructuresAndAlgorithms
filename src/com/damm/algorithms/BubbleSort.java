package com.damm.algorithms;

/**
 * Created by Gary Damm garydamm@gmail.com on 12/19/16.
 * <p>
 * Bubble Sort worst case O(n^2)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {10, 3, 5, 1, 9, 8, 2, 10};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.printNumbers(numbers);
        bubbleSort.printNumbers(bubbleSort.sort(numbers));
    }

    public int[] sort(int[] numbers) {
        int size = numbers.length;
        int next;
        for (int j = 0; j < size - 1; j++) {
            for (int current = 0; current < size - 1; current++) {
                next = current + 1;
                if (numbers[current] > numbers[next]) {
                    swapNumbers(current, next, numbers);
                }
            }
        }
        return numbers;
    }

    private void swapNumbers(int current, int next, int[] numbers) {
        int temp = numbers[current];
        numbers[current] = numbers[next];
        numbers[next] = temp;
    }

    private void printNumbers(int[] input) {
        for(int i : input){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("\n");
    }

}
