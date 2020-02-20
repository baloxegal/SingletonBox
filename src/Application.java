
public class Application {

	public static void main(String[] args) {
		
		Box firstTestObject = Box.getInstance();
		firstTestObject.setValue(500);
		System.out.println(firstTestObject.getValue());
				
		Box secondTestObject = Box.getInstance();
		firstTestObject.setValue(1000);
		System.out.println(secondTestObject.getValue());
		
		System.out.println(firstTestObject.toString());
		System.out.println(secondTestObject.toString());
	}

}
