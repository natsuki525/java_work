public class Answer1 {
    public static void main(String[] args){
        // エラーチェック
        if(args.length != 3){
            System.out.println("引数は3つ指定してください。");
            return;
        }
        // 実行
        System.out.println(args[2]);
        System.out.println(args[1]);
        System.out.println(args[0]);
        // 以下でもOK
        // for(int i=2; i>=0; i--){
        //     System.out.println(args[i]);
        // }
    }
}
