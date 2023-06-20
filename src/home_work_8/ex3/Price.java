package home_work_8.ex3;

public class Price implements Comparable<Price>{
    private String productName;
    private String productShopName;
    private double productCost;

    public Price(String shopName, String productShopName, double productCost){
        this.productName = shopName;
        this.productShopName=productShopName;
        this.productCost=productCost;
    }

    public String getProductShopName() {
        return productShopName;
    }

    @Override
    public String toString() {
        return "Назва товару= '" + productName + '\'' +
                ", назва магазину, в якому продається товар= '" + productShopName + '\'' +
                ", вартість товару= " + productCost + " грн.";
    }

    @Override
    public int compareTo(Price price) {
        return this.productShopName.compareTo(price.productShopName);
    }

    public String getProductsStoreInfo(){
        return "Назва товару= '" + productName + '\'' + ", вартість товару= " + productCost + " грн.";
    }

}
