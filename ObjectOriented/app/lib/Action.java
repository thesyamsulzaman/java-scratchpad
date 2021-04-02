package app.lib;

import app.lib.IsSick;

public interface Action extends IsSick {
  public void run();
  public void walk();

}
