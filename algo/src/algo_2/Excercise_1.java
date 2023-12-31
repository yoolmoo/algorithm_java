package algo_2;

class TV {
    private int size;

    public TV(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }
}

class ColorTV extends TV {
    private int color;

    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }

    protected int getColor() {
        return color;
    }

    public void printProperty() {
        System.out.println(getSize() + "인치 " + getColor() + "Color TV");
    }
}

class IPTV extends ColorTV {
    private String ipAddress;

    public IPTV(String ipAddress, int size, int color) {
        super(size, color);
        this.ipAddress = ipAddress;
    }

    public void printProperty() {
        System.out.println(ipAddress + " 주소의 " + getSize() + "인치 " +  getColor()+ "컬러 IPTV");
    }
}

public class Excercise_1 {
    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();

        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}

