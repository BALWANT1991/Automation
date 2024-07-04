package objectUse;

public class Rectangle2 {
	
	
	
	int len;
	int width;
	
	public Rectangle2(int x ,int y) {
		
		len=x;
		width=y;
	}
	
	public void Area(Rectangle r) {
		int Area =r.length*r.width;
		System.out.println("Area of rectangle : "+Area);
		
	}
}
class AreaRecatangle{

	public static void main(String [] args) {
		Rectangle2 r = new Rectangle2(20,10);
	//	r.Area(r);
		//Rectangle2 xx =rr.Area(r);
		
	}
	
}