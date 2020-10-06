class Double_Loop {
    public static void main(String[] args){
        if(args.length!=2){
            System.out.println("高さと幅を入力して下さい");
            System.exit(-1);
        }

        int height = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        System.out.println("高さは"+height+"、幅は"+width);

        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                System.out.print("◯");
            }
            System.out.println();
        }
    }    
}
