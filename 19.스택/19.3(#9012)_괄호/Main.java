import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i<num; i++){
            Stack stack = new Stack();
            String isVPS = br.readLine();
            int count = 0;

            for(int k = 0; k<isVPS.length(); k++){
                char c = isVPS.charAt(k);
                if(c == '('){
                    stack.push(c);
                    count++;
                }
                //닫는 괄호 일 경우
                else if(stack.isEmpty()){
                    count--;
                    break;
                }
                else{
                    stack.pop();
                    count--;
                }
            }
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