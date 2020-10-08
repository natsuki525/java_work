import java.io.*;
import java.util.ArrayList;
class Question2{
    public static void main(String[] args) throws IOException{
        ArrayList<String> names = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        do{
            System.out.print("入力してください(name,list or end):");
            String str = br.readLine();
            if(str.equals("end")){
                // endが入力されたので繰り返し抜ける。
                System.out.println("終了します。");
                break;
            }
            if(names.size()==10){
                System.out.println("名前の入力は10人までです。");
            }
            if(!(str.equals("list")) && names.size() != 10){
                // list以外が入力されたのでnamesに値を格納
                for(int i=0; i<10; i++){
                    names.add(str);
                    break;
                }
                System.out.println("登録します。");  
            }
            if(str.equals("list")){
                // listと入力されたので配列namesの値を取得して出力
                for(int j=0; j<names.size(); j++) {
                    System.out.println(names.get(j));
                }
            }
        }while(true);
        

    }   
}