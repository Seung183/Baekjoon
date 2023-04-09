import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i<num; i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            // 입력에 따라서 동작할수 있게 switch문 활용
            switch(st.nextToken()){
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(stack.empty()){
                        bw.write("-1"+"\n");
                    }else{
                        bw.write(stack.pop()+"\n");
                    }
                    break;
                case "size":
                    bw.write(stack.size()+"\n");
                    break;
                case "empty":
                    if (stack.empty()){
                        bw.write("1"+"\n");
                    }else{
                        bw.write("0"+"\n");
                    }
                    break;
                case "top":
                    if(stack.empty()){
                        bw.write("-1"+"\n");
                    }else{
                        bw.write(stack.peek()+"\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
