
// public class Cat extends Animal{
//     private String kind = "猫";

//     public String getKind(String kind){
//         return kind;
//     }
// }

class Cat extends Animal{
    public String getKind(){
      return "猫";
    }

    // セッターはいらないの？
    // 猫に対して犬と上書きできてはいけないので読み取り専用のゲッターだけになっている。
  }
  
