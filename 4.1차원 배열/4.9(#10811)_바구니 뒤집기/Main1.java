import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        int[] basket = new int[size];

        for(int i = 0; i<size; i++){
            basket[i] = i+1;
        }

        int temp;
        for(int i = 0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            while(start<end){
                temp = basket[start];
                basket[start++] = basket[end];
                basket[end--] = temp;
            }
        }
        for(int i = 0; i<size; i++){
            bw.write(basket[i]+ " ");
        }
        bw.flush();
        bw.close();
    }
}
//while문 활용