import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int x = 9;
        int y = 9;

        int[][] matrix = new int[x][y];

        int max = matrix[0][0];

        int targetX = 0;
        int targetY = 0;
        for(int i = 0; i<y; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<y; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                    targetX = i;
                    targetY = j;
                }
            }
        }
        bw.write(max+"\n");
        bw.write(String.format("%d %d",targetX+1,targetY+1));
        bw.flush();
        bw.close();
    }
}

