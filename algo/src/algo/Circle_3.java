package algo;

public class Circle_3 {
	int radius;
	void set(int r) {radius = r;}
	double getArea() {return 3.14*radius*radius;}
	
	public Circle_3() { //매개 변수 없는 생성자
		radius = 1; //radius의 초기값은 1
	}
	
	public Circle_3(int r) {
		radius = r;
	}
	public static void main(String[] args) {
		Circle_3 pizza = new Circle_3(10);
		System.out.println(pizza.getArea());
		
		Circle_3 donut = new Circle_3();
		System.out.println(donut.getArea());
	}
}
