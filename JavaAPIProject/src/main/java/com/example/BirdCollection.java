package com.example;

public class BirdCollection {
    private static Bird[] collect;

    public BirdCollection(){
        collect= new Bird[75];
        for(int i=0; i<collect.length;i++){
            collect[i]= new Bird("This bird has not yet been collected", "This bird has not yet been collected", i, "This bird has not yet been collected");
        }
    }
    public static void add(Bird b){
        for(int i=0; i<collect.length;i++){
            if(b.getNum()-1==i){
                collect[i]=b;
            }
        }
    }
}