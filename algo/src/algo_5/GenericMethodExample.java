package algo_5;

public class GenericMethodExample {
	//T가 타입 매개 변수인 제네릭 메소드
	public static <T> Gstack<T> reverse(Gstack<T> a){
		Gstack<T> s = new Gstack<T>();
		while (true) {
			T tmp;
			tmp = a.pop(); // 원해 스택에서 요소 하나를 꺼냄
			if (tmp ==null)// 스택이 비었음
				break;
			else
				s.push(tmp);//새 스택에 요소를 삽입
		}
		return s; // 새 스택을 반환
	}
	
	public static void main(String[] args) {
		//Double타입의 GStack 생성
		Gstack<Double> gs = new Gstack<Double>();
		
		//5개의 요소를 스택에 push
		for (int i=0; i<5; i++) {
			gs.push((double)i);
		}
		gs = reverse(gs);
		for (int i=0; i<5; i++) {
			System.out.println(gs.pop());
		}
	}
}
