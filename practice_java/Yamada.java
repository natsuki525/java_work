class Yamada extends Enemy{
  public Yamada(){
    this.winPoint = 0;
    this.losePoint = 25;
    this.name = "山田";
  }
  public boolean Battle(){
    System.out.print("山田はルールを無視して殴りかかってきた！！");
    this.sc.nextLine();
    return false;
  }
}
