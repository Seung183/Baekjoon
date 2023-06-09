import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[x][y];

        for(int i = 0; i<x; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<y; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i<x; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<y; j++){
                matrix[i][j] += Integer.parseInt(st.nextToken());
            }
        }
        for(int i =0; i< x; i++){
            for(int j = 0; j < y; j++){
                bw.write(matrix[i][j]+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}

