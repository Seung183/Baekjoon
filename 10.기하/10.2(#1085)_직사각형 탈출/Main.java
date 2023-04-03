import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int distanceX = 0;
        int distanceY = 0;

        if(x > w/2){
            distanceX = w - x;
        }else{
            distanceX = x;
        }

        if(y > h/2){
            distanceY = h - y;
        }else{
            distanceY = y;
        }

        System.out.println(distanceX < distanceY ? distanceX:distanceY);
    }
}
