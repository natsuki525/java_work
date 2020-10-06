class While_Loop {
    public static void main(String[] args){
        int total = 0;

        // カウント変数の初期化
        int i = 1;

        // 1〜100まで加算する。
        while(i<=100){
            total += i;
            i++; //カウント変数のインクリメント
        }

        System.out.println("1〜100までの合計は"+total+"です。");
    }    
}
