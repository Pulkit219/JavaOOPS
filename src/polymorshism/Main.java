package polymorshism;

public class Main {

	public static void main(String[] args) {
		//normal assignments
		Person p1 = new Person();
		Student s1 = new Student();
		
	
		
		//dynamic polymorphism 
		Person p2 = new Student(); //student methods will called
		
		p2.move();
		
		
		//illegal paramaters
//		
//		Student s3 = new Person();
//		
		System.out.println(p1 instanceof Person);
		System.out.println(p2 instanceof Person);
		System.out.println(p2 instanceof Student);

	}

}
