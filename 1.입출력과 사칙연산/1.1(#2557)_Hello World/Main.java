import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = "Hello World!";
        bw.write(a);

        bw.flush(); //Scanner처럼 바로 출력되는 것이 아니다. 따라서 남아있는 데이터를 모두 출력하는 flush 필요
        bw.close(); //close의 경우 완전 기능을 닫아버린다. 줄바꿈이 필요하다면 newLine 이용
    }
}
//BufferedReader와 BufferedWriter가 Scanner보다 효율이 좋다
//버퍼를 사용하지 않는 경우 키보드 입력이 키를 누르는 즉시 바로 전달됨
//버퍼는 키보드에 입력 할때마다 값을 전달하는 것이 아니라 버퍼에 정해진 용량만큼 모았다가 전달을 해준다.