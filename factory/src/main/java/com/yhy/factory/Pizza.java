package com.yhy.factory;

import java.util.ArrayList;

/**
 * Author : YangHaoyi on 2017/2/21.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public abstract class Pizza {
    //披萨名字
    protected String name;
    //面团类型
    protected String dough;
    //酱料
    protected String sauce;
    //佐料
    protected ArrayList toppings = new ArrayList();

    //准备
    public void prepare(){
        System.out.println("准备中..."+name);
        System.out.println("加面团"+dough);
        System.out.println("加酱料"+sauce);
        for(int i = 0;i<toppings.size();i++){
            System.out.println("    "+toppings.get(i));
        }
    }
    //加热
    public void bake(){
        System.out.println("350度加热25分钟");
    }
    //切
    public void cut(){
        System.out.println("把披萨切成圆形");
    }
    //装盒
    public void box(){
        System.out.println("将披萨装盒");
    }
    public String getName(){
        return name;
    }


}
