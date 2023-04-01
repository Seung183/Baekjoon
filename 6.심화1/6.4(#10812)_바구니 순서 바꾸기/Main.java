import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int numOfCase = Integer.parseInt(st.nextToken());
        int[] basket = new int[size];

        for(int i = 0; i<size; i++){
            basket[i] = i+1;
        }

        for(int i = 0; i<numOfCase; i++){
            st = new StringTokenizer(br.readLine());
            int begin = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            int mid = Integer.parseInt(st.nextToken()) - 1;

            int[] temp = new int[mid-begin];
            for(int j = 0; j<mid-begin; j++){
                temp[j] = basket[begin+j];
            }

            for(int j = 0; j<end-mid+1; j++){
                basket[begin+j] = basket[mid+j];
            }
            for(int j = 0; j<mid-begin; j++){
                basket[begin+end-mid+1+j] = temp[j];
            }
        }

        for(int i =0; i<basket.length; i++){
            bw.write(basket[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}
