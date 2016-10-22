import java.util.Arrays;

/**
 * Created by Deepankar Singh
 * Leet Code : volTRon
 * Problem : implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 */
public class NextPermutation {
    public static void nextPermutation(int[] nums) {
      int n = nums.length;
        if(n <= 1)
            return;
        int i = 0;
        for( i = n-1 ; i>=1;i--){
            if(nums[i] > nums[i-1])
                break;
        }
        if( i == 0) {
            reverse(nums,n,0);
        } else {//first decreaing number from right is at i
               for(int j= n-1;j>=i;j--)
                   if(nums[j] >nums[i-1]){
                       int temp = nums[i-1];
                       nums[i-1] = nums[j];
                       nums[j] = temp;
                       break;
                   }
            // reverse list from i onwards
            reverse(nums, n, i);
        }
    }

    private static void reverse(int[] nums, int n, int i) {
        for(int index = i;index < (n+i)/2;index++){
            int temp = nums[index];
            nums[index] = nums[n-1-(index-i)];
            nums[n-1-(index-i)] = temp;
        }
    }

    public static void main(String arg[ ]){
        int[] nums = new int[] {6,4,3,9,8,7,1};
         nextPermutation(nums);
        System.out.print(Arrays.toString(nums));
    }
}
