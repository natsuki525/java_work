class Mary extends Enemy{
  public Mary(){
    this.winPoint = 3;
    this.losePoint = 9;
    this.name = "メアリー";
  }
  public boolean Battle(){
    boolean result = false;
    int loseNum = this.r.nextInt(5);
    System.out.print("メアリー「1～5のうち、外れは１つわよ」(1～5を入力)：");
    while(true){
      String line = this.sc.nextLine();
      int userNum = 0;
      //数値チェック
      try {
    		userNum = Integer.parseInt(line);
        if(userNum >= 1 && userNum <= 5){
          System.out.println("外れは" + String.valueOf(loseNum + 1));
          if(loseNum + 1 != userNum){
            result = true;
          }
          break;
        }
    	} catch (Exception ex) {

    	}
      System.out.print("1～5の数値を入力してください。：");
    }
    return result;
  }
}
