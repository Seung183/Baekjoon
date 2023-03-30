import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        sb.append(br.readLine());
        
        System.out.println(sb.toString().equals(sb.reverse().toString()) ? 1 : 0);
    }
}
//StringBuilder활용
/*
주의할점
1.sb는 toString()이 오버라이딩이 되어있다. 하지만 equals메소드랑 비교할 때 꼭 toString() 써줘야한다.
2. 만약 sb.reverse().toString() 요 부분을 변수로 선언해 집어넣게 되면 sb객체의 내용을 뒤집기때문에
   변수만 reverse가 되는것이 아니라 sb도 reverse된다.
   ex) - sb <== abcd
       String reversed = sb.reverse().toString() <== -sb <== dcba
                                                     -reversed <== dcba
 */