import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String number = st.nextToken();
        int decimalSystem = Integer.parseInt(st.nextToken());

        int result = 0;

        for(int i = 0; i<number.length(); i++){
            if(number.charAt(i)-'0' < 10){
                int underTen = number.charAt(i)-'0';
                result += underTen*Math.pow(decimalSystem,number.length()-i-1);
            }else {
                int overTen = number.charAt(i) - 'A'+10;
                result += overTen*Math.pow(decimalSystem,number.length()-i-1);
            }
        }
        System.out.println(result);
    }
}
