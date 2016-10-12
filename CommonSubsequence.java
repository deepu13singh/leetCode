
public class CommonSubsequence {
	
public static boolean isSubsequence(String s, String t) {
	
	if(s==null || t ==null)
		 return false;
	int M = s.length();
	int N = t.length();
	if(M==0 | N==0)
		 return false;
	int[][] data = new int[M+1][N+1];
	
	for(int i=1;i<=M;i++)
		for(int j=1;j<=N;j++){
			if(s.charAt(i) == t.charAt(j)){
				data[i][j] = 1+ data[i-1][j-1];
			} else { data[i][j] = Math.max(data[i-1][j], data[i][j-1]);
		
			}
		}
			if(data[M][N] == s.length())
				 return true;
			
			return false;
    
}
	
	
public static void main(String arg[]){
	
}
}
