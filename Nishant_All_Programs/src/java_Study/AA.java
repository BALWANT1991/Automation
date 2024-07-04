package java_Study;

public class AA {

}
class BB extends AA{
	
	public AA Message() {
		
		System.out.println("return type is working fine");
		return this;
		
		
	}
		
		public static void main(String args[]) {
			
			BB b = new BB();
			b.Message();
		}
}