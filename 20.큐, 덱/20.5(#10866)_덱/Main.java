import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //Deque인터페이스를 활용
        Deque<Integer> dequeue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i<num; i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            switch(st.nextToken()){
                case "push_front":
                    dequeue.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    dequeue.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if(dequeue.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(dequeue.removeFirst()+"\n");
                    break;
                case "pop_back":
                    if(dequeue.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(dequeue.removeLast()+"\n");
                    break;
                case "size":
                    bw.write(dequeue.size()+"\n");
                    break;
                case "empty":
                    if (dequeue.isEmpty())
                        bw.write("1\n");
                    else
                        bw.write("0\n");
                    break;
                case "front":
                    if(dequeue.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(dequeue.getFirst()+"\n");
                    break;
                case "back":
                    if(dequeue.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(dequeue.getLast()+"\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}

