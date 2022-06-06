import java.util.Scanner;

// 원래는 2의 거듭제곱이면 true 아니면 false를 리턴하는 문제였는데
// 숫자를 입력받아서, 2의 거듭제곱이면 몇거듭제곱인지를 카운트해서 출력해보자.

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        long num = scan.nextLong();

        long output = num;
        int count = 0;

        while (num > 1) {
            if (num % 2 == 1) {  // 홀수면 false
                break;
            } else if (num % 2 == 0) {  // 짝수면 / 2
                num = num / 2;
                count++;
            }
        }

        if (num == 1) System.out.println(output + "은 2의 " + count + "제곱입니다.");
        else System.out.println(output + "은 2의 거듭제곱이 아닙니다.");

    }
}