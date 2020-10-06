class Switch_Case {
    public static void main(String[] args){
        if (args.length != 1) {
            System.out.println("性別(MまたはW)を入力して下さい。");
			System.exit(-1);
        }
        int ticket = 0;
        String str ="";

        char c = args[0].charAt(0);

        switch (c){
            case 'm':
            case 'M':
                ticket = 1800;
                str = "男性";
                break;
            case 'w':
            case 'W':
                ticket = 1000;
                str = "女性";
                break;
            default:
                System.out.println("入力エラーです。");
                System.exit(-1);
        }
        System.out.println(str+"の映画料金は"+ticket+"円です。");
    }   

}
