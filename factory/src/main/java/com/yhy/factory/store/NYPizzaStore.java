package com.yhy.factory.store;

import com.yhy.factory.Pizza;
import com.yhy.factory.PizzaStore;
import com.yhy.factory.pizza.NYCheesePizza;
import com.yhy.factory.pizza.NYClamPizza;
import com.yhy.factory.pizza.NYVeggiePizza;

/**
 * Author : YangHaoyi on 2017/2/21.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza creatPizza(String type) {
        Pizza pizza;
        switch (type){
            case "cheese":
                pizza = new NYCheesePizza();
                break;
            case "clam":
                pizza = new NYClamPizza();
                break;
            case "veggie":
            default:
                pizza = new NYVeggiePizza();
                break;
        }
        return pizza;
    }
}
