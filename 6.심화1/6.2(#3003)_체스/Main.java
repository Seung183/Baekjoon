import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //체스는 총 16개 피스 1 1 2 2 2 8 이 원래 구성
        //첫쨰줄에 찾은 흰색 킹 퀸 룩 비숍 나이트 폰 개수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int king,queen,rook,bishop,knight,pawn;
        king = 1 - Integer.parseInt(st.nextToken());
        queen = 1 - Integer.parseInt(st.nextToken());
        rook = 2 - Integer.parseInt(st.nextToken());
        bishop = 2 - Integer.parseInt(st.nextToken());
        knight = 2 - Integer.parseInt(st.nextToken());
        pawn = 8 - Integer.parseInt(st.nextToken());

        bw.write(String.format("%d %d %d %d %d %d",king,queen,rook,bishop,knight,pawn));
        bw.flush();
        bw.close();
    }
}
//BufferedReader + String.format