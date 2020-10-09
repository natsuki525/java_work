
// public class Animal {
//     String myName;
//     String ani;

//     public String getName(){
//         return myName;

//     }
//     public void setName(String name){
//         myName = name;
//     }
// }

abstract class Animal{
    // eclipseだとprivate String nameと打つとゲッターとセッターが自動入力されるものもある
    private String name;
    public String getName(){
      return this.name ;
    }
    public void setName(String name){
      this.name = name;
    }
    // 抽象メソッド　…　具体的な処理を書かなくて済む。(Animalからしてみれば種類が分からないから。)
    abstract public String getKind();
  }