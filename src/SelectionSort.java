public class SelectionSort {
    public static void selectionSort(int[] arr){
        int min;
        for (int i = 0; i < arr.length-1; i++) {
            //define min value
            min=i;
            for (int j = i+1; j <arr.length ; j++) {
                //compare elements for find min value
                if (arr[min] > arr[j]) {
                    min=j;
                }
            }
            //swap values
            if (min != i) {
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
}
