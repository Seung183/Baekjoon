import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();

        for(int i = 0; i<'z'-'a'+1; i++){
            bw.write(string.indexOf('a'+i)+" ");
        }
        bw.flush();
        bw.close();
    }
}
/*
for(int i = 0; i<'z'-'a'+1; i++) <== a부터 z를 찾기 위해 z와 a의 차를 이용
 */