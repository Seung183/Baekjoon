import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] score = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<num; i++){
            score[i] = Integer.parseInt(st.nextToken());
        }
        int max = score[0];
        for(int i = 0; i<num; i++){
            if(score[i]>max){
                max = score[i];
            }
        }
        double[] newscore = new double[num];
        double total = 0;
        for(int i = 0; i<num; i++){
            newscore[i] = ((double)score[i]/(double)max)*100;
            total += newscore[i];
        }

        System.out.println(total/num);
    }
}

