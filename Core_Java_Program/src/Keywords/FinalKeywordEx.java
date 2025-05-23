package Keywords;

// 1. Final class
final class FinalKeywordEx { 

  // 2. Constant variables
  final int CONSTANT_INTEGER = 10; 
  final String CONSTANT_STRING = "Hello";

  // 3. Final method
  final void finalMethod() {
    System.out.println("Final method");
  }
  
  public static void main(String[] args) {
	  System.out.println("Final method");
	  FinalKeywordEx fk=new FinalKeywordEx();
	  fk.finalMethod();
  }
}
