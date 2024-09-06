//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //length of array
        int arrlength= scan.nextInt();
        //empty array with length=arrlength
        int[] arr=new int[arrlength];
        //values of array
        for (int i = 0; i < arrlength; i++) {
            arr[i]=scan.nextInt();
        }

        //BubbleSort.bubbleSort(arr);
        //InsertionSort.insertionSort(arr);
        //SelectionSort.selectionSort(arr);
        show(arr);

    }
    //print array
    public static void show(int[] array){
        for (int i:array){
            System.out.println(i+" ");
        }

    }
}