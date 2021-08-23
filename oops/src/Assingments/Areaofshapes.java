package Assingments;
 public class Areaofshapes{
    int i,j,k;
    float x,y;

    public Areaofshapes(int m){
        i=m;
    }
     void squarearea(){
        j=i*i;
        System.out.println("area of the square is "+ j);
    }
    public Areaofshapes(float n){
        x=n;
    }
     void circlearea(){
        y=3.14f*x*x;
        System.out.println("area of the circle is "+ y);

    }
    public Areaofshapes(int q,int r){
        i=q;
        j=r;
    }
    void rectanglearea(){
        k=i*j;
        System.out.println(" area of the rectangle is " +k);
    }
   

    

    public static void main(String[] args){
        Areaofshapes a1= new Areaofshapes(5);
       
        Areaofshapes a2=new Areaofshapes(21f);
        Areaofshapes a3=new Areaofshapes(21,16);
        a3.rectanglearea();
        a2.circlearea();
       a1.squarearea();

    }

}


