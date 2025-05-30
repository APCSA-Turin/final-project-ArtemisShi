package com.example;

public class Bird {
    private String name;
    private String rank;
    private int num;
    private String desc;

    // Constructor that initializes bird with a name, rank(in this case it specifically means rarity), a number(technically the actual rank), and a description
    public Bird(String n, String r, int nn, String d){
        name=n;
        rank=r;
        num=nn;
        desc=d;
    }

    // Getters
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
