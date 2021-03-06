package InsertionSort;

public class InsertionSort {
    // Function to sort array using insertion sort
    public void sort(int arr[]) { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
  
    // Prints the array 
    private void printArray(int arr[]) { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver code to test above 
    public static void main(String args[]) {
        InsertionSort ob = new InsertionSort(); 
        int arr[] = {3, 2, 5, 1, 4}; 
        System.out.print("Given Array: "); 
        ob.printArray(arr); 
        ob.sort(arr);  
        System.out.print("Sorted array: "); 
        ob.printArray(arr); 
    } 
}
