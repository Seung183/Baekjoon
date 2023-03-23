import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        int[] num = new int[30];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i<num.length; i++){
            num[i] = 0;
        }

        for(int i = 1; i< num.length-1; i++){
            int submit = Integer.parseInt(br.readLine());

            num[submit-1] = 1;
        }
        for(int i = 0; i< num.length; i++){
            if(num[i] == 0){
                System.out.println(i+1);
            }
        }
    }
}
// 데이터를 비교해서 꺼낼 필요 없다!
// 만약 일치하지 않는 데이터가 있다면 다른 숫자로 초기화하고 그 숫자가 아닌거 꺼내면 된다.