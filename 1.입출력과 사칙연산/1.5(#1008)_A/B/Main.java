import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String div = br.readLine(); //br.readLine()은 한줄만 읽는다. 즉, 엔터치면 끝

        double a = Double.parseDouble(div.split(" ")[0]);
        double b = Double.parseDouble(div.split(" ")[1]);
        //parseInt()는 String타입의 숫자를 int 타입으로 변환해준다.
        //split함수는 문자열을 자르고 배열로 만들어준다. 즉, sum.split(" ")배열의 0번째 인덱스. [0]

        bw.write(String.format("%.10f",a/b)); //오차범위로 소수점 자리 정해줘야한다.

        bw.flush();
        bw.close();
    }
}