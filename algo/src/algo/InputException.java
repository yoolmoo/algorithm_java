package algo;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 3개 입력하세요.");
		int sum=0, n=0;
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
			try {
				n = scanner.nextInt(); // 정수입력				
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.next(); // 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
				i--; // 인덱스가 증가하지 않도록 미리 감소
				continue;// 다음 루프
			}
			sum +=n; //합하기
		}
		System.out.println("합은 " + sum);
		scanner.close();
	}
}
