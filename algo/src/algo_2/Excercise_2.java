package algo_2;
import java.util.Scanner;

abstract class Converter2 {
	abstract protected double convert(double src);
	abstract protected String getSrcString();	
	abstract protected String getDestString();
	protected double ratio;	
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print("바꾸고싶은 "+getSrcString() + " 수를 입력하세요>> ");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다.");
		sc.close();
	}
}

class Km2Mile extends Converter2 {
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	public double convert(double src) {
		return src / ratio;
	}
	
	@Override
	public String getSrcString() {
		return "Km";
	}
	
	@Override
	public String getDestString() {
		return "mile";
	}
}


public class Excercise_2 {
	public static void main(String[] args) {
		//ratio는 1마일이 1.6Km이기때문에 1.6으로 설정 
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}