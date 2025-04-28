package Interfaceexample;

public class Multiplechild implements Multipleparent1,Multipleparent2,Multipleparent3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplechild obj=new Multiplechild();
		obj.diplay();
		obj.print();
		obj.show();

	}

	@Override
	public void print() {
		System.out.println("multi interface");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		System.out.println("helllo");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void diplay() {
		System.out.println("world");
		// TODO Auto-generated method stub
		
	}

}
