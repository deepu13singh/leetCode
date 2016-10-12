
/*
 * LeetCode User :  volTRon
 * Email ID : depankar13singh@gmail.com
 *
 * Problem : Printing a matrix in spiral form
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Spiralmatrix {

	public static List<Integer>	getSpiral(int[][] mat){
		int M = mat.length;
		if(M==0)
		 return new ArrayList<Integer>();
		 int N=mat[0].length;
		int[] ans = new int[M*N];
		int index=0;
		int hlimit=0,vlimit=0,dir=1;
		int x=0,y=0;
		while(index<M*N){
			
			while(y<N-hlimit&& index<M*N){
				ans[index++] = mat[x][y];
				y++;
			}
			y--;
			x++;
			while(x<M-vlimit && index<M*N){
				ans[index++] = mat[x][y];
				x++;
			}
			x--;y--;
			while(y>=hlimit&&index<M*N){
				ans[index++] = mat[x][y];
				y--;
			}
			y++;x--;
			vlimit++;
			while(x>=vlimit&&index<M*N){
				ans[index++] = mat[x][y];
				x--;
			}x++;y++;
			hlimit++;
			
		}
		List<Integer> an = new ArrayList<>();
		
		for(int i : ans)
			an.add(i);
		//List<Integer> list = IntStream.of(ans).boxed().collect(Collectors.toList());
		return an;
	}
	
	
	public static void main(String arg[]){
	
		int[][] mat = new int[][]{
			
			{1,2,3},
			{4,5,6},
			{7,8,9}
			
		};

	System.out.println(getSpiral(mat));
	}
}
