import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //num, 테스트케이스 개수
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<num; i++) {
            String s = br.readLine();

            for(int j = 0; j< s.length(); j++){
                //만약 공백이 아니라면 스택에 추가
                if(s.charAt(j) != ' '){
                    stack.push(s.charAt(j));
                }
                //' ', 공백이라면 스택이 빌때까지 sb에 더해준다.
                else{
                    while(!stack.empty()){
                        sb.append(stack.pop());
                    }
                    //공백을 표현하기 위해 sb에 더해준다.
                    sb.append(' ');
                }
            }
            //문자열이 끝나게 될 경우 공백이 있기 전까지 출력을 할 수 없으므로 String이 바뀌기 전에 스택이 빌때까지 sb에 더해준다.
            while(!stack.empty()){
                sb.append(stack.pop());
            }
            sb.append("\n");
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();
    }
}
