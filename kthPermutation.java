/**
 * Deepankar Singh purniya
 * Leet COde : volTRon
 * Problem  : Given a value n , ranging from 1 to 9 , find kth permutation and reutrn its value.
 */
public class kthPermutation {
    public static String getPermutation(int n, int k) {
        if (n <= 0)
            return "";
        long[] fact = new long[n+1];
        fact[0] = 1;
        fact[1] = 1;
        StringBuilder str = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for(int i=1;i <= n;i++) {
            str.append(String.valueOf(i));
            fact[i] = i* fact[i-1];
        }
         k--; // as counting will start from 0
        while(true){
            if( k==0){
                if(str.length()>0)
                    ans.append(str);
            break;
            }
            long factorial = fact[str.length() - 1];
            int index = (k)/(int)factorial;
            if(index >= str.length()){
                ans.append(str.reverse());
                break;
            }
            ans.append(str.charAt(index));
            str.deleteCharAt(index);
            k = k%(int)factorial;
        }
        return ans.toString();
    }
    public static void main(String arg[]){
        int n =4;
        System.out.print(getPermutation(n,12)); // ans should be 2431
    }
}
