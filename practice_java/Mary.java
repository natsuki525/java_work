class Mary extends Enemy{
  public Mary(){
    this.winPoint = 3;
    this.losePoint = 9;
    this.name = "���A���[";
  }
  public boolean Battle(){
    boolean result = false;
    int loseNum = this.r.nextInt(5);
    System.out.print("���A���[�u1�`5�̂����A�O��͂P���v(1�`5�����)�F");
    while(true){
      String line = this.sc.nextLine();
      int userNum = 0;
      //���l�`�F�b�N
      try {
    		userNum = Integer.parseInt(line);
        if(userNum >= 1 && userNum <= 5){
          System.out.println("�O���" + String.valueOf(loseNum + 1));
          if(loseNum + 1 != userNum){
            result = true;
          }
          break;
        }
    	} catch (Exception ex) {

    	}
      System.out.print("1�`5�̐��l����͂��Ă��������B�F");
    }
    return result;
  }
}
