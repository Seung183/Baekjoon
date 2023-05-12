import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // M ~ N 까지의 소수
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N+1];

        // 배열 초기화
        for(int i = 0; i<arr.length; i++){
            arr[i] = i;
        }
        arr[1] = 0; // 1은 소수가 아니다.

        // 2부터 N의 제곱근까지만 검사
        for(int i = 2; i<=Math.sqrt(N); i++){
            if(arr[i] == 0 ) continue;
            // i를 제외한 배수 0으로(제거)
            for(int j = i + i; j <=N; j = j+i) {
                arr[j] = 0;
            }
        }

        // 소수들의 합
        int sum = 0;
        for(int i = M; i<N+1; i++){
            if(arr[i] != 0){
                sum += arr[i];
            }
        }

        // 소수값중 최소 구하기
        int min = -1;
        for(int i = M; i<N+1; i++){
            if(arr[i] != 0){
                min = arr[i];
                break;
            }
        }

        if(sum != 0)
            bw.write(sum+"\n");
        bw.write(min+"");

        bw.flush();
        bw.close();
    }
}
