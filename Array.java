class Array {
    public static void main(String[] args){
        // 3ステップで記述する方法
        // 1.配列宣言
        int [] sales;
        // 2.配列の生成
        sales = new int[3];
        // 3.値の代入
        sales[0] = 1000;
        sales[1] = 1100;
        sales[2] = 1200;

        // 2ステップで記述する方法
        // 1.配列宣言+配列の生成
        String[] month = new String[3];
        // 2.値の代入
        month[0] = "JAN";
        month[1] = "FEB";
        month[2] = "MAR";

        // 1ステップで記述する方法
        String[] quarter = {"第1期", "第2期", "第3期", "第4期"};

        System.out.println(quarter[3]+"の目標売上額(万単位)");
        System.out.println(month[0]+" : "+sales[0]);
        System.out.println(month[1]+" : "+sales[1]);
        System.out.println(month[2]+" : "+sales[2]);
        
        System.out.println("***** 配列の要素数 *****");
        System.out.println("sales :" +sales.length);
        System.out.println("month :" +month.length);
        System.out.println("quarter :" +quarter.length);

    }
}
