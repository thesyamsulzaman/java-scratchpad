package app.core;

import app.lib.Action;
import app.helpers.Gifted;

@Gifted(name = "Human", types = { "Cry", "Fighting Trump" })
public class Human implements Action{
  private int energy;

  public final void run() {
    setEnergy(this.energy - 20);
    System.out.println("Holy shit, what was that");
  }

  public final void walk() {
    setEnergy(this.energy - 5);
    System.out.println("Lets walk as we take breath");
  }

  public int getEnergy() {
    return this.energy;
  }

  public final void setEnergy(int newEnergy) {
    this.energy = newEnergy;
  }

  public final boolean isAlive() {
    return ( this.energy >= 10 );
  }

  public static void main(String[] args) {}
}
