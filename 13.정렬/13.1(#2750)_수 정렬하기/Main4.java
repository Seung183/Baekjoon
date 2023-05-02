import java.io.*;
import java.util.*;
public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N =Integer.parseInt(br.readLine()); // 데이터 개수
        int[] data = new int[N];

        for(int i = 0; i<N; i++){
            data[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i<N - 1; i++){
            int index = i+1;
            for(int j = index - 1; j>=0; j--){
                if(data[j]>data[index]){
                       swap(data,j,index);
                       index--;
                }
                else{
                    break;
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
//삽입 정렬