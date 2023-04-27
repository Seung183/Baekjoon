import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 동전의 종류(개수)
        int K = Integer.parseInt(st.nextToken()); // 동전을 사용해서 합으로 만들, K로 만들 값

        int[] price = new int[N]; // 동전 값 배열로 저장, 오름차순으로 주어진다.

        for(int i = 0; i<N; i++){
            price[i] = Integer.parseInt(br.readLine());
        }

        int result = K; // K값을 저장
        int count = 0; // 필요한 동전 개수

        // 가격이 0이 될때 종료
        while(result != 0){
            for(int i = 0; i< N; i++){
                // result가 동전값보다 작으면 이전 동전값으로 처리
                if(result < price[i]){
                    count += result/price[i-1];
                    result %= price[i-1];
                    break;
                }
                // result가 동전값이랑 같은 경우 해당 동전값으로 처리
                else if(result == price[i]){
                    count += result/price[i];
                    result %= price[i];
                    break;
                }
                //result가 동전값보다 큰 경우
                else{
                    // 마지막 동전값일때도 result가 동전값보다 큰 경우
                    if(i == N - 1){
                        count += result/price[N-1];
                        result %= price[N-1];
                        break;
                    }
                }
            }
        }
        System.out.print(count);
    }
}
