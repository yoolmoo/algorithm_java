package algo_2;
class Point{
    private int x,y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getx() {
        return x;
    }
    public int gety() {
        return y;
    }
    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
        
    
}
class ColorPoint extends Point{
    String str;
    public ColorPoint(int x, int y, String str) {
        super(x,y);
        this.str = str;
    }
    public void setXY(int x, int y) {
        move(x,y);
    }
    public void setColor(String str) {
        this.str = str;
    }
    public String toString() {
        
        return str+"색의 ("+getx()+","+gety()+")의 점";
    }
}
public class Excercise_3 {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ColorPoint cp = new ColorPoint(5,5,"Yellow");
        cp.setXY(10,20);
        cp.setColor("Red");
        String str = cp.toString();
        System.out.println(str+"입니다.");
    }
}