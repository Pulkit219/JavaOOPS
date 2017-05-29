package interfacePolymorphism;

public class Main {

	public static void main(String[] args) {
		Measurable mes = new Rectangle(10, 10);
	mes = new Circle();
System.out.println(mes.getPerimeter());
	}

}
