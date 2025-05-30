package com.example;

public class BirdCollection {
    private static Bird[] collect;

    // Initializes the collect arraylist with 50 birds and a description that states the status of each slot
    public BirdCollection(){
        collect= new Bird[50];
        for(int i=0; i<collect.length;i++){
            collect[i]= new Bird("This bird has not yet been collected", "This bird has not yet been collected", i, "This bird has not yet been collected");
        }
    }

    // Setter method used in App.Generator to easily set the birds to their respective placements
    public static void add(Bird b){
        for(int i=0; i<collect.length;i++){
            if(b.getNum()-1==i){
                collect[i]=b;
            }
        }
    }
    
    // Getter
    public Bird[] getCollected(){
        return collect;
    }
}