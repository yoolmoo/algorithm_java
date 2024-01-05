package algo_4;
import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		//정수값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);// 5삽입
		v.add(4);//4삽입
		v.add(-1);//-1삽입
		v.add(2, 100); //4와 -1사이에 정수 100삽입
		
		//Iterator를 이요한 모든 정수 출력하기
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		//Iterator를 이용하여 모든 저웃 더하기
		int sum = 0;
		it = v.iterator(); // Iterator 객체 얻기
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("백터에 있는 정수 합:" + sum);
	}
}
