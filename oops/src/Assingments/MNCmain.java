package Assingments;

abstract class MNC{
	
	MNC(){
	System.out.println("Im in mnc default constructor"); 
	}
	
	 void method1() {
		System.out.println("normal method in mnc");
	}
	
	 abstract public void abstractmethod1();

	 abstract public void abstractmethod2();
}

	abstract class infosys extends MNC {

		abstract public void abstractmethod1();

		public void abstractmethod2() {
		System.out.println(" in Infosys");	
		}
}
	class Hello2 extends infosys{
	public void abstractmethod1()
	{
		System.out.println("abstractmethod1 in hello2");
	}
	public void abstractmethod2()
	{
		System.out.println("abstractmethod2 of infosys which is implemented in infosys class");
	}
	void method2() {
		System.out.println("normal method2 in hello2 class");
	}
}
public class MNCmain{
	 public static void main(String[]args)
	 {
		 infosys i  = new Hello2();
		 Hello2 h1 =new Hello2();
		 
		 i.method1();
		 i.abstractmethod1();
		 i.abstractmethod2();		
		 h1.method2();
	 }
}

