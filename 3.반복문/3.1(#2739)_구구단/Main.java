import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();

        StringTokenizer st = new StringTokenizer(num);

        int mul = Integer.parseInt(st.nextToken());

        for(int i = 1; i<10; i++){
            bw.write(String.format("%d * %d = %d",mul,i,mul*i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}