
public class Application {

	public static void main(String[] args) {
		
		Box firstTestObject = Box.getInstance(500);
		System.out.println(firstTestObject.getValue());
		
		Box secondTestObject = Box.getInstance(1000);
		System.out.println(secondTestObject.getValue());
		
		System.out.println(firstTestObject.toString());
		System.out.println(secondTestObject.toString());
	}

}
