package P2;



public class X {
	private  int i3=15;
	 long l3=216546;
	 protected float f3=23.21f;
	 public char ch='S';
	 
	 public  int MethodPub() {
//		 System.out.println(" this is public method");
//		 System.out.println("int value "+i);
		 long lon=MethodPri();
		 System.out.println(lon);
		 
		return i3;

	}
		private long MethodPri() {
//			System.out.println("method is private");
	        return l3;
		}
	   
		 float Methoddef() {
//			 System.out.println(" this is default method");
//			 System.out.println("long value "+l);
			 return f3;
		 }

	     protected char MethodPro() {
//			 System.out.println(" this is protected  method");
//			 System.out.println("float value "+f);
			 return ch;

	

}
}
