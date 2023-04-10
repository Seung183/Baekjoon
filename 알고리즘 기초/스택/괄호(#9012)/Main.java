import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i<num; i++){
            Stack<Character> stack = new Stack<>();
            String isVPS = br.readLine(); 
            int countOpen = 0; // 여는 괄호의 수
            int countClose = 0; // 닫는 괄호의 수
            int k = 0;

            while(k<isVPS.length()){
                // 만약 닫는 괄호이면서 스택이 비어있을 경우
                if(isVPS.charAt(k) == ')' && stack.isEmpty()){
                    countOpen = -1; // VPS가 아니므로 빠져나온다, VPS인지 확인하기 위해 countOpen을 다른값으로 집어넣는다.
                    break;
                }
                // 만약 여는 괄호거나, 닫는괄호이면서 스택이 비어있지 않을 경우
                else{
                    // 여는괄호일경우
                    if(isVPS.charAt(k) == '('){
                        stack.push(isVPS.charAt(k));
                        countOpen++;
                    }
                    // 닫는괄호이면서 스택이 비어있지 않을 경우
                    else{
                        stack.push(isVPS.charAt(k));
                        countClose++;
                        // 만약 count가 같다면
                        if(countOpen == countClose){
                            // 스택이 빌때까지 pop
                            while(!stack.isEmpty()){
                                stack.pop();
                            }
                        }
                    }
                }
                k++;
            }

            // VPS인지 확인하고 YES NO 출력
            if(stack.isEmpty() && count == 0){
                bw.write("YES\n");
            }else{
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
