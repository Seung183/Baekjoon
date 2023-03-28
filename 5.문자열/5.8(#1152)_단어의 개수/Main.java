import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int count = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }
        if(s.charAt(0) != ' ' && s.charAt(s.length()-1) != ' '){
            count = count+1;
        }
        if(s.charAt(0) == ' ' && s.charAt(s.length()-1) == ' '){
            count = count-1;
        }
        
        System.out.println(count);

    }
}

