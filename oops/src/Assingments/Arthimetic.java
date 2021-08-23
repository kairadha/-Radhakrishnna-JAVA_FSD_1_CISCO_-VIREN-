package Assingments;
public class Arthimetic {
    int a,b,c;
    float x,y;

    public int add(int a,int b){
       
        c=a+b;
        System.out.println("addition of  a and b is "+c);
        return c;
    }
    public float area(float x){
       
        y=3.14f*x*x;
        System.out.println("area of the circle is" + y);
        return y;
    }
    public int area(int a,int b){
       
        c=a*b;
        System.out.println("area of the rectangle is " +c);
        return c;

    }
    public static void main(String[] args){
        Arthimetic a1=new Arthimetic();
        a1.add(2,3);
        a1.area(5);
        a1.area(2,3);
    }

}

