package week5;

//Has a fields name, address, countOfProduct,
//        priceForProduct, shopBalance.
//        define constructors with all possible fields
//        write method checkOrder() which will take as a parameter count of order, and will give a response whether they have such an amount of product or not.
//        if they don’t have that amount of product, response` “Now we don’t have so much product,sorry ”
public class Shop {
    private String name;
    private String address;
    private int countOfProduct;
    private int priceForProduct;
    private int shopBalance;
    private int countOfOrder;

    public Shop(String name, String address, int countOfProduct, int priceForProduct, int shopBalance,int countOfOrder) {
        this.name = name;
        this.address = address;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
        this.shopBalance = shopBalance;
        this.countOfOrder = countOfOrder;
    }
    public int setCountOfOrder(){
        return countOfOrder;
    }
    public int getCountOfOrder(){
        return countOfOrder;
    }

    public String setName() {
        return name;
    }

    public String getName() {
        return name;
    }

    public String setAddress() {
        return address;
    }

    public String getAddress() {
        return address;
    }

    public int setCountOfProduct() {
        return countOfProduct;
    }

    public int getCountOfProduct() {
        return countOfProduct;
    }

    public int setPriceForProduct() {
        return priceForProduct;
    }

    public int getPriceForProduct() {
        return priceForProduct;
    }

    public int setShopBalance() {
        return shopBalance;
    }

    public int getShopBalance() {
        return shopBalance;
    }

    public void checkOrder(int countOfOreder) {
        if (countOfOreder > countOfProduct) {
            System.out.println("Now we don’t have so much product,sorry");
        } else if (countOfOreder < countOfProduct) {
            int orederCost = countOfOreder * priceForProduct;
            if (orederCost > shopBalance) {
                System.out.println("Balance is low");
            }
        }else{
            System.out.println(countOfProduct + " product is available ");
        }
    }

}

