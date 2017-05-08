package com.example.liemnguyen.finalproject.model;

/**
 * Created by Liêm Nguyễn on 5/8/2017.
 */

public class monan {
    private int avt;
    private String name;
    private int price;
    private boolean check;

    public monan(int avt, String name, int price, boolean check) {
        this.avt = avt;
        this.name = name;
        this.price = price;
        this.check = check;
    }

    public monan(String name, int price, boolean check) {
        this.name = name;
        this.price = price;
        this.check = check;
    }

    public int getAvt() {
        return avt;
    }

    public void setAvt(int avt) {
        this.avt = avt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
