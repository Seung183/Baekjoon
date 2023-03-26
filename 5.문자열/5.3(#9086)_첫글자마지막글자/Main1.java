import java.io.*;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i< n; i++){
            String string = br.readLine();

            sb.append(string.charAt(0));
            sb.append(string.charAt(string.length()-1)+ "\n");
        }
        System.out.println(sb);
    }
}
//StringBuilder를 활용해 출력
