import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int repeat = Integer.parseInt(st.nextToken());
            String string = st.nextToken();

            for(int j = 0; j<string.length(); j++){
                for(int k = 0; k<repeat; k++){
                    sb.append(string.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}