package com.yhy.factory.store;

import com.yhy.factory.Pizza;
import com.yhy.factory.PizzaStore;
import com.yhy.factory.pizza.ChicagoCheesePizza;
import com.yhy.factory.pizza.ChicagoClamPizza;
import com.yhy.factory.pizza.ChicagoVeggiePizza;

/**
 * Author : YangHaoyi on 2017/2/21.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza creatPizza(String type) {
        Pizza pizza;
        switch (type){
            case "cheese":
                pizza = new ChicagoCheesePizza();
                break;
            case "clam":
                pizza = new ChicagoClamPizza();
                break;
            case "veggie":
            default:
                pizza = new ChicagoVeggiePizza();
                break;
        }
        return pizza;
    }
}
