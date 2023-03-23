import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] num = new boolean[42];

        for(int i = 0; i < 10; i++){
            num[Integer.parseInt(br.readLine())%42] = true;
        }

        int count = 0;
        for(boolean val : num){
            if (val){
                count++;
            }
        }
        System.out.println(count);
    }
}
/*
확장 for 문
for(타입 변수명: 배열 or 컬렉션){
    //배열 또는 컬렉션에 저장된 값이 매 반복마다 하나씩 순서대로 읽어진다.
    //변수에 저장된다.
}
 */