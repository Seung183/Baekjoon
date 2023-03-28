import java.io.*;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int numA = Integer.parseInt(new StringBuilder().append(Integer.parseInt(st.nextToken())).reverse().toString());
        int numB = Integer.parseInt(new StringBuilder().append(Integer.parseInt(st.nextToken())).reverse().toString());

        System.out.println(numA > numB ? numA:numB);
    }
}

