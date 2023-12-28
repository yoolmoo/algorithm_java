package algo;

import java.util.Scanner;

public class excercise1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오 >> ");
		int money = scanner.nextInt(); // 정수입력
		System.out.print("\n");
		int bill_50000 = money / 50000; // 50000으로 나눈 몫
		int bill_10000 = (money % 50000) / 10000; // 10000으로 나눈 몫
		int bill_1000 = ((money % 50000) % 10000) / 1000 ; //10000으로 나눈 나머지
		int coin_100 = (((money % 50000) % 10000) % 1000) / 100 ; //100으로 나눈 몫
		int coin_50 = ((((money % 50000) % 10000) % 1000) % 100) / 50 ; //50으로 나눈 나머지
		int coin_10 = ((((money % 50000) % 10000) % 100) % 50) / 10 ; //10으로 나눈 몫
		int coin_1 = ((((money % 50000) % 10000) % 100) % 50) % 10 ;//10로 나눈 나머지
		
		System.out.println("오만원권 "+ bill_50000 + "매");
		System.out.println("만원권 "+ bill_10000 + "매");
		System.out.println("천원권 "+ bill_1000 + "매");
		System.out.println("백원 "+ coin_100 + "개");
		System.out.println("오십원 "+ coin_50 + "개");
		System.out.println("십원 "+ coin_10 + "개");
		System.out.println("일원 "+ coin_1 + "개");
		scanner.close();
	}
}
