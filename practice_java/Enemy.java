import java.util.*;
abstract class Enemy{
  public Enemy(){
    r = new Random(System.currentTimeMillis());
    sc = new Scanner(System.in);
  }
  protected Scanner sc;
  protected Random r;
  protected String name;
  protected int winPoint;
  protected int losePoint;
  abstract boolean Battle();
  public int getWinPoint(){
    return this.winPoint;
  }
  public int getLosePoint(){
    return this.losePoint;
  }
  public String getName(){
    return this.name;
  }
}
