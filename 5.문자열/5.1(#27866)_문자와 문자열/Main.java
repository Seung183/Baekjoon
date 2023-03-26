import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = br.readLine();
        int index = Integer.parseInt(br.readLine());

        System.out.println(string.charAt(index-1));
    }
}
//문자열.charAt()은 string타입으로 받은 문자열을 char타입으로 한 글자만 받는 함수
