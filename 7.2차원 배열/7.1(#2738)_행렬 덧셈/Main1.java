import java.io.*;
import java.util.StringTokenizer;

public class Main1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[][] matrixA = new int[x][y];

        StringTokenizer stA;
        StringTokenizer stB;


        for(int i = 0; i<x; i++){
            stA = new StringTokenizer(br.readLine());
            for(int j = 0; j<y; j++){
                matrixA[i][j] = Integer.parseInt(stA.nextToken());
            }
        }
        int[][] matrixB = new int[x][y];

        for(int i = 0; i<x; i++){
            stB = new StringTokenizer(br.readLine());
            for(int j = 0; j<y; j++){
                matrixB[i][j] = Integer.parseInt(stB.nextToken());
            }
        }
        for(int i =0; i< x; i++){
            for(int j = 0; j < y; j++){
                bw.write(matrixB[i][j]+matrixA[i][j]+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}

