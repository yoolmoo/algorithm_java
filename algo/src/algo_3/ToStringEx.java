package algo_3;

class point_1{
	private int x,y;
	public point_1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point(" + x + "," + y +")";
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		point_1 p = new point_1(2,3);
		System.out.println(p.toString());
		System.out.println(p);//p는 p.toString()으로 자동 변환
		System.out.println(p + "입니다."); // p.toString() + "입니다"로 자동 변환
	}
}
