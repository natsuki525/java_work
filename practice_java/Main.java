import java.util.Random;
class Main{
  public static void main(String args[]){
    // Playerのコンストラクトをよびプレイヤーを生成する
    // ループ
    // 敵をランダムで出現させる
    // ループ終了
    Player p = new Player(); //プレイヤー生成
    Random r = new Random(System.currentTimeMillis()); //実行するたびにms単位でランダム生成している
    while(true){
      p.ShowStatus(); // ステータス
      Enemy e = null;
      // nextInt(3)とすると
      switch(r.nextInt(3)){
        case 0:
          e = new Bob();
        //e = (Enemy)new Bob();　Enemy型にキャストしている。
          break;
        case 1:
          e = new Mary();
          //e = (Enemy)new Mary();　Enemy型にキャストしている。
          break;
        case 2:
          e = new Yamada();
          //e = (Enemy)new Mary();　Enemy型にキャストしている。
          break;
      }
      System.out.println(e.getName() + "が現れた！！");
      if(e.Battle()){
        // 勝利時
        System.out.println(e.getName() + "に勝利！！" + String.valueOf(e.getWinPoint()) + "ポイント獲得！");
        p.Win(e);
      }else{
        // 敗北時
        System.out.println(e.getName() + "に敗北！！" + String.valueOf(e.getLosePoint()) + "ポイント取られた！");
        p.Lose(e);
      }
      // 終了判定
      if(p.getPoint() <= 0){
        break;
      }
    }
    p.ShowStatus();
    System.out.println("ゲームオーバー");
  }
}
