
/*
 * LeetCode User :  volTRon
 * Email ID : depankar13singh@gmail.com
 *
 * Problem : Rotate array in place by k shift
 */import java.util.Arrays;

public class RotateArray {

	public static void rotate(int[] arr, int k) {
		int n = arr.length;
		int temp1, temp2, count = 1, i = 0;

		temp2 = arr[i];
		int startpoint = 0; // mark the start of a point to check if we visit an
							// index twice
		boolean gonethrough = false; // to avoid first iteration when i ==startpoint
									 
		while (count <= n) {
			temp1 = arr[i];
			arr[i] = temp2;
			temp2 = temp1;
			count++;
			if (i == startpoint) {
				if (gonethrough) { // for case like 1,2,3,4 and k = 2
					i++;
					startpoint = i;
					gonethrough = false;
					temp2 = arr[i];
					count--;
				} else {
					gonethrough = true;
					i = (i + k) % n;
				}
			} else
				i = (i + k) % n;
		}
		arr[i] = temp2;
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String arg[]) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
		rotate(arr, 3);
	}
}
