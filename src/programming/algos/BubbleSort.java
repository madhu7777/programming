package programming.algos;

import java.util.Arrays;
//Madhu
public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {5, 1,6,3,9,12,6,7};
		
		for (int index = arr.length-1; index >= 0; index--) {
			for (int i = 0; i < index; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
