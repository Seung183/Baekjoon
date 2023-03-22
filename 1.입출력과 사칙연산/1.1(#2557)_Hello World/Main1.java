import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        sb.append("Hello World!");

        System.out.println(sb);
    }
}
/*
StringBuilder는 자바에서 문자열을 동적으로 조작할 때 사용되는 클래스 중 하나.
StringBuilder의 장점
-가변성: StringBuilder는 가변적인 문자열을 다룰 수 있다.
        즉, 문자열의 길이가 동적으로 변할 수 있다.
        문자열의 추가, 삭제, 수정 등의 작업을 빠르고 효율적으로 처리할 수 있게 해줍니다.
        #String클래스는 불변하기 떄문에 문자열 조작 작업을 수행할 때 마다 새로운 문자열 객체를 생성
         StringBuilder클래스는 가변하기 때문에 새로운 객체를 생성하는 대신, 기존 객체를 조작
         
-속도: 문자열 조작 시, 기존의 문자열 객체를 생성하는 것이 아니라 내부 버퍼에 직접 작업을 수행한다.
      문자열 조작에 대한 속도를 높여준다. 문자열 조작이 필요한 작업에서 유용하다.
      
-메모리:  하나의 객체를 재사용하므로 메모리를 절약할 수 있다.

즉, 속도도 빠르고, 가변성이 있기때문에 메모리 성능도 좋다.
    코드 간결성 또한 좋다.
 */