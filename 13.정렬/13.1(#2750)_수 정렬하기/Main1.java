import java.io.*;
import java.util.*;
public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N =Integer.parseInt(br.readLine()); // 데이터 개수
        int[] data = new int[N];

        for(int i = 0; i<N; i++){
            data[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i<N - 1; i++){
            for(int j = 0; j<N - i - 1; j++){
                if(data[j] > data[j+1]){
                    swap(data,j,j+1);
                }
            }
        }
        for(int i = 0; i<N; i++){
            bw.write(data[i]+"\n");
        }
        bw.flush();
        bw.close();
    }

    // x번째 인덱스에 위치한 데이터와 y번째 인덱스에 위치한 데이터 값을 변경(swap)
    public static void swap(int[] data,int x, int y){
        int temp = data[x];
        data[x] = data[y];
        data[y] = temp;
    }
}
//버블정렬