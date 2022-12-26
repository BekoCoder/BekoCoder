package service;

import model.Product;

import java.util.Arrays;
import java.util.UUID;

public class ProductService {

    private static  Product[] productList = new Product[100];
    private static int index = 0;


    public static boolean addProduct(
            String name,
            double price,
            int quantity,
            UUID categoryId
    ){
        productList[index ++] = new Product(name,price,quantity,categoryId);
        return true;
    }

    public static Product getProductName(UUID productId){
        for (Product product: productList) {
            if (product != null){
                if (product.getId().equals(productId)){
                    return product;
                }
            }
        }
        return null;
    }

    public static Product getProduct(String name){
        for (Product product: productList) {
            if (product != null){
                if (product.getName().equals(name)){
                    return product;
                }
            }
        }
        return null;
    }

    public static Product[] getProductList() {
        return productList;
    }
    @Override
    public String toString() {
        return "ProductService{" +
                "productList=" + Arrays.toString(productList) +
                '}';
    }
}
