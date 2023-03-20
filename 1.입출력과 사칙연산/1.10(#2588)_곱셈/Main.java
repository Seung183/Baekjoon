import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String firstnum = br.readLine();
        String secondnum = br.readLine();

        int a = Integer.parseInt(firstnum);
        int b = Integer.parseInt(secondnum);

        bw.write(String.format("%d",a*(b%10)));
        bw.newLine();
        bw.write(String.format("%d",a*((b%100)/10)));
        bw.newLine();
        bw.write(String.format("%d",a*(b/100)));
        bw.newLine();
        bw.write(String.format("%d",a*b));

        bw.flush();
        bw.close();
    }
}