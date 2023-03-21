import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int capacity = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[capacity];

        //StringTokenizer st2 = new StringTokenizer(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]<n){
                bw.write(arr[i]+" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
//원래 새로운 StringTokenizer 객체를 생성해서 입력을 받았는데 이미 생성된 st 객체에 입력을 다시 할당하니 문제없이 돌아갔다.
// 메모리도 줄어들었음