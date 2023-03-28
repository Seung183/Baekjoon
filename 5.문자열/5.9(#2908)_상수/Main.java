import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int numA = Integer.parseInt(new StringBuilder().append(A).reverse().toString());//StringBuilder에 A를 넣어주고 뒤집은 후 문자열로 바꿔준다.
        int numB = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
        
        System.out.println(numA > numB ? numA:numB);
    }
}
/*
sb를 호출하면 StringBuilder 객체의 주소값이 출력된다.
하지만 sb.toString()을 하지 않아도 출력결과가 나오는 이유는 StringBuilder자체에 toString이 오버라이딩되어있기때문이다.
 */

