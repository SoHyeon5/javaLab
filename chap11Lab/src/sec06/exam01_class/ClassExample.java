package sec06.exam01_class;

public class ClassExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		Class clazz1 = car.getClass(); // ��ü.getClaa()�� �ش� ��ü�� Class ��ü�� ��´�.
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackageName());
		System.out.println();
		
		try {
			// Class.forName()�� �ش� ��ü�� Class ��ü�� ��´�.
			Class clazz2 = Class.forName("sec06.exam01_class.Car");
			System.out.println(clazz1.getName());
			System.out.println(clazz1.getSimpleName());
			System.out.println(clazz1.getPackageName());
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
