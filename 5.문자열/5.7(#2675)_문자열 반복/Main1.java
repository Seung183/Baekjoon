import java.io.*;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int repeatnum = Integer.parseInt(st.nextToken());
            String string = st.nextToken();

            for(int j = 0; j<string.length(); j++){
                sb.append(string.valueOf(string.charAt(j)).repeat(repeatnum));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
/*
String.valueOf()함수는 char,int,boolean 등을 String 형식으로 변환할 때 사용

repeat() 함수는 문자열을 지정한 횟수만큼 반복하여 새로운 문자열을 생성
문자열.repeat();

String s = "a";
System.out.println(s.repeat(3));
 */

