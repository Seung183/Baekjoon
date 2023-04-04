import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int number = Integer.parseInt(st.nextToken());
        int decimalSystem = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while(number > 0){
            if(number%decimalSystem < 10){
                sb.append((char) (number%decimalSystem+'0'));
            }
            else{
                sb.append((char) (number%decimalSystem-10+'A'));
            }
            number = number/decimalSystem;
        }
        System.out.println(sb.reverse());
    }
}
