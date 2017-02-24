package com.yhy.factory;

import com.yhy.factory.store.ChicagoPizzaStore;
import com.yhy.factory.store.NYPizzaStore;

public class Main {
    public static void main(String[] arges){
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("clam");
    }
}
