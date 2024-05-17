
abstract class Vegetable {
     String color;
  
    public Vegetable(String color) {
      this.color = color;
    }
  
    
  }
  
  class Potato extends Vegetable {
    public Potato(String color) {
      super(color);
    }
  }
  
  class Brinjal extends Vegetable {
    public Brinjal(String color) {
      super(color);
    }
  }
  
  class Tomato extends Vegetable {
    public Tomato(String color) {
      super(color);
    }
  }
  
  public class Lab_1 {
    public static void main(String[] args) {
      Vegetable potato = new Potato("Brown");
      Vegetable brinjal = new Brinjal("Purple");
      Vegetable tomato = new Tomato("Red");
  
      System.out.println(potato);
      System.out.println(brinjal);
      System.out.println(tomato);
    }
  }
  