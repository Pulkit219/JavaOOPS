package interfacePolymorphism;

public class Rectangle implements Measurable {

	
	double breadth, length;
	
	public Rectangle(double br, double le)
	
	{
		this.breadth =br;
		this.length = le;
		
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(breadth + length);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
