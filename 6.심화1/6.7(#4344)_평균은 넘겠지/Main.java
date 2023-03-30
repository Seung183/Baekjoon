import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i =0; i<testcase; i++){
            st = new StringTokenizer(br.readLine());
            int studentNum = Integer.parseInt(st.nextToken());
            int[] score = new int[studentNum];

            double total = 0;
            int count = 0;
            double avg;

            for(int k = 0; k<studentNum; k++){
                score[k] = Integer.parseInt(st.nextToken());
                total += score[k];
            }
            avg = total / studentNum;

            for(int k = 0; k<studentNum; k++){
                if(score[k]>avg){
                    count++;
                }
            }
            bw.write(String.format("%.3f%%\n", ((double) count/studentNum) * 100));
            //%를 출력하기 위해서는 두번쓰면된다.        
        }
        bw.flush();
        bw.close();
    }
}
//값이 중첩되지 않게 초기화 시키도록 항상 조심하자

