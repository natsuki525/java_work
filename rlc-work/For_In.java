class For_In {
    public static void main(String[] args){
        if(args.length<2){
            System.out.println("数値を2つ以上入力して下さい。");
            System.exit(-1);
        }
        int total = 0;
        int number = 0;

        for(String str : args){
            number = Integer.parseInt(str);
            total += number;
        }

        System.out.println("******************************");
        System.out.println("入力した数値の合計は : "+total);
        System.out.println("******************************");

        total = 0;
        for(int i=0; (i<args.length)&&(i<5); i++){
            number = Integer.parseInt(args[i]);
            total += number;
        }

        System.out.println("*************************************");
        System.out.println("入力した数値(最大5個)の合計は : "+total);
        System.out.println("*************************************");
    }    
}
