public class lab_3 {
    public static void main(String[] args) {
        Animal a[]={new Tiger(), new Deer(), new Camel()};
        
        for(int i=-0; i<5; i++){
            if(a[i] instanceof Transport ){
                ((Transport) a[i]).deliver();
            }
        }
        
    }
    
}
interface Transport{
    void deliver();
}
abstract class Animal{
}



    class Tiger extends Animal{
        public void deliver(){
            System.out.println("Tiger is invoked");
        }

    }
    class Camel extends Animal implements Transport{
        public void deliver(){
            System.out.println("Camel is invoked");
        }
        
        
    }
    class Deer extends Animal implements Transport{
        public void deliver(){
            System.out.println("Deer is invoked");
        }
        
    }
