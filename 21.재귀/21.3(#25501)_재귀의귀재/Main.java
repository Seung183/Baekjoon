import java.io.*;
import java.util.*;
public class Main {
    public static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i<N; i++){
            count = 0;
            String s = br.readLine();

            bw.write(recursive(s,0,s.length()-1)+" ");
            bw.write(count+"\n");
        }
        bw.flush();
        bw.close();
    }

    public static int recursive(String s,int i,int j){
        if(i>=j){
            count++;
            return 1;
        }
        else if(s.charAt(i) != s.charAt(j)){
            count++;
            return 0;
        }
        else{
            count++;
            return recursive(s,i+1,j-1);
        }
    }
}
