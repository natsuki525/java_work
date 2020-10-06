class Score {
    public static void main(String[] args){
        String[] subjects = {"国語", "数学", "英語", "理科", "社会"};
        int[] score = {70, 88, 85, 90, 70};
        
        int sum = 0;
        for(int i=0; i<score.length; i++){
            sum = sum+score[i];
        }
        double average = (double) sum/score.length;

        System.out.println(subjects[0]+" : "+score[0]);
        System.out.println(subjects[1]+" : "+score[1]);
        System.out.println(subjects[2]+" : "+score[2]);
        System.out.println(subjects[3]+" : "+score[3]);
        System.out.println(subjects[4]+" : "+score[4]);

        System.out.println("***********************");

        System.out.println("合計 : "+sum);
        System.out.println("平均 : "+average);

    }   
}
