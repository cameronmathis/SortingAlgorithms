class BubbleSort { 
    // Function to sort array using bubble sort
    private void sort(int arr[]) { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) { 
                    // swap arr[j+1] and arr[j] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
            }
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
        BubbleSort ob = new BubbleSort();
        int arr[] = {3, 2, 5, 1, 4}; 
        System.out.print("Given Array: "); 
        ob.printArray(arr); 
        ob.sort(arr);  
        System.out.print("Sorted array: "); 
        ob.printArray(arr); 
    } 
} 
