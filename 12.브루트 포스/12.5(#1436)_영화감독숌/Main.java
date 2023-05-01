import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int num = 666;

        int count = 1;
        while(count != N){
            num++;

            if(Integer.toString(num).contains("666")){
                count++;
            }
        }
        System.out.print(num);

    }
}
//단순히 계속 증가하는 방식