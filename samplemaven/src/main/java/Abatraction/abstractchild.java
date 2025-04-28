package Abatraction;

public class abstractchild extends Abstractparent {
	public void print()
	{
		System.out.println("child class");
	}

	public static void main(String[] args) {
		//abstractchild obj=new abstractchild();
		Abstractparent obj1=new abstractchild();//reference creation
		obj1.display();
		obj1.show();
		//obj.display();
		//obj.show();
		//obj.print();
	}

	


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}


}
