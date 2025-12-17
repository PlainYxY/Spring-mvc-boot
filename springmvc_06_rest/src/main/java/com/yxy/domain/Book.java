package com.yxy.domain;

public class Book {
    String  name;
    String price;

    @Override
    public String toString() {
        return "Book{" +
                "书名='" + name + '\'' +
                ", 价格='" + price + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
