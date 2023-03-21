import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
            //bw.write(String.format("%d",Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())));
        }
        // 입력을 여러번 받는 경우
        // BufferedReader의 경우 엔터를 치게 되면 입력이 끝나버린다. 따라서 여러줄의 입력이 필요할때마다 StringTokenizer 객체를 생성한다.
        // 정수 타입의 입력을 문자열로 바꾸기 위한 방법으로 String.format을 썼는데 걸리는 시간이 길다! 메모리 차이도 존재!
        //bw.write(a+""); 이 형식을 써야겠다...
        bw.flush();
        bw.close();
    }
}