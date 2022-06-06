import java.util.Scanner;

public class ComputeWhenDouble {
    public static void main(String[] args) {

        double num1 = 0;
        double num2 = 0;
        double output = 1.0;
        int year = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print(" 연이율 (%) : ");
        num1 = sc.nextInt();
        System.out.print(" 원금의 n배 : ");
        num2 = sc.nextInt();

        while (output < num2){
            output = output * (1+ (num1)/100);
            year++;
        }
        System.out.println("원금의 "+num2+"배가 될 때까지 " +year+"년이 걸립니다.");

    }
}


