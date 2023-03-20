import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String cal = br.readLine();

        StringTokenizer st = new StringTokenizer(cal," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(String.format("%d",a+b));
        bw.newLine();
        bw.write(String.format("%d",a-b));
        bw.newLine();
        bw.write(String.format("%d",a*b));
        bw.newLine();
        bw.write(String.format("%d",a/b));
        bw.newLine();
        bw.write(String.format("%d",a%b));

        bw.flush();
        bw.close();
    }
}