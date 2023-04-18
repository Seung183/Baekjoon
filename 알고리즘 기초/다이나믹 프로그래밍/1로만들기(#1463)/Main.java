import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // Bottom-up 반복문 방식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[num+1]; // dp가 0일 때 배제하기 위함

        dp[0] = dp[1] = 0;

        //dp[2] 부터 dp[num]까지의 횟수 최솟값을 구해 저장
        //ex) 만약 2로 나누는것이 최솟값이라 가정한다면
        //    dp[12] = dp[6] + 1;
        //    dp[6] = dp[3] + 1;
        for(int i =2; i<=num; i++){
            dp[i] = dp[i-1] + 1; //- 1을 하는 것이 횟수의 최솟값이라고 가정

            //-1을 하는 방법의 횟수와 3을 나누는 것을 비교
            if(i%3 == 0)
                dp[i] = Math.min(dp[i], dp[i/3] + 1);
            if(i%2 == 0)
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
        }
        System.out.print(dp[num]);
    }

}
//Dynamic Programming
//Top-down 재귀
//Bottom-up 반복문