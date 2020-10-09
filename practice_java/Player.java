import java.util.*;
class Player{
  private String name;
  private int point;
  private int enemyCount;
  private int winCount;
  public Player(){
    Scanner sc = new Scanner(System.in);
    System.out.print("あなたの名前を入力してください：");
    this.name = sc.nextLine();
    this.point = 10;
    this.enemyCount = 0;
    this.winCount = 0;
  }
  public int getPoint(){
    return this.point;
  }
  public void Win(Enemy e){
    this.point += e.getWinPoint();
    this.enemyCount ++;
    this.winCount ++;
  }
  public void Lose(Enemy e){
    this.point -= e.getLosePoint();
    this.enemyCount ++;
  }
  public void ShowStatus(){
    System.out.println("");
    System.out.println("名前：" + this.name);
    System.out.println("ポイント：" + String.valueOf(this.point));
    System.out.println("勝った数：" + String.valueOf(this.winCount) + " / " + String.valueOf(this.enemyCount));
    System.out.println("");
  }


}
