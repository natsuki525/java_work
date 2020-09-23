class Cast {
    public static void main(String[] args){
        int price = 10000;
        double discount = 0.2;
        int newPrice = (int) (price * (1 - discount));

        System.out.println("価格は: " + price);
        System.out.println("割引率は: " + discount);
        System.out.println("割引後の価格は: " + newPrice);

    }
}
