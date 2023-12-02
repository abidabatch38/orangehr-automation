package practice.com;

public abstract class Study {
	
	class student{
}
	
	
	int p=20;// name=p==>  Global==> instance
	static int c=30;// name=c==> Global==> static 
	
//5000
	static int mySalary = 5000;
	//Abida
	static String myName = "Abida";
	static double price = 2.50;
	
	String a="abida123$";
	Object b="name123$$@#";


	
	
	public static void main(String[] args) {
		
		int d=60;// name=d==> Local
		
		int a=10;
		int age=50;
		String name="Sara";
		
		System.out.println(a);
		System.out.println(age);
		System.out.println(name);
				
		System.out.println("Hello world");
		System.out.println(mySalary);
		System.out.println(myName);
	}
	
	

}
