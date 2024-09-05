public class BubbleSort {
    public static void bubbleSort(int[] arr){
        //the last value doesn't need to be checked
        for (int i = 0; i < arr.length-1; i++) {
            //
            for (int j = 0; j < arr.length-i-1; j++) {
                //compare values
                if (arr[j] > arr[j+1]) {
                    //swap values
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
