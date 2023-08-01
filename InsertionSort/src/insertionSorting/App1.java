package insertionSorting;

public class App1 
{
	public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = key;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 4, 78, 16};
        System.out.println("Before sorting:");
        printArray(arr);
        
        insertionSort(arr);
        
        System.out.println("After sorting:");
        printArray(arr);
}
}







