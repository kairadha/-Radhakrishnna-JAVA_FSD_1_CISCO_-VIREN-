package P1;



public class P  {

	public static void main(String[] args) {
		
		System.out.println(new M().MethodPublic());
		System.out.println(new M().MethodProtected());
		System.out.println(new M().Methoddefault());
		System.out.println(new N().ProtectedMethod());
		System.out.println(new N().publicmethod());
		System.out.println(new N().DefaultMethod());
//System.out.println( p.MethodPublic());
//System.out.println( p.MethodProtected());
//System.out.println( p.Methoddefault());
//p.publicmethod()
	}

}
