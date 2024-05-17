public class StaticObject {

    public static int count = 0; 

    public StaticObject() {
        count++; 
    }

    public static void main(String[] args) {
        StaticObject obj1 = new StaticObject();
        StaticObject obj2 = new StaticObject();

        System.out.println("Number of objects created: " + count);
    }
}