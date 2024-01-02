package algo;

class Sample{
	public int a;
	public int b; // public이 아닌 private으로 저장할 경우 컴파일 오류 발생
	int c;
}

public class AccessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		aClass.b = 10;
		aClass.c = 10;
	}
}
