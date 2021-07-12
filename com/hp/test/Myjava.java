package com.hp.test;

import java.util.ArrayList;
/*
 *输出hello
 */
public class Myjava {
    //main 方法快捷键   psvm
    public static void main(String[] args) {
        System.out.println("输出的快捷键 是 sout");//sout 输出的快捷键
        String name = "王世航";
        System.out.println("name = " + name);//sout 可以显示出  变量
        System.out.println("Myjava.main");//soutm是输出 方法的名称
        System.out.println("args = [" + args + "]");//soutp是输出 方法的名称
        int age = 19;
        if (age<20) {   //if 的快捷键是  ifn
            System.out.println("未成年");
        }
        ArrayList<String> strings = new ArrayList<>();//万能快捷键 alt+enter
        System.out.println("王二航");//Ctrl+d 快速复制一行
        System.out.println("王二航");//alt+鼠标  多行编辑
        System.out.println("王二航");//Ctrl+y  快速删除一行
        //Ctrl+z    一步撤销    //Ctrl+Shift+z  多步撤销
        for (String string : strings) {
            System.out.println("string =" + string);
        }
        // 创建 电脑
        computer c1 = new computer(); // 说命他的 构造方法是  public
        c1.setPrice(5555.0D);
        c1.setColor("黑色");
        c1.setTypeName("机械革命code555");
        System.out.println("c1 = " + c1);  //c1 = com.xiexin.bean.Computer@74a14482 内存
        // 内存地址是否一样 , 是判断对象是否相等的依据
        computer c2 = new computer();
        c2.setPrice(5555.0D);
        c2.setColor("黑色");
        c2.setTypeName("机械革命code555");
        System.out.println("c2 = " + c2);

        // 判断c1 c2 是否相等
        System.out.println(c1 == c2);  // false
        // 以上就是原型模式!! 每次new 都会创建一个新对象
        // 想要  对象每次 new 都唯一怎么办 ?


        // 测试单例模式
        // Phone p1 = new Phone(); // 因为: 无参构造私有化了..
        Phone p1 = Phone.getInstance();
        Phone p2 = Phone.getInstance();
        System.out.println(p1 == p2); // true

    }
}