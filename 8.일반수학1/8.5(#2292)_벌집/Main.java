import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1 => 6 => 12 => 18 => 24
        // 1 7 19 37 61
        int n = Integer.parseInt(br.readLine());

        int count = 1;
        int range = 2;

        if(n == 1){
            System.out.println(1);
        }
        else{
            while(range <= n){
                range += (count * 6);
                count++;
            }
            System.out.println(count);
        }
        
    }
}

