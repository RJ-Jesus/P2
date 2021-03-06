import static java.lang.System.*;
import java.util.Scanner;

public class p81
{
   public static void main(String[] args)
   {
      NumberArray na = new NumberArray();
      mergeSort(na.array(), 0, na.length());
      na.print();
   }
	public static void mergeSort(int[] arr, int start, int end){
		if(end - start > 1){
			int mid = (end+start) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid, end);
			mergeSubSort(arr, start, mid, end);
		}
	}
	public static void mergeSubSort(int[] arr, int start, int mid, int end){
		int[] brr = new int[end-start];
		int i = start, j = mid, b = 0;
		for(; i < mid && j < end; ){
			if(arr[i] < arr[j]) brr[b++] = arr[i++];
			else brr[b++] = arr[j++];
		}
		for(; i < mid; ) brr[b++] = arr[i++];
		for(; j < end; ) brr[b++] = arr[j++];
		System.arraycopy(brr, 0, arr, start, end-start);
	}
}

