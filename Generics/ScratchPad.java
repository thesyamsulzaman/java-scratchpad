
public class ScratchPad {
  public static void main(String[] args) {

    Creature.Zombie zombie = new Creature.Zombie();
    Creature.Incubate<Creature.Zombie> nemesis = new Creature.Incubate<>(zombie);
    nemesis.start();
    nemesis.run();

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



class Creature<T> {

  public static interface Action {
   void run();
  }

  public static abstract class Human {}

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
