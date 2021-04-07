import java.util.*;

public class Scratchpad {

  public String toString() {
    return "Ini dalam format String";
  }

  public static enum Skill {
    FARMING, KILLSTREAK, ASASSIN, SNEAK
  }

  public static void main(String[] args) {

    // { Collection Interface }
    // { Iterable }
    // { List Interface }
    // { ArrayList }
    // { LinkedList }
    // { Immutable List }
    // { Set Interface }
    // { HashSet }
    // { LinkedHashSet }
    // { EnumSet }
    // { Immutable Set }
    // { SortedSet }
    // { Navigable Set }
    // { Queue Interface }
    
    //Collection<String> humans = new ArrayList<>();

    //humans.add("Syamsul");
    //humans.add("Rick");
    //humans.add("Carl");
    //humans.add("Spencer");

    //humans.remove("Carl");


    //List<String> names = new ArrayList<>();
    //names.add("Sam");
    //names.add("Carl");
    //names.add("Glenn");
    //names.add("Negan");
    //names.set(2, "Exilem");
    //System.out.println(names.get(2));
    //names.remove(3);

    //for (String name : names ) {
      //System.out.println(name);
    //}

    //List<String> dinosaurs = new LinkedList<>();

    
    //Survivor negan = new Survivor("Negan");
    //negan.addWeapon("Lucille");
    //negan.addWeapon("Berreta M92F");

    //receiveWeapon(negan.getWeapons());
    //System.out.println(negan.getWeapons());

    //Set<String> survivors = new LinkedHashSet<>();

    //survivors.add("Michonne");
    //survivors.add("Glenn");
    //survivors.add("Abraham");
    //survivors.add("Abraham");
    //survivors.add("Abraham");

    //for ( String survivor : survivors ) {
      //System.out.println(survivor);
    //}
    
    
     


  }


}

//interface Human<T> {}

//class Zombie<T> implements Human<T> {
  //private T type;

  //Zombie(T type) {
    //setZombie(type);
  //}

  //public T getZombie() {
    //return this.type;
  //}

  //public void setZombie(T type) {
    //this.type = type;
  //}

  //public String toString() {
    //return "Zombie(type="+this.type+")";
  //}

//}

//class Area {

  //private String name;
  //private Zombie<String> zombie;

  //Area(String name) {
    //this.name = name;
    //this.zombie = new Zombie<>("Nemesis");
  //}

  //public Human<String> getZombie() {
    //return this.zombie;
  //}

//}

class Survivor {

  private String name;
  private ArrayList<String> weapons;

  Survivor(String name) {
    this.name = name;
    this.weapons = new ArrayList<>();
  }

  public List<String> getWeapons() {
    return Collections.unmodifiableList(this.weapons);
  }

  public void addWeapon(String weapon) {
    this.weapons.add(weapon);
  }

}

