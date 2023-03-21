import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String dicenum = br.readLine();

        StringTokenizer st = new StringTokenizer(dicenum);

        int firstnum = Integer.parseInt(st.nextToken());
        int secondnum = Integer.parseInt(st.nextToken());
        int thirdnum = Integer.parseInt(st.nextToken());

        if((firstnum == secondnum) && (firstnum == thirdnum)){
            bw.write(String.format("%d",10000 + firstnum*1000));
        }else if(firstnum == secondnum || firstnum == thirdnum){
            bw.write(String.format("%d",1000+firstnum*100));
        }else if(secondnum == thirdnum){
            bw.write(String.format("%d",1000+secondnum*100));
        }
        else{
            bw.write(String.format("%d",Math.max(Math.max(firstnum,secondnum),thirdnum)*100));
        }
        //bw.write에 숫자를 넣어주면 아스키코드에 따른 문자 출력, 따라서 숫자를 String형으로 변환시켜줘야 한다.
        //최댓값 구할 때 Math.max 함수 활용
        bw.flush();
        bw.close();
    }
}