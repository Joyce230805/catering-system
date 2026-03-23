package com.example.demo;

import com.example.demo.model.Dish;
import com.example.demo.repository.DishRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(DishRepository repo) {
        return args -> {

            repo.save(new Dish(null, "Fried Rice", "炒饭", "MAIN", 12.0, true));
            repo.save(new Dish(null, "Fried Noodles", "炒面", "MAIN", 12.0, true));
            repo.save(new Dish(null, "Steamed Rice", "白饭", "MAIN", 10.0, true));
            repo.save(new Dish(null, "Half Half", "半半", "MAIN", 13.0, true));

            // 配菜
            repo.save(new Dish(null, "Random", "盲盒", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Braised Pig Feet", "飘香猪蹄", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Fish Flavored Shredded Pork", "鱼香肉丝", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Shredded Pork with Chili", "青椒炒肉丝", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Stir-fried Cucumber with Pork", "小炒脆瓜", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Chicken Gizzards", "酸辣鸡胗", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Pork with Bamboo Shoots", "竹笋炒肉", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Eggplant with Mince", "肉末茄子", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Braised Beef Short Ribs", "红烧牛仔骨", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Sweet and Sour Eggplant", "鱼香茄子", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Spicy Fish", "麻辣鱼", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Black Bean Squid", "豆豉鱿鱼", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Braised Vegetables", "罗汉斋", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Boiled Beef", "水煮牛肉", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Black Pepper Chicken", "黑椒鸡", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Spicy Pork Cheek", "爆香嫩颊肉", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Eggplant Beans", "茄子豆角", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Satay Chicken", "沙爹鸡", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Green Bean", "四季豆", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Tomato Egg", "番茄炒蛋", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Fish Pickles", "酸菜鱼", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Beef Cubes", "黑松露牛粒", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Beef Tripe", "麻辣牛肚", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Beef Tenderloin", "尖椒牛柳", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Honey Chicken", "蜜糖鸡", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Pork Soft Bone", "猪软骨", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Chilli Chicken", "辣子鸡", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Salt Pepper Chicken", "椒盐鸡", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Curry Chicken", "咖喱鸡", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Di San Xian", "地三鲜", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Vegetables", "炒时蔬", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Kung Pao Chicken", "宫保鸡丁", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Mapo Tofu", "麻婆豆腐", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Sweet Sour Pork", "咕噜肉", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Braised Pork", "红烧肉", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Beef Brisket", "番茄土豆牛腩", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Black Bean Beef", "豆豉牛", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Braised Lamb Ribs", "黄焖羊排", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Pork Tripe", "麻辣猪肚", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Black Pepper Beef", "黑椒牛", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Lemon Chicken", "柠檬鸡", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Chinese Cabbage", "清炒白菜", "SIDE", 0.0, true));
            repo.save(new Dish(null, "Garlic Sprouts Pork", "蒜苗炒肉", "SIDE", 0.0, true));
        };
    }
}