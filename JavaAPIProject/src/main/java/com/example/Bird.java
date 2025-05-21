package com.example;

public class Bird {
    private String name;
    private String rank;
    private int num;
    private String desc;

    public Bird(String n, String r, int nn, String d){
        name=n;
        rank=r;
        num=nn;
        desc=d;
    }

    public int getNum(){
        return num;
    }
    public String getDesc(){
        return desc;
    }
    public String getName(){
        return name;
    }

    public String getRank(){
        return rank;
    }
}
