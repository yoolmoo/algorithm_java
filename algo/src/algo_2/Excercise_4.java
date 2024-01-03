package algo_2;

class Point_1{
    private int x,y;
    public Point_1(int x, int y) {
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
 
class PositivePoint extends Point_1{
    public PositivePoint() {
        super(0,0);
    }
    public PositivePoint(int x, int y) {
        super(x,y);
        if(x<=0 || y<=0)
            super.move(0,0);
    }
    public void move(int x, int y) {
        if(x>0 && y>0) 
        super.move(x,y);
    }
    public String toString() {
        return "("+getx()+","+gety()+")의 점";
        
    }
}
public class Excercise_4 {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PositivePoint p = new PositivePoint();
        p.move(10,10);
        System.out.println(p.toString()+"입니다.");
        
        p.move(-5,5);
        System.out.println(p.toString() + "입니다.");
        
        PositivePoint p2 = new PositivePoint(-10,-10);
        System.out.println(p2.toString() + "입니다.");
    }
 
}

