package P1;

public class M extends N{
	 private int i =10;
	 long l=103215465L;
	 protected float f=3.22f;
	 
public  int MethodPublic() {
//	 System.out.println(" this is public method");
//	 System.out.println("int value "+i);
	System.out.println("***N values****");
	System.out.println(new N().method());
	
	System.out.println("****M values***");

	long Lm=MethodPrivate();
	float Fm=MethodProtected();
	System.out.println(Lm);
	System.out.println(Fm);
	
	
	return i;

}
	private long MethodPrivate() {
//		System.out.println("method is private");
       return l;
	}
  
	 long Methoddefault() {
//		 System.out.println(" this is default method");
//		 System.out.println("long value "+l);
		 return l;
	 }

    protected float MethodProtected() {
//		 System.out.println(" this is protected  method");
//		 System.out.println("float value "+f);
		 return f;

	}

}