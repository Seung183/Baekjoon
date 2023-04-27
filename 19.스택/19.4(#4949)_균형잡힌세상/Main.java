import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();

        String s = br.readLine();

        // 문자열이 . 일경우 종료
        while(!s.equals(".")){
            // 균형이 맞는지 체크하기 위함
            boolean isTrue = true;
            
            for(int i = 0; i<s.length(); i++){
                // '(' 나 '[' 가 들어온다면 스택에 push
                if(s.charAt(i) == '(' || s.charAt(i) == '['){
                    stack.push(s.charAt(i));
                }
                else if(s.charAt(i) == ')'){
                    // ')' 일경우 스택에 꼭대기에 '(' 이 아니거나 비어있다면 균형배열이 아님
                    if(stack.isEmpty() || stack.peek() != '('){
                        isTrue = false;
                        break;
                    }
                    // '('라면 스택의 top을 빼줌
                    else {
                        stack.pop();
                    }
                }
                else if(s.charAt(i) == ']'){
                    if(stack.isEmpty() || stack.peek() != '['){
                        isTrue = false;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
            }
            // 만약 균형배열이면서 비어있다면 yes
            if(isTrue && stack.isEmpty()){
                bw.write("yes\n");
            }
            else{
                bw.write("no\n");
            }
            stack.clear();
            s = br.readLine();
        }
        bw.flush();
        bw.close();
    }
}

