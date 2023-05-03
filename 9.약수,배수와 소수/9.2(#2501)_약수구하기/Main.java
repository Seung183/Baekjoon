import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int nthNum = Integer.parseInt(st.nextToken());

        int count = 0;

        for(int i = 0; i<N; i++){
            if(N % (i+1) == 0)
                count++;
            if(count == nthNum){
                System.out.print(i+1);
                break;
            }
        }
        if(count != nthNum)
            System.out.print(0);
    }
}


