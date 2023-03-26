import java.io.*;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String string = br.readLine();

        for(int i = 0; i<'z'-'a'+1; i++){
            sb.append(string.indexOf('a'+i)+" ");
        }
        System.out.println(sb);
    }
}
/*
for(int i = 0; i<'z'-'a'+1; i++) <== a부터 z를 찾기 위해 z와 a의 차를 이용
 */
