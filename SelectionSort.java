import java.util.Arrays;

public class SelectionSort {

	   public static void main(String[] args) {
			int[] arr = {18, 22, 5, 11, 10, 7, 17, 9};
			System.out.println("Original:" + Arrays.toString(arr));
			selectionSort(arr);
			System.out.println("Ans:" + Arrays.toString(arr));
		   }

		   static void selectionSort(int[] arr) {
			for (int i=0; i < arr.length - 1; i++) {
			   int min = arr[i];
			   int minIndex = i;
			   for (int j=i+1; j < arr.length; j++) {
			   	if (arr[j] < min) {
				  min = arr[j];
				  minIndex = j;
				}
			   }
			   // SWAP
			   int t = arr[i];
			   arr[i]=arr[minIndex];
			   arr[minIndex]=t;
			}

		   }
		}