import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int count = 0;
        int n = 0;

        while(n<num){
            count++;
            n = count*(count+1)/2;
        }

        int nthN = num - count*(count-1)/2;

        if(count%2 == 0){
            System.out.println(nthN+"/"+(count-nthN+1));
        }else{
            System.out.println((count-nthN+1)+"/"+nthN);
        }

    }
}
