import model.User;
import service.AuthService;
import service.CategoryService;
import service.OrderService;
import service.ProductService;

import java.util.Objects;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        System.out.println("how many users : ");
        int userLen = scannerInt.nextInt();

        AuthService authService = new AuthService(userLen);

        int stepCode = 1000;
        while (stepCode != 0) {
            System.out.println("1. Register 2. Login 0.Exit");
            stepCode = scannerInt.nextInt();
            User currentUser = null;
            switch (stepCode) {
                case 1 -> {
                    System.out.println("enter name: ");
                    String name = scannerStr.nextLine();

                    System.out.println("enter user name: ");
                    String username = scannerStr.nextLine();

                    System.out.println("enter password: ");
                    String password = scannerStr.nextLine();

                    System.out.println(authService.register(name, username, password));

                }

                case 2 -> {
                    System.out.println("enter user name: ");
                    String username = scannerStr.nextLine();

                    System.out.println("enter password: ");
                    String password = scannerStr.nextLine();

                    currentUser = authService.login(username, password);
                    if (currentUser == null) {
                        System.out.println("siz avval registerdan o'ting");
                    }
                    else {

                        int stepCode1 = 100;
                        while(stepCode1 != 0){
                            System.out.println("1. Add Category 2. Add Product 3. Add Order 4. Order List ");
                            stepCode1 = scannerInt.nextInt();
                            switch (stepCode1){
                                case 1 -> {
                                    System.out.println("enter category Name: ");
                                    String categoryName = scannerStr.nextLine();
                                    System.out.println(CategoryService.addCategory(categoryName));

                                }
                                case 2 -> {

                                    System.out.println("enter product Name: ");
                                    String productName = scannerStr.nextLine();

                                    System.out.println("enter product price: ");
                                    double productPrice = scannerInt.nextDouble();

                                    System.out.println("enter product quantity: ");
                                    int productQuantity = scannerInt.nextInt();

                                    System.out.println("enter product category Name: ");
                                    String categoryName = scannerStr.nextLine();

                                    boolean isAdd = ProductService.addProduct(
                                            productName,
                                            productPrice,
                                            productQuantity,
                                            CategoryService.getCategoryId(categoryName));

                                    System.out.println(isAdd);
                                }
                                case 3 -> {
                                    System.out.println("enter product name: " );
                                    String productName = scannerStr.nextLine();

                                    System.out.println("enter product amount: ");
                                    int quantity = scannerInt.nextInt();

                                    OrderService.addOrder(currentUser, Objects.requireNonNull(ProductService.getProduct(productName)),quantity);
                                }
                                case 4 -> {
                                    OrderService.getOrderListByUser(currentUser);
                                }
                            }
                        }
                    }
                }

            }
        }

    }
}
