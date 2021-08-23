package Assingments;

class vehicle1 {
	  int speed = 21;
	  long distance = 2116l;

	  vehicle1() {
	    System.out.println("Im in default constructor of vehicle1");
	  }

	  vehicle1(int n) {
	    System.out.println("Im in parametrized constructor of vehicle1");
	  }

	  public void fuel(int x) {
	    System.out.println("fuelmethod1: " + x);
	  }

	  public void fuel(float a, String n) {
	    System.out.println("fuelmethod2: " + a + " name " + n);

	  }

	  public void fuel(char a, int b) {
	    System.out.println("fuelmethod3: " + a + " number: " + b);

	  }

	  void run() {
	    System.out.println("vehicle1 is Running");
	  }

	   void stop() {
	    System.out.println("vehicle1 has stopped");

	  }

	   void display() {
	    System.out.println("inside the display method ");

	  }  
	   
	}

	class Twowheeler extends vehicle1 {

	  int speed = 16;
	  long distance = 1616l;
	  int No_of_tyre = 2;

	 Twowheeler() {
	    System.out.println("Im in default constructor of Twowheeler");
	  }
 @Override
	   void stop() {
	    System.out.println("twowheeler is stopped");

	  }

	   void run() {
	    System.out.println("twowheeler is running condition");
	  }

	  public void display() {
	    System.out.println("speed of twowheeler :" + speed);
	    System.out.println("distance of twowheeler :" + distance);
	    System.out.println("tyre of twowheeler :" + No_of_tyre);
	    System.out.println("speed of vehicle1 :" + super.speed);
	    System.out.println("distance of vehicle1 :" + distance);
	    
	  }
	}

	class Threewheeler extends vehicle1 {

	  int speed =1621;
	  long distance = 2121l;
	  int No_of_tyre = 3;

	  Threewheeler() {
	    System.out.println("Im in default constructor of Threewheeler");
	  }
@Override
	   void stop() {
	    System.out.println("Threewheeler is stopped");

	  }

	   void run() {
	    System.out.println("Threewheeler is running condition");
	  }

	  public void display() {
	    System.out.println("speed of Threewheeler :" + speed);
	    System.out.println("distance of Threewheeler :" + distance);
	    System.out.println("tyre of Threewheeler :" + No_of_tyre);
	    System.out.println("speed of vehicle1 :" + super.speed);
	    System.out.println("distance of vehicle1 :" + super.distance);
	  }
	}

	class Fourwheeler extends vehicle1{

	  int speed = 161611;
	  long distance = 211621l;
	  int No_of_tyre = 4;

	  Fourwheeler() {
	    System.out.println("Im in default constructor of Fourwheeler");
	  }
@Override
	   void stop() {
	    System.out.println("Fourwheeler os stopped");

	  }

	   void run() {
	    System.out.println("Fourwheeler is running condition");
	  }

	  public void display() {
	    System.out.println("speed of Fourwheeler :" + speed);
	    System.out.println("distance of Fourwheeler :" + distance);
	    System.out.println("tyre of Fourwheeler :" + No_of_tyre);
	    System.out.println("speed of vehicle1 :" + super.speed);
	    System.out.println("distance of vehicle1 :" + super.distance);
	  }
	}

	class Eightwheeler extends vehicle1 {

	  int speed = 21211;
	  long distance = 167161l;
	  int No_of_tyre = 8;

	  Eightwheeler() {
	    System.out.println("Im in default constructor of Eightwheeler");
	  }
@Override
	  void stop() {
	    System.out.println("Eightwheeler is stopped");

	  }

	  void run() {
	    System.out.println("Eightwheeler is running condition");
	  }

	  public void display() {
	    System.out.println("speed of Eightwheeler :" + speed);
	    System.out.println("distance of Eightwheeler :" + distance);
	    System.out.println("tyre of Eightwheeler :" + No_of_tyre);
	    System.out.println("speed of vehicle1 :" + super.speed);
	    System.out.println("distance of vehicle1 :" + super.distance);
	  }
	}

	public class Vehicle {

	  public static void main(String[] args) {

	    vehicle1 ob;
	    ob = new Twowheeler();
	    ob.display();
	    System.out.println(" ");

	    ob = new Threewheeler();
	    ob.display();
	    System.out.println(" ");

	    ob = new Fourwheeler();
	    ob.display();
	    System.out.println(" ");

	    ob = new Eightwheeler();
	    ob.display();

	  }

	}
