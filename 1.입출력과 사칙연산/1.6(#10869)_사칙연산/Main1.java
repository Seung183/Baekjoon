import java.io.*;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        sb.append(a+b);
        sb.append("\n");

        sb.append(a-b);
        sb.append("\n");

        sb.append(a*b);
        sb.append("\n");

        sb.append(a/b);
        sb.append("\n");

        sb.append(a%b);

        System.out.println(sb);
    }
}
/*
입력과 출력을 다양한 방법으로 풀수있다.

입력에 대해서는 Scanner보다 BufferedReader의 성능이 좋으며
출력은 데이터가 많은 경우 StringBuilder와 BufferedWriter가 유리하다.
(출력 데이터가 적은 경우 오히려 손해!)
 */


