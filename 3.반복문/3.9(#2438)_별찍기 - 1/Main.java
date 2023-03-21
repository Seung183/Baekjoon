import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                bw.write("*");
            }
            if(i == n-1){
                break;
            }
            //별을 다 찍고 나서 줄바꿈을 안하기 위해 빠져나온다.
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}