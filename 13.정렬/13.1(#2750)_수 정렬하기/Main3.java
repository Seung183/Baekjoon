import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N =Integer.parseInt(br.readLine()); // 데이터 개수
        int[] data = new int[N];

        for(int i = 0; i<N; i++){
            data[i] = Integer.parseInt(br.readLine());
        }


        for(int i = 0; i<N; i++){
            int min = i;
            for(int j = i+1; j<N; j++){
                if(data[min] > data[j])
                    min = j;
            }
            swap(data,i,min);
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
//선택정렬