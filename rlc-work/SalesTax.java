class SalesTax{
    public static void main(String[] args){
        final double CONSUMPTION_TAX = 0.08;
        int price = 10000;
        int taxIncluded = (int) (price + (price * CONSUMPTION_TAX) );
        
        System.out.println("税抜き価格: " + price);
        System.out.println("税込み価格: " + taxIncluded);

    }
}