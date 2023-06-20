package home_work_8.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Price[] arrray = new Price[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrray.length; i++) {
            System.out.println("Введіть назву " + (i + 1) + "-го товару:");
            String productName = sc.nextLine();
            System.out.println("Введіть назву " + (i + 1) + "-го магазину, в якому продається товар:");
            String productStoreName = sc.nextLine();
            System.out.println("Введіть вартість " + (i + 1) + "-го товару у гривнях:");
            double productCost = sc.nextDouble();
            sc.nextLine();
            arrray[i] = new Price(productName, productStoreName, productCost);
        }
        Arrays.sort(arrray);
        for (Price price : arrray) {
            System.out.println(price);
        }
        System.out.println("Введіть назву магазину:");
        String productStoreName = sc.nextLine();
        boolean isContains = false;
        for (Price price : arrray) {
            if (price.getProductShopName().equals(productStoreName)){
                isContains = true;
                System.out.println(price.getProductsStoreInfo());
            }
        }
        if (!isContains){
            try {
                throw new StoreNotFoundException("Такий магазин відсутній");
            }catch (StoreNotFoundException ex){
                System.err.println(ex.getMessage());
            }
        }
    }
}
