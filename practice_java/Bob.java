class Bob extends Enemy{
  public Bob(){
    this.winPoint = 5;
    this.losePoint = 2;
    this.name = "ボブ";
  }
  public boolean Battle(){
    boolean result = false;
    while(true){
      int bobNum = this.r.nextInt(3);
      System.out.print("ボブ「じゃーんけーん！」(1:グー 2:チョキ 3:パー)：");
      String line = this.sc.nextLine();
      if(line.equals("1")){
        if(bobNum != 0){
          result = bobNum == 1;
          break;
        }
      }else if(line.equals("2")){
        if(bobNum != 1){
          result = bobNum == 2;
          break;
        }
      }else if(line.equals("3")){
        if(bobNum != 2){
          result = bobNum == 0;
          break;
        }
      }else{
        continue;
      }
      System.out.println("あいこ！！");
    }
    return result;
  }
}
