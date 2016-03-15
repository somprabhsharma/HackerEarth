import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
   
        int N = Integer.parseInt(line);
        String[] S = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
        	boolean flag = true;
            for(int j=0;j<N;j++){
            	if(i!=j){
            		if((Integer.parseInt(S[i]))%(Integer.parseInt(S[j]))==0){
            			flag=false;
            			break;
            		}
            	}
            }
            if(flag){
            	System.out.print(S[i]+" ");
            }
        }
    }
}
