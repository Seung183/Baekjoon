import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x == 0 && y == 0)
                break;
            if(y%x == 0){
                bw.write("factor\n");
            }
            else if(x%y == 0){
                bw.write("multiple\n");
            }
            else{
                bw.write("neither\n");
            }
        }
        bw.flush();
        bw.close();
    }
}

