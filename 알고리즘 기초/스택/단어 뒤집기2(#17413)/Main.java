import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        //check에 따라 출력 여부 결정
        boolean check = false;

        
        for(int i = 0; i<s.length(); i++){
            //<로 시작하는 경우 그대로 출력, stack이 빌때까지
            if(s.charAt(i) == '<'){
                check = true;
                while (!stack.isEmpty()){
                    bw.write(stack.pop()+"");
                }
                bw.write("<");
            }
            //>로 시작하는 경우 check는 false, >만 출력
            else if(s.charAt(i) == '>'){
                check = false;
                bw.write(">");
            }
            //만약 <,>가 아니고 check가 true일 경우 그대로 출력
            else if(check){
                bw.write(s.charAt(i)+"");
            }
            //만약 <,>가 아니고 check가 false일 경우
            else{
                // 빈 문자열일 경우 빌때까지 뒤집어서 출력
                if(s.charAt(i) == ' '){
                    while(!stack.isEmpty()){
                        bw.write(stack.pop()+"");
                    }
                    bw.write(" ");
                }
                //빈 문자열이 아닌 경우 스택에 추가
                else{
                    stack.push(s.charAt(i));
                }
            }
        }
        // 스택이 빌 때까지 출력 , 마지막 문자열을 출력
        while(!stack.isEmpty()){
            bw.write(stack.pop()+"");
        }
        bw.flush();
        bw.close();
    }
}

