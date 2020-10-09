import java.util.Scanner;
class Answer2{
  public static void main(String[] args){
    // ループ
    // while(***){
      // ループから出る（終了）
      // if(***){}
      // リスト表示
      // if(***){}
      // エラーチェック
      // if(***){}
      // 正常な処理（名前の追加）
    // ループの終わり
    Scanner sc = new Scanner(System.in);
    int i = 0;
    // ArrayListでもOK
    String[] names = new String[10];
    // ループ
    while(true){
      // 入力待ち
      System.out.print("入力してください(name,list or end):");
      String inputStr = sc.nextLine();
      if(inputStr.equals("end")){
        // 終了
        break;
      }else if(inputStr.equals("list")){
        // リスト表示
        for(int inum = 0;inum < 10;inum ++){
          if(names[inum] != null && !names[inum].isEmpty()){
            System.out.println(names[inum]);
          }
        }
      }else{
        // 名前処理
        if(i >= 10){
          // 10人を超えたとき
          System.out.println("名前の入力は10人までです。");
        }else{
          names[i] = inputStr;
          i++;
        }
      }
    }
    }
}