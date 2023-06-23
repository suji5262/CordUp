package Ex_100.주민번호_입력받아_형태_바꿔_출력하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        input = input.replaceAll("-", "");

        System.out.println(input);
    }
}
