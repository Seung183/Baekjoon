import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
    }
}
//while(s(문자열)가 null값이 아니라면 System.out.println(s) s에 대입한 br.readLine() 출력)