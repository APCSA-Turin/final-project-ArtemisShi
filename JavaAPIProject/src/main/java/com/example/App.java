package com.example;
import org.json.JSONObject;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        
        Question q = new Question("e");
    }


    //exort to zip file to do gui coding

    //Story:  You, Jim Bob, want wolrd domination for birds but you need birds to ally with you
    /*You're given a chicken as your first bird and it advises you that the bird leaders are only willing to support
     * you if you prove that you have extensive bird knowledge.
     * to prove your knowledge, you go to the wise owl who tells you that if you answer his questions he will lend you 
     * his feathers which are basically tokens of knowledge that you can use to summon birds for your army
     * He says he's gotten really into pokemon ever since he got a switch for his birthday so that is what he'll be quizing you on
     * if you get all the birds you reach bird domination
     * 
     * after the cutscenes in the ui you can move between two screens
     * one screen is of the owl asking you whether you want an easy, medium, or hard question
     * he also asks if you need help or information
     * (if you have the time or energy make achievements)
     * the information is that an easy question gives you 3 feathers, a medium question gives you 7 and a hard question gives you 15
     * 
     * the other screen is of the wishing well were you can try to summon a bird
     * you can summon once using one feather or 10 times using 10 feathers
     * the rarity level is: D C B A S
     * D= 40% -> 25
     * C= 30% -> 20
     * B= 20% -> 15
     * A= 9% -> 10
     * s= 1% -> 5
     */

     

     private Bird generator(){
        int pick= (int) (Math.random()*100)+1;
        int ind=0;
        if(pick>41){
           ind= (int) (Math.random()*25);
           BirdCollection.add(BirdRanks.getDBirds()[ind]);
            return BirdRanks.getDBirds()[ind];
        }
        else{
            if(pick>71){
                ind= (int) (Math.random()*20);
                BirdCollection.add(BirdRanks.getCBirds()[ind]);
                return BirdRanks.getCBirds()[ind];
            }
            else{
                if(pick>91){
                ind= (int) (Math.random()*15);
                BirdCollection.add(BirdRanks.getBBirds()[ind]);
                return BirdRanks.getBBirds()[ind];
                }
                else{
                    if(pick>100){
                        ind= (int) (Math.random()*10);
                        BirdCollection.add(BirdRanks.getABirds()[ind]);
                        return BirdRanks.getABirds()[ind];
                    }
                    else{
                        ind= (int) (Math.random()*5);
                        BirdCollection.add(BirdRanks.getSBirds()[ind]);
                        return BirdRanks.getSBirds()[ind];
                    }
                }
            }
        }

     }
    

}
