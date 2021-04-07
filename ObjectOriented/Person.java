import app.core.Human; 
import app.helpers.Gender; 
import app.utils.Validator;

import app.helpers.NotBlank;


public class Person extends Human {

  @NotBlank
  String first_name;

  @NotBlank
  String last_name;

  Gender gender;

  public class PhysicalAppearance {
    int height;
    float weight;

    PhysicalAppearance(int height,float weight) {
      this.height = height;
      this.weight = weight;
    }

    public void getInfo() {
      System.out.println("Im" + " " + Person.this.first_name + " " + "And im "+ this.height + "cm");
    }
  }

  void setFirstName(String first_name) {
    this.first_name = first_name;
  }

  String getFirstName() {
    return this.first_name;
  }

  void setLastName(String last_name) {
    this.last_name = last_name;
  }

  void parentMethod() {
    System.out.println("Hello Parent");
  }

  void printFullName() {
    System.out.println(this.first_name + " " + this.last_name);
  }

  public static void main(String[] args) {

    Person sam = new Person();

    sam.setEnergy(100);
    sam.setFirstName(null);
    sam.setLastName(null);
    sam.gender = Gender.MALE;
    Validator.validate(sam);

    //try {
    //} catch ( Throwable err ){
      //System.out.println("Error anjir");
    //} finally {
      //System.out.println("Koneksi terputus");
    //}

    //} catch(ValidationException | NullPointerException err) {
      //System.out.println(err.getMessage());
    //} 


    //Kraton.PhysicalAppearance samInfo = sam.new PhysicalAppearance(170, 50);
    //samInfo.getInfo();

    //sam.printFullName();
    //sam.printOriginFullName();
    //sam.run();
    //System.out.println(sam.getEnergy());
    //System.out.println(sam.isAlive());
    //System.out.println( sam instanceof Kraton );
  }

}

class Kraton extends Person {

  Kraton() {
    super();
  }

  void setFirstName(String first_name) {
    this.first_name = first_name;
  }

  void printFullName() {
    System.out.println("Raden " + this.first_name + " " + this.last_name);
  }

  void printOriginFullName() {
    System.out.println(super.first_name + " " + super.last_name);
  }


}
