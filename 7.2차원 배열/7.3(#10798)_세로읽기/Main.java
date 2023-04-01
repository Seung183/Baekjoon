import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        char[][] array = new char[5][15];

        for(int i =0; i<5; i++){
            String s = br.readLine();
            for(int j = 0; j<s.length(); j++){
                array[i][j] = s.charAt(j);
            }
        }

        for(int i =0; i<15; i++){
            for(int j = 0; j<5; j++){
                if(array[j][i] != 0){//만약 배열에 들어있는 값이 0이 아닐경우 출력, char배열이므로 문자 0은 상관없음
                    sb.append(array[j][i]);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
