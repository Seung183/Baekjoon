import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i<num; i++){
            String string = br.readLine();
            bw.write(""+string.charAt(0)+string.charAt(string.length()-1)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
/*
주의할점!
char타입에서 연산을 하게되면 유니코드의 값으로 변하게 된다.
출력할때 String형태로 변환해야한다.
bw.write(""); <== 빈 문자열, BufferedWriter 객체에 아무런 문자를 포함하지 않은 빈 문자열
 */
