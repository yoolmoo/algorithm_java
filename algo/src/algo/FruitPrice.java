package algo;
import java.util.Scanner;
public class FruitPrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("무슨 과일 드릴까요? ");
		String order = scanner.next();
		int price=0;
		switch(order) {
			case "망고":
				price = 1500;
				break;
			case "사과":
				price = 500;
				break;
			case "바나나":
				price = 500;
				break;
			case "오렌지":
				price = 100;
				break;
			default:
				System.out.println("그건 저희 가게에 없습니다.");
		}
		if(price != 0)
			System.out.print(order + "는 " + price + "원입니다.");
		scanner.close();
	}
}

