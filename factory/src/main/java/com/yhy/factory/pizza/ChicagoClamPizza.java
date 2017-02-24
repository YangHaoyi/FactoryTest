package com.yhy.factory.pizza;

import com.yhy.factory.Pizza;

/**
 * Author : YangHaoyi on 2017/2/21.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class ChicagoClamPizza extends Pizza{
    public ChicagoClamPizza() {
        name = "芝加哥风味海鲜披萨";
        dough = "硬面团";
        sauce = "蟹黄酱";
    }

    @Override
    public void cut() {
        System.out.println("把披萨切成方形");
    }
}
