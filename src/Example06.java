import java.util.Scanner;

public class Example06 {
    // 흐름제어 -> 조건문, 반복문 + 예외처리
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // if문
        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();
        if (age <= 20) { // if?
            System.out.println("알파 세대시군요!");
        } else if (age <= 30) {
            System.out.println("젠지 세대시군요!");
        } else if (age <= 40) {
            System.out.println("밀레니엄 세대시군요!");
        } else { // if 구문이 포괄하지 못하는 나머지 부분에 대한 응답, 처리.
            System.out.println("해당 되는 세대 구분이 없네요");
        }
        // 반환
        sc.close();
    }
}
