package objectUse;

public class ObjectUse2 {

	
	int a;
	int b;
	
	int c;
	
	ObjectUse2(int x ,int y,int z){
		a =x;
		b=y;
		c=z;
	}
	
	
	ObjectUse2 add() {
		
		ObjectUse2 temp = new ObjectUse2(c+20,a+40,b+40);
		return temp;
	}
}
class Test2{
	public static void main(String[] args) {
		ObjectUse2 obj = new ObjectUse2(20,20,20);
		ObjectUse2 obj2;
        obj2 = obj.add();
        System.out.println(obj.c);
        System.out.println(obj2.add());

	}

}
