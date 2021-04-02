public class Collection {

  public String toString() {
    return "Ini dalam format String";
  }

  public static void main(String[] args) {

    Collection data = new Collection();

    String strA = new String("Hello");
    String strB = new String("Hello");
    System.out.println(strA.equals(strB));

  }

}
