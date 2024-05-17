class Vehicle {
    public String brand;
    
    public Vehicle(String brand){
        this.brand=brand;
    }
    public void printDescription(){
        System.out.println("Brand: "+brand);
    }
    
}
class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors){
        super(brand);
        this.numberOfDoors= numberOfDoors;

    }
    public void printDescription(){
        super.printDescription();
        System.out.println("Number of Doors: "+numberOfDoors);
    }

}

 public class Main1 {
    public static void main(String[] args) {
        Car car= new Car("Maruti", 4);
        car.printDescription();
    }

    
}
    