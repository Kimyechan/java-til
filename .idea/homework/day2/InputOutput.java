import java.util.Scanner;

/**
 * 입력받아 처리하기
 *
 * 3개의 정수를 입력받아, 그 중 최대값을 출력하고자 한다.
 * 이를 수행하는 프로그램을 작성하시오.
 *
 */

public class InputOutput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = 0;

        if(a > b) {
            max = a;
        } else {
            max = b;
        }

        if(max < c) {
            max = c;
        }

        System.out.printf("3개의 정수 중 가장 큰 정수는 %d 입니다.", max);

    }
}