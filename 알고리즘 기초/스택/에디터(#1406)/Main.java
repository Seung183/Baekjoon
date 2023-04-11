import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        //왼쪽 스택에 추가할 문자열
        String s = br.readLine();
        int num = Integer.parseInt(br.readLine());

        //왼쪽 스택에 하나씩 추가
        for(int i = 0; i< s.length(); i++){
            leftStack.push(s.charAt(i));
        }

        for(int i = 0; i< num; i++){
            st = new StringTokenizer(br.readLine());
            
            switch (st.nextToken()){
                //커서를 왼쪽으로 한 칸 옮김, 왼쪽 스택에 top을 오른쪽 스택으로 이동
                case "L" :
                    if(!leftStack.isEmpty())
                        rightStack.push(leftStack.pop());
                    break;
                //커서를 오른쪽으로 한 칸 옮김, 오른쪽 스택에 top을 왼쪽 스택으로 이동    
                case "D" :
                    if(!rightStack.isEmpty())
                        leftStack.push(rightStack.pop());
                    break;
                //커서 왼쪽에 있는 문자를 삭제함, 왼쪽 스택에 top을 제거, 즉 pop()    
                case "B" :
                    if(!leftStack.isEmpty())
                        leftStack.pop();
                    break;
                //$라는 문자를 커서 왼쪽에 추가함, 왼쪽 스택에 문자 push()    
                case "P" :
                    leftStack.push(st.nextToken().charAt(0));
                    break;
            }
        }
        
        //종료됐을 때의 스택 사이즈를 정해놔야한다.
        //i<stack.size()를 하게 되면 스택의 사이즈가 계속 변함
        int leftStackSize = leftStack.size();

        for(int i = 0; i<leftStackSize; i++){
            rightStack.push(leftStack.pop());
        }

        int rightStackSize = rightStack.size();

        for(int i = 0; i<rightStackSize; i++){
            bw.write(rightStack.pop()+"");
        }

        bw.flush();
        bw.close();
    }
}
//스택 두개를 활용한다.