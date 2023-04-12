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

        StringTokenizer st = new StringTokenizer(br.readLine());

        int numberOfPeople = Integer.parseInt(st.nextToken());//사람의 수
        int deleteNth = Integer.parseInt(st.nextToken());//N번째 사람 제거

        for(int i = 0; i<numberOfPeople; i++){
            queue.add(i+1);
        }

        bw.write("<");
        //큐가 빌때까지
        while(!queue.isEmpty()){
            //큐에서 제거될 N번째 사람이 첫번째로 올때까지 이전 데이터를 제거한후 다시 큐에 넣는다
            for(int i = 0; i<deleteNth - 1; i++){
                queue.add(queue.remove());
            }
            //만약 사람의수(numberOfPeople)가 한명이 아닐때
            if(numberOfPeople != 1){
                bw.write(queue.remove()+", ");
                if(queue.size() == 1){
                    bw.write(queue.remove()+">");
                    break;
                }
            }
            //만약 사람의수(numberOfPeople)가 한명일때
            else{
                bw.write(queue.remove()+">");
            }
        }

        bw.flush();
        bw.close();

    }
}
