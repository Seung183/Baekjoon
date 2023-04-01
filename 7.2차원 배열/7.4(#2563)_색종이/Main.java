import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        StringTokenizer st;

        int[][] paper = new int[101][101];

        for(int i = 0; i<testcase; i++){
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j < x+10; j++){
                for(int k = y; k < y+10; k++){
                    paper[j][k] = 1;
                }
            }
        }

        int count = 0;
        for(int i = 0; i<101; i++){
            for(int j =0; j<101; j++){
                if(paper[i][j] == 1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

//가로세로 크기가 100인 도화지 배열값에 1을 넣어줘서 1의 영역 크기 구한다.