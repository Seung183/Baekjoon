import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Integer.parseInt(br.readLine());

        System.out.println(recursive(N));
    }

    public static long recursive(long n){
        if(n == 0) return 1;
        if(n == 1) return 1;
        return n * recursive(n-1);
    }
}
