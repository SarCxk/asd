package com.hp.test;
// 像这样的 只有  私有的属性.和 get, set 方法 叫做实体类.
// 一般一个实体类对应个 一个 数据库表!!
public class computer {
    private double price;
    private String color;
    private String typeName;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "computer{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
