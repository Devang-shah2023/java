package extra;


public class Extra1 {
    public static void main(String[] args) {
        Lion l1= new Lion();
        Lion l2= new Lion();
        Kangaroo k1= new Kangaroo();
        Animal a1= new Animal();

        System.out.println(l1.noOfAnimal);
        System.out.println(l2.totalLegOfAnimal);
        

    }
    
}
class Animal{
    String name="Lion";
    static int noOfAnimal=0;
    static int typeOfAnimal=0;
    static int totalLegOfAnimal=0;


    Animal(){
        noOfAnimal++;
        typeOfAnimal++;
    }

   

    

}
class Lion extends Animal{
    Lion(){
    String Name= "Lion";
    noOfAnimal++;
    int typeOfAnimal=1;
    int totalLegOfAnimal=4;

    
}
}
class Kangaroo extends Animal{
    Kangaroo(){
        String Name="Kangaroo";
        noOfAnimal++;
        int typeOfAnimal=2;
        int totalLegOfAnimal=2;
    }
}