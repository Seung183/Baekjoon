import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //쿼터 0.25, 다임 0.10 니켈 0.05 페니 0.01
        // 25 10 5 1
        // 거스름돈은 항상 5.00 이하 동전의 개수 최소
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<testcase; i++){
            int money = Integer.parseInt(br.readLine());
            sb.append(money / quarter + " ");
            money = money % quarter;
            sb.append(money /dime+ " ");
            money = money % dime;
            sb.append(money /nickel+ " ");
            money = money % nickel;
            sb.append(money /penny+ "\n");
        }
        System.out.println(sb.toString());
    }
}
//돈을 코인으로 나누면 개수 나오고 나머지를 구해서 계속 나눠준다.