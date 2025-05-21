package com.example;

public class BirdRanks {
    private static Bird[] d;
   private static Bird[] c;
   private static Bird[] b;
   private static Bird[] a;
   private static Bird[] s;

   public BirdRanks(){
    d= new Bird[25];
    c= new Bird[20];
    b= new Bird[15];
    a= new Bird[10];
    s= new Bird[5];
   }

   public static void Dbirds(){
    d[0]=new Bird("Domestic Chicken", "D", 75, "Most common bird out there. They are great for cuddles in the war for world domination.");
    d[1]=new Bird("Red-billed quelea", "D", 74, "They are native to sub-Saharan Africa and are highly adaptable. They are perfect spies.");
    d[2]= new Bird("Mourning Dove", "D", 73, "You can hear their coos early in the morning, hence the name. Great for keeping watch of the base.");
    d[3]=new Bird("American Robin", "D", 72, "Known as a Spring bird. Being true Americans, their enemies are the European Robins.");
    d[4]=new Bird("Common pheasant", "D", 71, "SA");
    d[5]= new Bird("Red winged blackbird", "D", 70, "SAD");
   }

   public static void Cbirds(){

   }

   public static void Bbirds(){

   }

   public static void Abirds(){
// penguin, flamingo, peacock, red tailed hawk, kakapo, humming bird, grey african parrot, emu, cockatoo, 
//kookaburra, magpie, owl, american black duck(daffy duck), kiwi, cassowary, weka, ostrich, takahe, pekin duck(donald duck possibly)
//cockatail, turkey, pigeon, partrige, quail, hawks, kites, wood pecker, blue jay, toucan, macaw
   }

   public static void Sbirds(){
    s[0]=new Bird("Puffin", "S", 5, "The only reason they are up so high is because they are the creator's favorite. I mean come on. Just look at them.");
    s[1]= new Bird("Bald Eagle", "S", 4, "An American icon and an endangered success story. It has ran for president once but lost because it was a bird... and bald.");
    s[2]=new Bird("Peregrene Falcon", "S", 3, "Fastest animal there is it is. A great commander for the skies and a bird of prey so try not to get your eyes plucked.");
    s[3]=new Bird("Dodo", "S", 2, "Many believe this bird became extinct. In reality, it was hiding and plotting this whole time.");
    s[4]=new Bird("Pheonix", "S", 1, "A legendary bird said to be born from ashes. A true leader and the perfect bird to lead to bird domination.");
   }

   public static Bird[] getDBirds(){
    return d;
   }

   public static Bird[] getCBirds(){
    return c;
   }

   public static Bird[] getBBirds(){
    return b;
   }

   public static Bird[] getABirds(){
    return a;
   }

   public static Bird[] getSBirds(){
    return s;
   }
}
