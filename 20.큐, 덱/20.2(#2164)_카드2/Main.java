import java.io.*;
import java.util.*;
public class Main {
    static int[] arrayDNA;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i< N; i++){
            queue.add(i+1);
        }

        //카드가 한장남으면 종료
        while(queue.size() > 1){
            queue.remove();
            queue.add(queue.remove());
        }
        System.out.print(queue.peek());

    }
}

