package algo_4;

import java.util.Scanner;

public class Histogram {
	
	private int history [];
	
    
	Histogram() {
		history = new int [26];
	}
	
    
	public String readString() {
    
		StringBuffer sb = new StringBuffer(); // 키 입력을 받을 스프링버퍼 생성
		Scanner scanner = new Scanner(System.in);
		
        
		while (true) {
			String line = scanner.nextLine(); // 텍스트 한 라인을 읽는다.
			
			if (line.length() == 1 && line.charAt(0) == ';') // ';'만 있는 라인이면
				break; // 입력 끝
			sb.append(line); // 읽은 라인 문자열을 스트링버퍼에 추가한다.
		}
        
		return sb.toString();
	}
	
    
	public void calculate (String str) {
    
		for (int i = 0; i < str.length(); i++) {
        
			char c = str.charAt(i);
            
			if (c >= 65 && c <= 90)
				history[c - 65]++;
			if (c >= 97 && c <= 122)
				history[c - 97]++;
		}
	}
	
    
	public void draw() {
    
		System.out.println("히스토그램을 그립니다.");
        
        
		for (int i = 0; i < history.length; i++) {
        
			char c = (char)(i + 65);
			System.out.print(c);
            
			for (int j = 0; j < history[i]; j++)
				System.out.print("-");
			System.out.println();
		}
	}


	public static void main(String[] args) {
    
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
        
		Histogram histogram = new Histogram();
        
		String str = histogram.readString();
        
		histogram.calculate(str);
        
		histogram.draw();
	}
}