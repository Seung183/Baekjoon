import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        String[] sArray = new String[s.split("-").length]; // -로 나눈 문자열을 저장할 배열 선언

        // -로 나눈 문자열을 저장한 배열
        for(int i = 0; i<sArray.length; i++){
            sArray[i] = s.split("-")[i];
        }

        // 첫번째 인덱스 결과값 지정
        int result = Add(sArray[0]);

        // -로 나누어 더한값들을 전부 빼준다.
        for(int i = 1; i<sArray.length; i++){
            int temp = Add(sArray[i]);
            result -= temp;
        }

        System.out.print(result);
    }

    static int Add(String s){
        int result = 0;

        String[] temp = s.split("\\+"); // +는 메타문자로 인식되어  escape문자 \\ 필요

        //입력받은 문자열을 +로 나누고 정수값으로 변환하여 다 더한 결과
        for(int i = 0; i<temp.length; i++){
            result += Integer.parseInt(temp[i]);
        }

        return result;
    }
}
//split 활용