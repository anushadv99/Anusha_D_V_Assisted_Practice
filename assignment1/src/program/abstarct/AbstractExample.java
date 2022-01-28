package program.abstarct;

abstract class vehicle{
	int speed= 60;
	long distance = 32;
	abstract void run();
	abstract void stop();
	public void fuel(int i) {
		speed=i;
	}
	public void fuel(float f, String s) {
		
	}
	public void fuel(char c, int i) {
		
	}
	void display() {
		System.out.println("Vehicle is created");
		System.out.println(speed+" "+distance);
		}
	
	
}
class twoWheeler extends vehicle{
	int speed= 90;
	long distance = 49;
	int no_of_tyre = 2;
	void run() {
		System.out.println("twoWheeler running safely");
	}
	void stop() {
		System.out.println("twoWheeler stoped safely");
	}
	void display()
	{
		System.out.println("all the variables of 2w and vehicle: " + (speed +" "+distance+" "+no_of_tyre+" "+super.speed+" "+super.distance));
		
	}
	
}
class threeWheeler extends vehicle{
	int speed= 65;
	long distance = 45;
	int no_of_tyre = 3;
	void run() {
		System.out.println("threeWheeler running safely");
	}
	void stop() {
		System.out.println("threeWheeler stoped safely");
	}
	void display()
	{
		System.out.println("all the variables of 3w and vehicle: " + (speed +" "+distance+" "+no_of_tyre+" "+super.speed+" "+super.distance));
	}
	
}
class fourWheeler extends vehicle{
	int speed= 80;
	long distance = 44;
	int no_of_tyre = 4;
	void run() {
		System.out.println("fourWheeler running safely");
	}
	void stop() {
		System.out.println("fourWheeler stoped safely");
	}
	void display()
	{
		System.out.println("all the variables of 4w and vehicle: " + (speed +" "+distance+" "+no_of_tyre+" "+super.speed+" "+super.distance));
	}
	
}

class eightWheeler extends vehicle{
	int speed= 40;
	long distance = 90;
	int no_of_tyre = 8;
	void run() {
		System.out.println("eightWheeler running safely");
	}
	void stop() {
		System.out.println("eightWheeler stoped safely");
	}
	void display()
	{
		System.out.println("all the variables of 8w and vehicle : " + (speed +" "+distance+" "+no_of_tyre+" "+super.speed+" "+super.distance));
	}
	
}

public class AbstractExample {

	public static void main(String[] args) {
		
		vehicle k = new twoWheeler();
		vehicle k1 = new threeWheeler();
		vehicle k2 = new fourWheeler();
		vehicle k3= new eightWheeler();
		
		k.run();
		k.stop();
		k.display();
		k1.run();
		k1.stop();
		k1.display();
		k2.stop();
		k2.run();
		k2.display();
		k3.run();
		k3.stop();
		k3.display();
		
		
	}

}