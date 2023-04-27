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

        // 뒤에서부터 계산
        for(int i = N-1; i >=0; i--){
            if(price[i] <= result){
                count += result/price[i];
                result %= price[i];
            }
        }
        System.out.print(count);
    }
}
//뒤에서부터 하면 굳이 while문이나 다른 거 쓸 필요가 없다.
