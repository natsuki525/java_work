import java.util.*;
class PersonList{
  private ArrayList<Person> personList ;
  public PersonList(){
    personList = new ArrayList<Person>();
  }
  public Person getPerson(int index){
    return personList.get(index);
  }
  public void addPerson(Person p){
    personList.add(p);
  }
  public void removePerson(Person p){
    personList.remove(p);
  }
  public void removePerson(int index){
    personList.remove(index);
  }
  public void showList(){
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    System.out.println("個人情報リスト");
    double sum = 0;
    int num = 1;
    System.out.println("番号\t姓名\t年齢\t入力日時");
    for(Person p : personList){
      sum += (double)p.getAge();
      System.out.println(String.valueOf(num) + "\t" + p.getName() + "\t" + String.valueOf(p.getAge()) + "\t" + p.getInputTime());
      num ++;
    }
    if(personList.size() > 0){
      double avg = sum / (double)personList.size();
      //formatではたまたま四捨五入されるだけなので、System.Mathを使っても正解
      System.out.println("平均年齢：" + String.format("%.1f", avg));
    }
  }
  public int size(){
    return personList.size();
  }
  //もし必要があれば他にもメソッドやメンバ変数を追加する。

}
