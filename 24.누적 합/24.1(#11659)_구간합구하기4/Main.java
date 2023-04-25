import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 수의 개수
        int M = Integer.parseInt(st.nextToken()); // 합을 구해야 하는 횟수

        st = new StringTokenizer(br.readLine());
        int[] nArr = new int[N]; // 숫자 배열
        int[] sArr = new int[N]; // 합 배열

        for(int i = 0; i<N; i++){
            nArr[i] = Integer.parseInt(st.nextToken());
            // 합배열의 처음 값은 숫자 배열의 처음 값이랑 같음
            if(i == 0){
                sArr[i] = nArr[i];
            }
            // 합배열은 이전 합배열 값과 현재 숫자 배열 값의 합
            else {
                sArr[i] = sArr[i-1]+nArr[i];
            }
        }

        for(int k = 0; k<M; k++){
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            if(i == 0){
                bw.write(sArr[j]+"\n");
            }
            // 구간 합은 합배열 간의 차이
            else{
                bw.write(sArr[j]-sArr[i-1]+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}

