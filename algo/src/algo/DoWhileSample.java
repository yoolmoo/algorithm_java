package algo;

public class DoWhileSample {
	public static void main (String[] srgs) {
		char c = 'a';
		
		do {
			System.out.print(c);
			c = (char)(c + 1);
		} while (c <= 'z');
	}
}