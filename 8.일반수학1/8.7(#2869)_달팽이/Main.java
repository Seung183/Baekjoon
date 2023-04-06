import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int climb = Integer.parseInt(st.nextToken()); //낮에 올라가는 미터
        int slip = Integer.parseInt(st.nextToken()); //밤에 미끄러지는 미터
        int top = Integer.parseInt(st.nextToken()); //정상(꼭대기)

        // 꼭대기에 도달하면 미끄러지지않는다는점!
        // 따라서 top - slip 만큼 올라가면 된다. 하루에 올라가는 미터 수는 climb - slip
        int dayCount = (top - slip) / (climb - slip);

        // 만약 (top - slip) % (climb - slip)에 나머지가 존재한다는 것은 하루 더 필요하다는 것
        if((top - slip) % (climb - slip) != 0){
            dayCount++;
        }

        bw.write(dayCount+"");
        bw.flush();
        bw.close();
        //while문을 사용하면 시간이 초과된다.
        /*
        int dayCount = 1; //정상에 올라가는데 걸리는 일 수

        while(climb * dayCount - slip * (dayCount-1) < top){
            dayCount++;
        }
        System.out.println(dayCount);       
         */
        
    }
}
