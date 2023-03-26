import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int hap = 0;

        for(int i = 0; i<n; i++){
            hap += s.charAt(i)-'0';
        }
        System.out.println(hap);
    }
}
//s.charAt()의 아스키코드값과 0의 아스키코드값의 차이, 해당 char값의 정수값
