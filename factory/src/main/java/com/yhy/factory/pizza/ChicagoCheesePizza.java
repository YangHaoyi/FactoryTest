package com.yhy.factory.pizza;

import com.yhy.factory.Pizza;

/**
 * Author : YangHaoyi on 2017/2/21.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class ChicagoCheesePizza extends Pizza{
    public ChicagoCheesePizza() {
        name = "芝加哥风味起司披萨";
        dough = "硬面团";
        sauce = "辣椒酱";
        toppings.add("添加香肠");
    }
}
