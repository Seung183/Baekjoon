import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nArr = new int[5];

        int result = 0;
        for(int i = 0; i<5; i++){
            nArr[i] = Integer.parseInt(br.readLine());
            result += nArr[i];
        }

        Arrays.sort(nArr);

        bw.write(result/5+"\n");
        bw.write(nArr[2]+"");

        bw.flush();
        bw.close();

    }
}

