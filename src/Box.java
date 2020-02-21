
public class Box {
	//1. Внутрь Box могут попасть любые типы данных, т.к. поле value принимает данные типа object.
	
	private Object value;
	private static volatile Box instance;
	
	private Box(Object value) {
		 this.value = value;
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
	
//	private static class Holder{
//		private static final Box INSTANCE = new Box();
//	}
//	public static Box getInstance() {
//		return Holder.INSTANCE;
//	}
	public static Box getInstance(Object value) {
		Box localInstance = instance;
		if(localInstance == null) {
			synchronized (Box.class) {
				localInstance = instance;
				if(localInstance == null) {
					instance = localInstance = new Box(value);
				}
			}			
		}
		return localInstance;
	}
}