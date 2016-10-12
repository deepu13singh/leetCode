import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpiralMatrix2 {

	public static int[][] getSpiral(int n){
		int[][] mat = new int[n][n];

		int index=0;
		int hlimit=0,vlimit=0;
		int x=0,y=0;
		while(index<n*n){
			
			while(y<n-hlimit&& index<n*n){
			   mat[x][y] = (index+1) ;
			   index++;
				y++;
			}
			y--;
			x++;
			while(x<n-vlimit && index<n*n){
				mat[x][y] = (index+1) ;
				   index++;
				x++;
			}
			x--;y--;
			while(y>=hlimit&&index<n*n){
				mat[x][y] = (index+1) ;
				   index++;
				y--;
			}
			y++;x--;
			vlimit++;
			while(x>=vlimit&&index<n*n){
				mat[x][y] = (index+1) ;
				   index++;
				x--;
			}x++;y++;
			hlimit++;
			
		}
		return mat;
	
	} 			
	
	
	public static void main(String arg[]){
	
	
    
	System.out.println(Arrays.deepToString(getSpiral(3)));
	}
}
