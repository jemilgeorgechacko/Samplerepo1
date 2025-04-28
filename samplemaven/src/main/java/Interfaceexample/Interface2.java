package Interfaceexample;

public class Interface2 implements Interface1  {
	

	public static void main(String[] args) {
		Interface2 obj=new Interface2();//object creation
		Interface1 obj1=new Interface2();//reference creation
		obj1.display();
		obj1.show();
		
		obj.display();
		obj.show();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}

	@Override
	public void show() {
		System.out.println("world");
		// TODO Auto-generated method stub
		
	}

}
