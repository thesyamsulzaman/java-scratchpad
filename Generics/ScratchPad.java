import java.util.Arrays;
import java.util.Comparator;

public class ScratchPad {
  public static void main(String[] args) {


    Dinosaur[] jurrasic = {
       new Dinosaur("Tyranosaurs Rex", "Carnivore"),
       new Dinosaur("Alosaur", "Carnivore"),
       new Dinosaur("Parasaulopus", "Carnivore"),
       new Dinosaur("Ptyrodactile", "Carnivore"),
    };

    //Arrays.sort(jurrasic);

    //System.out.println(Arrays.toString(jurrasic));

    //Creature.Zombie zombie = new Creature.Zombie();
    //Creature.Mutan mutan = new Creature.Mutan();

    //Creature.Incubate<Creature.Zombie> nemesis = new Creature.Incubate<>(zombie);
    //nemesis.start();
    //nemesis.run();
    //nemesis.getEnergy();

    //Product<String, Integer> burger = new Product<>("Mac n Cheese", 2);
    //System.out.println(burger.getInfo());
    //burger.setData("Double Mac");
    //System.out.println(Util.process(burger));
    //System.out.println(burger.getInfo());

    //Integer[] menuInteger = { 1,2,3 };
    //String[] menuString = { "Burger", "Karedok", "Pecel" };
    //System.out.println(Util.<String>count(menuString));


  }
}

class Dinosaur implements Comparable<Dinosaur> {
  
  private String name;
  private String type;

  Dinosaur(String name, String type) {
    this.name = name;
    this.type = type;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getInfo() {
    return this.name + " - " + this.type;
  }

  @Override 
  public int compareTo(Dinosaur dinosaur) {
    return this.name.compareTo(dinosaur.name);
  }

  public String toString() {
    return "\n Dinosaur { name=" + this.name + ", type="+ this.type + " } \n";
  }


}



class Creature<T> {

  public static interface Action {
   void run();
  }

  public static abstract class Human {
    private int energy;

    Human() {
      this.energy = 100;
    }

    public void getEnergy() {
      System.out.println(this.energy);
    }
  }

  public static class Mutan extends Human implements Action {
    public void run() { 
      System.out.println("Ill avenge you hooman"); 
    }
  }

  public static class Zombie extends Human implements Action {
    public void run() { 
      System.out.println("Brains"); 
    }
  }

  public static class Incubate<T extends Human & Action> {

    private T creature;

    Incubate(T data) {
      this.creature = data;
    }

    //public void getInfo(T ) {}

    public void start() {
      System.out.println("Processing"); 
    }

    public void run() {
      this.creature.run(); 
    }

    public void getEnergy() {
      this.creature.getEnergy();
    }
  }

  public static void main(String[] args) {}


}

class Util {
  public static String getWow() {
    return "Wow";
  }

  public static <T> int count(T[] data) {
    return data.length;
  }

  //public static String process(Product<? super String, ? super String> param) {
    //return "Contravariant Happened";
  //}

  //public static String process(Product<? extends Object, ? extends Object> param) {
    //return "Covariant Happened";
  //}

  //public static String process(Product<Object, Object> param) {
    //return "InCovariant Happened";
  //}
}

class Product<T extends String, U extends Integer> {

  private T name;
  private U quantity;

  Product(T data, U quantity) {
    this.name = data;
    this.quantity = quantity;
  }

  public static <T> int count(T[] menu ) {
    return menu.length;
  }

  public String getInfo() {
    return this.name + " - " + this.quantity; 
  }

  public U getQuantity() {
    return this.quantity;
  }

  public T getName() {
    return this.name;
  }

  public void setData(T data) {
    this.name = data;
  }

}
