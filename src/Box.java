
public class Box {
	//1. Внутрь Box могут попасть любые типы данных, т.к. поле value принимает данные типа object.
	
	private Object value;
	
	private Box() {
		 
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Box value = " + value;
	}
	
	//Singelton
	
	private static class Holder{
		private static final Box INSTANCE = new Box();
	}
	public static Box getInstance() {
		return Holder.INSTANCE;
	}
}