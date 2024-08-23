import java.util.*;


public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {7, 19, 11, 10, 5, 4, 12};
		System.out.println("Original:"+Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("After:"+ Arrays.toString(arr));
	}
	static void insertionSort(int[] arr) {
		for(int i=0,j=i+1;i<arr.length-1;i++,j++) {
			//sub array
			int n=arr[j];
			for(int k=0;k<j;k++) {
				if(n>arr[k]) {
					int t = arr[j];
					arr[j] = arr[k];
					arr[k] = t; 
					//j=k;
				}
			}
			System.out.println(Arrays.toString(arr));
			Scanner sc = new Scanner(System.in);
			sc.nextLine();
		}
	}

}
