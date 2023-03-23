import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<10; i++){
            set.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(set.size());
    }
}
/*
HashSet은 집합 자료형
집합 자료형은
 - 중복을 허용하지 않는다.
 - 순서가 없다.
 */