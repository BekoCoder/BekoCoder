package service;

import model.Order;
import model.Product;
import model.User;

import static service.ProductService.*;

public class OrderService {
    private static final Order[] orderList = new Order[100];
    private static int index = 0;


    public static boolean addOrder(User user, Product product, int quantity){
        for (Product product1: getProductList()) {
            if(product1 !=null){
            }
        }
        orderList[index ++] = new Order(product.getId(),user.getId(),quantity);
        return true;
    }

    public static void getOrderListByUser(User user){
        for (Order order: orderList) {
            if (order != null) {
                if (user.getId().equals(order.getUserId())){
                    print(order,user);
                }
            }
        }
    }

    private static void print(Order order, User user){
        Product product = getProductName(order.getProductId());
        System.out.println("user    : " + user.getName());
        System.out.println("product : " + product.getName());
        System.out.println("quantity: " + order.getQuantity());
        System.out.println("sum:    :" + product.getPrice() * order.getQuantity());
    }
}

