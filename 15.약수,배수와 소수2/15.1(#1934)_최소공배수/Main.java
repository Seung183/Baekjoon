import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++){
            st = new StringTokenizer(br.readLine());
            int numA = Integer.parseInt(st.nextToken());
            int numB = Integer.parseInt(st.nextToken());
            bw.write(lcm(numA,numB)+"\n");
        }

        bw.flush();
        bw.close();
    }

    //최대공약수
    static int gcd(int a, int b){
        while(b != 0){
            int r = a%b;
            a = b;
            b = r;
        }

        return a;
    }

    //최소공배수
    static int lcm(int a, int b){
        return a * b /gcd(a, b);
    }
}