import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        String num2 = br.readLine();

        System.out.println(num1 * (num2.charAt(2) - '0'));
        System.out.println(num1 * (num2.charAt(1) - '0'));
        System.out.println(num1 * (num2.charAt(0) - '0'));
        System.out.println(num1 * Integer.parseInt(num2));
    }
}
/*
charAt 메서드는 문자열의 인덱스 위치에 있는 문자(Character) 값을 반환한다.
이때 반환되는 값은 아스키코드 값인 문자이다.

따라서 '0'을 뺴주는데
예를 들어 num2(문자열)의 charAt(0){(첫번째 문자}) 가 숫자 '0'에서 얼마나 떨어져 있는지를 계산한 것
해당 문자의 ASCII 코드 값에서 '0'의 ASCII코드 값을 뺀 것
만약 세번째 문자가 3이면 아스키코드값으로 51, '0'은 아스키코드값으로 48
따라서 51 -48 은 3
 */


