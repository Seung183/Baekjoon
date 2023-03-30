import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(br.readLine());

        boolean isGroup;
        int count = 0;

        for(int i = 0; i<caseNum; i++){
            String s = br.readLine();
            isGroup = true;
            for(int j = 0; j<s.length()-1; j++){
                if(s.charAt(j) != s.charAt(j+1)){
                    for(int k = j; k<s.length()-1; k++){
                        if(s.charAt(j) == s.charAt(k+1)){
                            isGroup = false;
                        }
                    }
                }
            }
            if(isGroup){
                count++;
            }
        }
        System.out.println(count);
    }
}
//주의할 점: isGroup이 false가 된다면 true로 초기화해줘야하는데 까먹음.
//          초기화해주지 않아서 오래걸렸다.