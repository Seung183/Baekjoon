import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        System.out.println(recursive(N));
    }

    public static int recursive(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return recursive(n-2) + recursive(n-1);
    }
}
