import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];
        //dp 초기화
        dp[1] = 1;
        dp[2] = 3;

        //Bottom-up 반복문
        for(int i = 3; i<=num; i++){
            dp[i] = (2 * dp[i-2]+dp[i-1])%10007;
        }

        System.out.print(dp[num]);
    }

}
//n-1번째 도형에 1x2 한개 붙인것과 n-2번째 도형에 1x2 두개, 2x2 한개 붙인 것이 n번째 도형의 가짓수랑 같다.
//Top-down 재귀
//Bottom-up 반복문
