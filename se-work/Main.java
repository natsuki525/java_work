class Main{
    public static void main(String[] args){
        if (args.length > 3 || args.length < 3 ) {
            System.out.println("引数は3つ指定してください。");
			System.exit(-1);
        }
        int[] num = new int[3];

        num[0] = Integer.parseInt(args[0]);
        num[1] = Integer.parseInt(args[1]);
        num[2] = Integer.parseInt(args[2]);

        for(int i=2; i>=0; i--){
            System.out.println(num[i]+"");
        }

    }
}