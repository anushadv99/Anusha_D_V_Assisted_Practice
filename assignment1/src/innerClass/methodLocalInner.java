package innerClass;

class Car {
    String carName;
    String carType;

    // assign values using constructor
    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    // private method
    private String getCarName() {
        return this.carName;
    }
    
    
    void vehicle() {
    	
    class Engine{
        String engineType;
        
        void setEngine() {

           // Accessing the carType property of Car
            if(Car.this.carType.equals("4WD")){

                // Invoking method getCarName() of Car
                if(Car.this.getCarName().equals("Crysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }

            }
            else{
                this.engineType = "Bigger";
            }
        }
        String getEngineType(){
        return this.engineType;
        }
    }
    Engine engine = new Engine();
    engine.setEngine();
    System.out.println("Engine Type for 8WD= " + engine.getEngineType());

    Engine c2engine = new Engine();
    c2engine.setEngine();
    System.out.println("Engine Type for 4WD= " + c2engine.getEngineType());
    
}
}
    public class methodLocalInner {

	public static void main(String[] args) {
		Car car1=new Car("mazda","8wd");
		car1.vehicle();
		Car car2=new Car("mazda1","8wd1");
		car2.vehicle();
		// TODO Auto-generated method stub

	}

}
