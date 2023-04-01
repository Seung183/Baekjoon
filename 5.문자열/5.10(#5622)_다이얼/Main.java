import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = br.readLine();
        int count = 0;
        for(int i = 0; i<string.length(); i++){
            switch (string.charAt(i)){
                case 'A','B','C':
                    count += 3;
                    break;
                case 'D','E','F':
                    count += 4;
                    break;
                case 'G','H','I':
                    count += 5;
                    break;
                case 'J','K','L':
                    count += 6;
                    break;
                case 'M','N','O':
                    count += 7;
                    break;
                case 'P','Q','R','S':
                    count += 8;
                    break;
                case 'T','U','V':
                    count += 9;
                    break;
                case 'W','X','Y','Z':
                    count += 10;
                    break;
            }
        }
        System.out.println(count);
    }
}
