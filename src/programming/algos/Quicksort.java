package programming.algos;

import java.util.Arrays;

public class Quicksort {

	private static void swap(int[] arr, int i, int j) {
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static int partition(int[] arr, int l, int h) {
		int pivotal = arr[h];
		int pi = l-1;
		for (int i = l; i < h; i++) {
			if(arr[i] < pivotal) {
				++pi;
				swap(arr, pi, i);
			}
		}
		swap(arr, pi+1, h);
		return pi+1;
	}
	private static void sort(int[] arr, int l, int h) {
		if (l < h) {
			int pi = partition(arr, l, h);
			sort(arr, l, pi-1);
			sort(arr, pi+1, h);
		}
	}
	public static void main(String[] args) {
		int[] arr = {5,1,6,3,9,12,6,7};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
