import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //자연수 N
        int N = Integer.parseInt(br.readLine());
        // 결과, 만약 생성자가 없다면 0
        int result = 0;
        
        for(int i = 0; i<N; i++){
            //숫자의 자릿수를 구하기 위해
            String stringN = Integer.toString(i);
            // i + i의 각 자릿수의 합을 구하기 위해
            int number = i;
            for(int k = 0; k < stringN.length(); k++){
                number += stringN.charAt(k) - '0';
            }
            if(number == N){
                result = i;
                break;
            }
        }
        System.out.print(result);
    }
}