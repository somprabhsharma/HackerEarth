import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int trailingZeros = (N/5) + (N/25) + (N/125) + (N/625);
        System.out.println(trailingZeros);
    }
}