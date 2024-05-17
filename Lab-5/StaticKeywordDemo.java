public class StaticKeywordDemo {

    static int staticValue = 10;

    int instanceValue = 20;

    public static void main(String[] args) {
        StaticKeywordDemo object1 = new StaticKeywordDemo();
        StaticKeywordDemo object2 = new StaticKeywordDemo();

        System.out.println("Question: Can 'this' keyword access static variables of the class?");
        System.out.println("Reason: No, the 'this' keyword refers to the current object instance and cannot access static members shared across all instances. Static variables should be accessed directly using the class name or from static methods.");
        System.out.println("Static value accessed directly: " + staticValue);




        System.out.println("Instance value accessed with this: " + object1.instanceValue);

        // Attempting to access instance variable from static method (will cause an error)
    }

    public static int staticMethod(int staticValue) {
        return staticValue * 2;
    }
}

