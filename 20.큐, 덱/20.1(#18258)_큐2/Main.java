import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int lastNum = 0;

        for(int i = 0; i<num; i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            switch(st.nextToken()){
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    queue.add(x);
                    lastNum = x;
                    break;
                case "pop":
                    if(queue.isEmpty()){
                        bw.write("-1"+"\n");
                    }else{
                        bw.write(queue.remove()+"\n");
                    }
                    break;
                case "size":
                    bw.write(queue.size()+"\n");
                    break;
                case "empty":
                    if (queue.isEmpty()){
                        bw.write("1"+"\n");
                    }else{
                        bw.write("0"+"\n");
                    }
                    break;
                case "front":
                    if(queue.isEmpty()){
                        bw.write("-1"+"\n");
                    }else{
                        bw.write(queue.peek()+"\n");
                    }
                    break;
                case "back":
                    if(queue.isEmpty()){
                        bw.write("-1"+"\n");
                    }else{
                        bw.write(lastNum+"\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
