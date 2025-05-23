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
    Dbirds();
    Cbirds();
    Bbirds();
    Abirds();
    Sbirds();
   }

   public static void Dbirds(){
    d[0]=new Bird("Domestic Chicken", "D", 75, "Most common bird out there. They are great for cuddles in the war for world domination.");
    d[1]=new Bird("Red-billed quelea", "D", 74, "They are native to sub-Saharan Africa and are highly adaptable. They are perfect spies.");
    d[2]= new Bird("Mourning Dove", "D", 73, "You can hear their coos early in the morning, hence the name. Great for keeping watch of the base. Though, other birds find their coos annoying.");
    d[3]=new Bird("American Robin", "D", 72, "Known as a Spring bird. Being true Americans, their enemies are the European Robins.");
    d[4]=new Bird("Common pheasant", "D", 71, "They used to be apart of a noble family in Asia. However, after coming to Europe, they lost their status.");
    d[5]= new Bird("Red-winged blackbird", "D", 70, "Some say they bring good luck and prosperity, others say they are pests who keeps eating their damn crops.");
    d[6]= new Bird("Blue Jay", "D", 69, "Many feel they are in the shadow of a famous blue jay. Deep inside they harbor hatred for said blue jay and the humans who rose him up to popularity.");
    d[7]= new Bird("Steller's Jay", "D", 68, "Born dancers, they are great distractions. However, they are also very divided. Some want to be renamed to Georg's Jay while others like Whilhelm's Jay.");
       d[8]= new Bird("American Crow", "D", 67, "They don't mind being seen as symbols of death or bad luck. They do mind being seen as greedy. In fact, most crows are minimalists and prefer few furniture in their nests.");
       d[9]= new Bird("European Starling", "D", 66, "Just like thier names, these guys all have an eye for stardom. Most seek out fame in areas of music but some try to be comedians. Most aren't comedians...");
       d[10]= new Bird("Northern MockingBird", "D", 65, "They will not be relegated as a singer for your baby nor will they be replaced by a diamond ring. What the heck is a baby going to do with a diamond ring anyway?!");
       d[11]= new Bird("Black-Billed Magpie", "D", 64, "Don't tell anyone, but these guys are the greedy ones. If you tell ANYONE, they will find you.");
       d[12]= new Bird("Rock Dove", "D", 63, "Known as the common pigeon. Only true New Yorkers can appreciate these birds for what they are.");
       d[13]= new Bird("Partridge", "D", 62, "Placeholder");
       d[14]= new Bird("Placeholder", "D", 61, "Placeholder");
       d[15]= new Bird("Placeholder", "D", 60, "Placeholder");
       d[16]= new Bird("Placeholder", "D", 59, "Placeholder");
       d[17]= new Bird("Placeholder", "D", 58, "Placeholder");
       d[18]= new Bird("Placeholder", "D", 57, "Placeholder");
       d[19]= new Bird("Placeholder", "D", 56, "Placeholder");
       d[20]= new Bird("Placeholder", "D", 55, "Placeholder");
       d[21]= new Bird("Placeholder", "D", 54, "Placeholder");
       d[22]= new Bird("Placeholder", "D", 53, "Placeholder");
       d[23]= new Bird("Placeholder", "D", 52, "Placeholder");
       d[24]= new Bird("Placeholder", "D", 51, "Placeholder");
   }

   public static void Cbirds(){
       c[0]= new Bird("Placeholder", "C", 50, "Placeholder");
       c[1]= new Bird("Placeholder", "C", 49, "Placeholder");
       c[2]= new Bird("Placeholder", "C", 48, "Placeholder");
       c[3]= new Bird("Placeholder", "C", 47, "Placeholder");
       c[4]= new Bird("Placeholder", "C", 46, "Placeholder");
       c[5]= new Bird("Placeholder", "C", 45, "Placeholder");
       c[6]= new Bird("Placeholder", "C", 44, "Placeholder");
       c[7]= new Bird("Placeholder", "C", 43, "Placeholder");
       c[8]= new Bird("Placeholder", "C", 42, "Placeholder");
       c[9]= new Bird("Placeholder", "C", 41, "Placeholder");
       c[10]= new Bird("Placeholder", "C", 40, "Placeholder");
       c[11]= new Bird("Placeholder", "C", 39, "Placeholder");
       c[12]= new Bird("Placeholder", "C", 38, "Placeholder");
       c[13]= new Bird("Placeholder", "C", 37, "Placeholder");
       c[14]= new Bird("Placeholder", "C", 36, "Placeholder");
       c[15]= new Bird("Placeholder", "C", 35, "Placeholder");
       c[16]= new Bird("Placeholder", "C", 34, "Placeholder");
       c[17]= new Bird("Placeholder", "C", 33, "Placeholder");
       c[18]= new Bird("Placeholder", "C", 32, "Placeholder");
       c[19]= new Bird("Placeholder", "C", 31, "Placeholder");
   }

   public static void Bbirds(){
       b[0]= new Bird("Placeholder", "B", 30, "Placeholder");
       b[1]= new Bird("Placeholder", "B", 29, "Placeholder");
       b[2]= new Bird("Placeholder", "B", 28, "Placeholder");
       b[3]= new Bird("Placeholder", "B", 27, "Placeholder");
       b[4]= new Bird("Placeholder", "B", 26, "Placeholder");
       b[5]= new Bird("Placeholder", "B", 25, "Placeholder");
       b[6]= new Bird("Placeholder", "B", 24, "Placeholder");
       b[7]= new Bird("Placeholder", "B", 23, "Placeholder");
       b[8]= new Bird("Placeholder", "B", 22, "Placeholder");
       b[9]= new Bird("Placeholder", "B", 21, "Placeholder");
       b[10]= new Bird("Placeholder", "B", 20, "Placeholder");
       b[11]= new Bird("Placeholder", "B", 19, "Placeholder");
       b[12]= new Bird("Placeholder", "B", 18, "Placeholder");
       b[13]= new Bird("Placeholder", "B", 17, "Placeholder");
       b[14]= new Bird("Placeholder", "B", 16, "Placeholder");
   }

   public static void Abirds(){
// penguin, flamingo, peacock, red tailed hawk, humming bird,  , cockatoo, 
//kookaburra, , owl,, kiwi, cassowary, weka, ostrich, , pekin duck(donald duck possibly)
//cockatail, turkey, , partrige, quail, hawks, kites, wood pecker, toucan, macaw

       a[0]= new Bird("Placeholder", "A", 15, "Placeholder");
       a[1]= new Bird("Placeholder", "A", 14, "Placeholder");
       a[2]= new Bird("Placeholder", "A", 13, "Placeholder");
       a[3]= new Bird("Placeholder", "A", 12, "Placeholder");
       a[4]= new Bird("Placeholder", "A", 11, "Placeholder");
       a[5]= new Bird("American Black Duck", "A", 10, "Placeholder");
       a[6]= new Bird("Emu", "A", 9, "These monsters have already won against Australians in the Great Emu War of 1932. They can do it again.");
       a[7]= new Bird("Takahe", "A", 8, "Placeholder");
       a[8]= new Bird("African Grey Parrot", "A", 7, "Placeholder");
       a[9]= new Bird("Kakapo", "A", 6, "Placeholder");
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