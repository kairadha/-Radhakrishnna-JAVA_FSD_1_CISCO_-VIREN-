package P1;

public class N {
	

public int i2=11;
protected long l2=1213465L;
 double d2=125;
 
 public int publicmethod() {
//	 System.out.println("this is Public methiod");
	 long l=DefaultMethod();
	double d= ProtectedMethod();
	System.out.println("===============");

	System.out.println("Variables of N");

	System.out.println(l);
	System.out.println(d);
	return i2;
 }
	

private int privateMethod() {
//	 System.out.println("this is Private methiod");
	return i2;
}

 long DefaultMethod() {
//	 System.out.println("this is Default methiod");
	int im=new M().MethodPublic();
	float fm=new M().MethodProtected();
	long lm=new M().Methoddefault();
	
	System.out.println("Variables of M");

	System.out.println(im);
	System.out.println(fm);
	System.out.println(lm);


	 
	return l2;
}

protected double ProtectedMethod() {
//	 System.out.println("this is Protected methiod");
	return d2;
}

public int method() {
	System.out.println(l2);
	System.out.println(d2);
	return i2;
}
}