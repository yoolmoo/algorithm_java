package algo_5;
import java.util.*;

public class CollectionsEx {
	static void printList(LinkedList<String> I) {
		Iterator<String> iterator = I.iterator();
		String e, separator;
		while (iterator.hasNext()) {
			e = iterator.next();
			if(iterator.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.print(e+separator);
		}
	}
	
	public static void main(String[] args) {
	LinkedList<String> myList = new LinkedList<String>();
	myList.add("트랜스포머");
	myList.add("스타워즈");
	myList.add("매트릭스");
	myList.add(0, "터미네이터");
	myList.add(2, "아바타");
	
	Collections.sort(myList); //요소 정렬
	printList(myList);//정렬된 요소 출력

	Collections.reverse(myList); //요소의 순서를 반대로
	printList(myList); // 요소 출력
	
	int index = Collections.binarySearch(myList, "아바타")+1;
	System.out.println("아바타는 " +index+"번째 요소입니다." );
	
	
	}
}
