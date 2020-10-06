import java.io.*;
class ScoreArgs {
    public static void main(String[] args) throws IOException{
        String[] subject = {"国語", "数学", "英語", "理科", "社会"};
        System.out.println("国語、数学、英語、理科、社会の点数を入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] score = new int[subject.length];
        for(int i=0; i<subject.length; i++){
            String str = br.readLine();
            int test = Integer.parseInt(str);
            score[i] = test;
        }

        int sum = 0;
        for(int i=0; i<score.length; i++){
            sum = sum+score[i];
        }

        double average = (double) sum/score.length;


        System.out.println(subject[0]+" : "+score[0]);
        System.out.println(subject[1]+" : "+score[1]);
        System.out.println(subject[2]+" : "+score[2]);
        System.out.println(subject[3]+" : "+score[3]);
        System.out.println(subject[4]+" : "+score[4]);

        System.out.println("***********************");

        System.out.println("合計 : "+sum);
        System.out.println("平均 : "+average);

        
    }   

}
