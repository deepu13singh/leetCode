import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Deepankar Singh purniya
 * Leet COde : volTRon
 * Problem  : Given a collection of distinct numbers, return all possible permutations.
 */
public class allPermutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length <=0)
             return res;
        return permuteHelper(nums,0);
    }

    public static List<List<Integer>> permuteHelper( int[] nums, int pos) {
        List<List<Integer>> temp = new ArrayList<>();
        int digit = nums[pos];
        if(pos == nums.length-1){
            temp.add(new ArrayList<>(Arrays.asList(digit)));
            return temp;
        }
        List<List<Integer>> res = permuteHelper(nums,pos+1);
        for( List<Integer> perms : res){
            for(int i=0;i<=perms.size();i++){
                perms.add(i,digit);
                temp.add(new ArrayList<>(perms));
                perms.remove(i);
            }
        }
      return temp;
    }
    public static void main(String arg[]){
      int[] nums = new int[]{1,2,3};
        System.out.print(permute(nums));
    }
}
