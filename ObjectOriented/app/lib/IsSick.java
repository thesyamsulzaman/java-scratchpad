package app.lib;

public interface IsSick {
  default boolean isSick() {
    return false;
  }
  //public void cough();
  //public void takeARest();
}
