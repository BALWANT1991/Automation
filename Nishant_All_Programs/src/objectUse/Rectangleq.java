package objectUse;

public class Rectangleq {
	int length;
    int width;

    Rectangleq(int l, int b) {
        length = l;
        width = b;
    }

    void area(Rectangleq r1) {
        int areaOfRectangle = r1.length * r1.width;
        System.out.println("Area of Rectangle : " 
                                + areaOfRectangle);
    }
}

class RectangleD {
    public static void main(String args[]) {
    	Rectangleq r1 = new Rectangleq(10, 20);
        r1.area(r1);
    }
}
