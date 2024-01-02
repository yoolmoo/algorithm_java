package algo;

class TV {
    String manufacturer;
    int year;
    int size;

    // 생성자 정의
    public TV(String manufacturer, int year, int size) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.size = size;
    }

    // show 메소드 정의
    public void show() {
        System.out.println(manufacturer + "에서 만든 " + year + "년형 " + size + "인치 TV");
    }
}

public class Excercise_1 {
    public static void main(String[] args) {
        // 올바른 따옴표 사용
        TV myTV = new TV("LG", 2017, 32);
        
        // show 메소드 호출
        myTV.show();
    }
}
