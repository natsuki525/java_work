import java.io.*;
class Grade {
    public static void main(String[] args) throws IOException{
        System.out.println("テストの点数を入力してください。");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int s = Integer.parseInt(str);

        if(s<=100&&s>=90){
            String grade = "Aランク";
            System.out.println("成績の結果は"+ grade +"です。");
        }else if(s<=89&&s>=70){
            String grade = "Bランク";
            System.out.println("成績の結果は"+ grade +"です。");
        }else if(s<=69&&s>=50){
            String grade = "Cランク";
            System.out.println("成績の結果は"+ grade +"です。");
        }else if(s<=49&&s>=30){
            String grade = "Dランク";
            System.out.println("成績の結果は"+ grade +"です。");
        }else if(s<=29&&s>=0){
            String grade = "Eランク";
            System.out.println("成績の結果は"+ grade +"です。");
        }else if(s>100){
            System.out.println("0~100を入力してください。");
        }


    }    
}
