import java.util.Random;

import BubbleSort.BubbleSort;
import HeapSort.HeapSort;
import InsertionSort.InsertionSort;
import MergeSort.MergeSort;
import QuickSort.QuickSort;
import SelectionSort.SelectionSort;

public class Main {
    // Prints the array 
    private static void printArray(int arr[]) { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }

    // Get an array of radnom numbers and given size
    private static int[] getArray(int size, int seed) {
        int arr[] = new int[size];
        Random rand = new Random(seed);

        for (int i = 0; i < size; i++) 
            arr[i] = rand.nextInt(size);

        return arr;
    }

    // Driver code to show sorting algorithm speed 
    public static void main(String args[]) { 
        if (args.length != 2)  // test for correct # of args
            throw new IllegalArgumentException("Parameter(s): <Array Size> <Show/Hide Array>");

        // Create array to sort
        int size = Integer.parseInt(args[0]);
        int seed = (int) System.currentTimeMillis();
        int arr[] = getArray(size, seed);

        // Decide is array should be printed to console
        String showParameter = args[1].toLowerCase();
        boolean doShowArray;
        if (showParameter.equals("show")) {
            doShowArray = true;
        } else if (showParameter.equals("hide")) {
            doShowArray = false;
        } else {
            throw new IllegalArgumentException("Parameter(s): <Array Size> <Show/Hide Array>");
        }

        if (doShowArray) {
            System.out.print("Unsorted Array: "); 
            printArray(arr); 
        }
        System.out.println();

        // Declare variables for measuring time
        long start = 0;
        long finish = 0;

        // Bubble sort
        BubbleSort bubbleSort = new BubbleSort();
        start = System.nanoTime();
        bubbleSort.sort(arr);
        finish = System.nanoTime();
        System.out.println("Bubble sort time: " + (finish - start) + " ns");

        // Heap sort
        HeapSort heapSort = new HeapSort();
        arr = getArray(size, seed);
        start = System.nanoTime();
        heapSort.sort(arr);
        finish = System.nanoTime();
        System.out.println("Heap sort time: " + (finish - start) + " ns");

        // Insertion sort
        InsertionSort insertionSort = new InsertionSort();
        arr = getArray(size, seed);
        start = System.nanoTime();
        insertionSort.sort(arr);
        finish = System.nanoTime();
        System.out.println("Insertion sort time: " + (finish - start) + " ns");

        // Merge sort
        MergeSort mergeSort = new MergeSort();
        arr = getArray(size, seed);
        start = System.nanoTime();
        mergeSort.sort(arr, 0, arr.length - 1); 
        finish = System.nanoTime();
        System.out.println("Merge sort time: " + (finish - start) + " ns");

        // Quick sort
        QuickSort quickSort = new QuickSort();
        arr = getArray(size, seed);
        start = System.nanoTime();
        quickSort.sort(arr, 0, arr.length - 1); 
        finish = System.nanoTime();
        System.out.println("Quick sort time: " + (finish - start) + " ns");

        // Selection sort
        SelectionSort selectionSort = new SelectionSort();
        arr = getArray(size, seed);
        start = System.nanoTime();
        selectionSort.sort(arr);
        finish = System.nanoTime();
        System.out.println("Selection sort time: " + (finish - start) + " ns");

        System.out.println();
        if (doShowArray) {
            System.out.print("Sorted array: "); 
            printArray(arr);
        } 
    } 
}
