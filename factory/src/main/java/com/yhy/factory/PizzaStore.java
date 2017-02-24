package com.yhy.factory;

/**
 * Author : YangHaoyi on 2017/2/21.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public abstract class PizzaStore {

    public void orderPizza(String type){
        Pizza pizza;
        pizza = creatPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    protected abstract Pizza creatPizza(String type);
}
