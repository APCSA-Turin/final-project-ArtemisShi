package com.example;
import com.github.oscar0812.pokeapi.models.pokemon.Pokemon;
import org.json.JSONObject;

import java.io.IOException;


public class App
{
    public static void main( String[] args ) throws Exception
    {
        SimpleGUI gui = new SimpleGUI(); // Initializes Gui
        // Gui output
        System.out.println(gui);
    }

     
        /*
        *Method that allows the summoning/gacha part of program to work
        *First, a random number is generated from 1-100 to know what rarity of bird you will get based on this info
        *the rarity level is: D C B A S
        *
        * D= 40% -> 15 birds
        * C= 30% -> 13 birds
        * B= 20% -> 10 birds
        * A= 9% -> 7 birds
        * S= 1% -> 5 birds
        */
     public static String generator(){
        int pick= (int) (Math.random()*100)+1;
        int ind=0;
        if(pick<41){
            // After the rarity is picked, then there is another random number generator to pick out what bird of that rarity will be given
           ind= (int) (Math.random()*15); // There are 15 D rarity birds
           BirdCollection.add(BirdRanks.getDBirds()[ind]); // BirdRanks have already been initialized with all bird types; the collection you have will have your empty slot be replaced with the bird you got
            // Basic message for when you get a bird
           return "You got "+ BirdRanks.getDBirds()[ind].getName()+"\nRank: "+BirdRanks.getDBirds()[ind].getRank()+"\nDescription: "+BirdRanks.getDBirds()[ind].getDesc();
        }
        else{
            if(pick<71){
                ind= (int) (Math.random()*13);
                BirdCollection.add(BirdRanks.getCBirds()[ind]);
                return "You got "+ BirdRanks.getCBirds()[ind].getName()+"\nRank: "+BirdRanks.getCBirds()[ind].getRank()+"\nDescription: "+BirdRanks.getCBirds()[ind].getDesc();
        }
            else{
                if(pick<91){
                ind= (int) (Math.random()*10);
                BirdCollection.add(BirdRanks.getBBirds()[ind]);
                    return "You got "+ BirdRanks.getBBirds()[ind].getName()+"\nRank: "+BirdRanks.getBBirds()[ind].getRank()+"\nDescription: "+BirdRanks.getBBirds()[ind].getDesc();
                }
                else{
                    if(pick<100){
                        ind= (int) (Math.random()*7);
                        BirdCollection.add(BirdRanks.getABirds()[ind]);
                        return "You got "+ BirdRanks.getABirds()[ind].getName()+"\nRank: "+BirdRanks.getABirds()[ind].getRank()+"\nDescription: "+BirdRanks.getABirds()[ind].getDesc();
                    }
                    else{
                        ind= (int) (Math.random()*4);
                        BirdCollection.add(BirdRanks.getSBirds()[ind]);
                        return "You got "+ BirdRanks.getSBirds()[ind].getName()+"\nRank: "+BirdRanks.getSBirds()[ind].getRank()+"\nDescription: "+BirdRanks.getSBirds()[ind].getDesc();
                    }
                }
            }
        }

     }
    

}