class Season {
    public static void main(String[] args){
        if(args.length != 1){
            System.out.println("月を入力して下さい。");
            System.exit(-1);
        }

        String season = null;
        
        switch(args[0]){
            case "3":
            case "4":
            case "5":
                season = "春";
                break;
            case "6":
            case "7":
            case "8":
                season = "夏";
                break;
            case "9":
            case "10":
            case "11":
                season = "秋";
                break;
            case "12":
            case "1":
            case "2":
                season = "冬";
                break;
            
        }
        if(season != null){
            System.out.println(args[0]+"月は"+season+"です。");
        }else{
            System.out.println("1〜12を入力して下さい。");
        }

    }    
}
