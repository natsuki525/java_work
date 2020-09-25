import java.io.*;

class If_ElseIf_Else {
    public static void main(String[] args) throws IOException{
        System.out.println("お買い上げ金額を入力してください。");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int price = Integer.parseInt(str);

        if(price>=3000){
            System.out.println(price+"円のお買い上げです。");
            System.out.println("駐車料金は0円です。");
        }else if(price>=2000){
            System.out.println(price+"円のお買い上げです。");
            System.out.println("駐車料金は100円です。");
        }else if(price>=1000){
            System.out.println(price+"円のお買い上げです。");
            System.out.println("駐車料金は200円です。");
        }else{
            System.out.println(price+"円のお買い上げです。");
            System.out.println("駐車料金は300円です。");
        }
    }
}
