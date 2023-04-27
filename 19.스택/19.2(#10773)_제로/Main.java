import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(br.readLine()); // K개의 줄에 정수 1개씩

        for(int i = 0; i<K; i++){
            int data = Integer.parseInt(br.readLine());

            if(data == 0){
                stack.pop();
            }
            else{
                stack.push(data);
            }
        }

        int result = 0;
        // 스택이 빌때까지 더해준다
        while (!stack.isEmpty()){
            result += stack.pop();
        }

        System.out.print(result);
    }
}

