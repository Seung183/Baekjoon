import java.io.*;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String sum = br.readLine(); //br.readLine()은 한줄만 읽는다. 즉, 엔터치면 끝

        StringTokenizer st = new StringTokenizer(sum," ");

        int a = Integer.parseInt(st.nextToken()); // 객체에서 다음 토큰을 반환
        int b = Integer.parseInt(st.nextToken());

        bw.write(String.format("%d",a+b));

        bw.flush();
        bw.close();
    }
}
/*StringTokenizer 클래스
 BufferedReader는 라인 단위로 읽어들인다. 스페이스 기준으로 문자열을 분리할때가 많다.
 이 때 StringTokenizer를 이용할 수 있다.
 String: 문자열을 Tokenizer: 토큰화한다. 즉, 토큰은 분리된 문자열 조각

 StringTokenizer st = new StringTokenizer(문자열);  <= 띄어쓰기를 기준으로 문자열을 분리
 StringTokenizer st = new StringTokenizer(문자열,구분자); <= 구분자를 기준으로 문자열을 분리
 StringTokenizer st = new StringTokenizer(문자열,구분자,true/false); <= 구분자를 기준으로 문자열을 분리할 때 구분자도 토큰으로 넣을지 여부
 */