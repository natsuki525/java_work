import java.util.Scanner;
import java.util.ArrayList;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 動物のArrayListを作ってる？
    ArrayList<Animal> list = new ArrayList<Animal>();
    // ループの数は動物リストが3以外の時＝3まで
    while(list.size() != 3){
      Animal ani = null;
      System.out.print("種類を指定してください(1:猫 2:鳥)：");
      String kind = sc.nextLine();
      if(kind.equals("1")){
        // 型変換(キャスト)を行っている。
        // Cat型→Animal型
        // 型変換ができるということはAnimalは親クラスなんだということが分かる
        ani = (Animal)new Cat();
      }else if(kind.equals("2")){
        ani = (Animal)new Bird();
      }else{
        // 種類のエラー
        System.out.println("入力エラーです。");
        System.out.println("プログラムを終了します。");
        System.exit(0);
      }
      System.out.print("名前を入力してください：");
      String name = sc.nextLine();
      if(name.isEmpty()){
        // 名前のエラー
        System.out.println("入力エラーです。");
        System.out.println("プログラムを終了します。");
        System.exit(0);
      }
      ani.setName(name);
      list.add(ani);
    } // 入力ループの終わり
    for(Animal ani :list){
      System.out.println(ani.getName() + "は" + ani.getKind() + "です。");
    }
    System.out.println("プログラムを終了します。");
  }
  
}
