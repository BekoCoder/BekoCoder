package service;

import model.Category;

import java.util.Arrays;
import java.util.UUID;

public class CategoryService {
    private static Category[] categoryList = new Category[100];
    private static int index = 0;

    public static boolean addCategory(
            String name
    ){
        categoryList[index ++] = new Category(name);
        return true;
    }

    public static UUID getCategoryId(String name){
        for (Category category: categoryList) {
            if (category != null){
                if (category.getName().equals(name)){
                    return category.getId();
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "CategoryService{" +
                "categoryList=" + Arrays.toString(categoryList) +
                '}';
    }
}
