package com.example;

public class BirdRanks {
    private static Bird[] d;
    private static Bird[] c;
    private static Bird[] b;
    private static Bird[] a;
    private static Bird[] s;

    // Initializes the arraylists and fully fills each one
    public BirdRanks(){
    d= new Bird[15];
    c= new Bird[13];
    b= new Bird[10];
    a= new Bird[7];
    s= new Bird[5];
    Dbirds();
    Cbirds();
    Bbirds();
    Abirds();
    Sbirds();
    }

    // Setter methods that fully fills out each arraylist
    public static void Dbirds(){
        d[0]=new Bird("Domestic Chicken", "D", 50, "Most common bird out there. They are great for cuddles in the war for world domination.");
        d[1]=new Bird("Red-billed Auelea", "D", 49, "They are native to sub-Saharan Africa and are highly adaptable. They are perfect spies.");
        d[2]= new Bird("Mourning Dove", "D", 48, "You can hear their coos early in the morning, hence the name. Great for keeping watch of the base. Though, other birds find their coos annoying.");
        d[3]=new Bird("American Robin", "D", 47, "Known as a Spring bird. Being true Americans, their enemies are the European Robins.");
        d[4]=new Bird("Common Pheasant", "D", 46, "They used to be apart of a noble family in Asia. However, after coming to Europe, they lost their status.");
        d[5]= new Bird("Red-winged Blackbird", "D", 45, "Some say they bring good luck and prosperity, others say they are pests who keeps eating their damn crops.");
        d[6]= new Bird("Blue Jay", "D", 44, "Many feel they are in the shadow of a famous blue jay. Deep inside they harbor hatred for said blue jay and the humans who rose him up to popularity.");
        d[7]= new Bird("Steller's Jay", "D", 43, "Born dancers, they are great distractions. However, they are also very divided. Some want to be renamed to Georg's Jay while others like Whilhelm's Jay.");
        d[8]= new Bird("American Crow", "D", 42, "They don't mind being seen as symbols of death or bad luck. They do mind being seen as greedy. In fact, most crows are minimalists and prefer few furniture in their nests.");
        d[9]= new Bird("European Starling", "D", 41, "Just like thier names, these guys all have an eye for stardom. Most seek out fame in areas of music but some try to be comedians. Most aren't comedians...");
        d[10]= new Bird("Northern MockingBird", "D", 40, "They will not be relegated as a singer for your baby nor will they be replaced by a diamond ring. What is a baby going to do with a diamond ring anyway?");
        d[11]= new Bird("Black-Billed Magpie", "D", 39, "Don't tell anyone, but these guys are the greedy ones. If you tell ANYONE, they will find you.");
        d[12]= new Bird("Rock Dove", "D", 38, "Known as the common pigeon. Only true New Yorkers can appreciate these birds for what they are.");
        d[13]= new Bird("Grey Partridge", "D", 37, "These guys actually like the idea of being Jesus Christ, even if they hate pears.");
        d[14]= new Bird("American Goldfinch", "D", 36, "Generally they mate for life. Deviations can cause whole tv series and movies to be produced, like the famous soap opera: 'America's Goldheart'");
    }

    public static void Cbirds(){
       c[0]= new Bird("Great-Spotted Woodpecker", "C", 35, "They are very protective of their cousins, the lesser spotted woodpecker. If you break one of their hearts, you'll become the next tree these peckers will peck.");
       c[1]= new Bird("Seagull", "C", 34, "People hate them for their gluttonous and kleptomaniac ways, but they are like trolls: they thrive on the attention. Also, common terns would like to say that there is little relation between the two.");
       c[2]= new Bird("Leghorn Chicken", "C", 33, "I say I say, son if you don't finish this project, there's goin' to be heck to pay I say heck I tell ya!");
       c[3]= new Bird("Belted Kingfisher", "C", 32, "Placeholder");
       c[4]= new Bird("Barn Owl", "C", 31, "Placeholder");
       c[5]= new Bird("Heron", "C", 30, "Placeholder");
       c[6]= new Bird("Domestic Turkey", "C", 29, "Placeholder");
       c[7]= new Bird("Common Ostrich", "C", 28, "Placeholder");
       c[8]= new Bird("Cockatiel", "C", 27, "Placeholder");
       c[9]= new Bird("Black Vulture", "C", 26, "Placeholder");
       c[10]= new Bird("Monarch Flycatcher", "C", 25, "Placeholder");
       c[11]= new Bird("Toco Toucan", "C", 24, "Placeholder");
       c[12]= new Bird("Red Kite", "C", 23, "Placeholder");
    }

    public static void Bbirds(){
       b[0]= new Bird("Rhinoceros Hornbill", "B", 22, "Placeholder");
       b[1]= new Bird("Laughing Kookaburra", "B", 21, "Placeholder");
       b[2]= new Bird("Emporer Penguin", "B", 20, "Placeholder");
       b[3]= new Bird("Parotia", "B", 19, "There hasn't been a single person who has seen its dance without being entranced.");
       b[4]= new Bird("Greater Flamingo", "B", 18, "Placeholder");
       b[5]= new Bird("Pekin Duck", "B", 17, "There are whispers that Donald Duck is a pekin duck. While it would be nice for them, pekin ducks do their best to stand out on their own, without having to ride the fame of someone else.");
       b[6]= new Bird("Red-Tailed Hawk", "B", 16, "They're chicken hawks, like Henery Hawk. But unlike Henery, they know what chickens look like. Sometimes.");
       b[7]= new Bird("Violetear Hummingbird", "B", 15, "Smallest birds with the fastest metabolism. Help your neighboring hummingbird by setting out some sugar water for the little champs.");
       b[8]= new Bird("Great-Spotted Kiwi", "B", 14, "A kiwi in the heart is a kiwi in the soul.");
       b[9]= new Bird("Weka", "B", 13, "People mistake them for kiwis but the two are actually very different. DO NOT leave your stuff unguarded around them.");
    }

    public static void Abirds(){
       a[0]= new Bird("Scarlet Macaw", "A", 12, "Super smart, super adorable, and super in personality. They fight for first place with the Blue-and-Yellow Macaw.");
       a[1]= new Bird("Indian peafowl", "A", 11, "Also known as the peacock. They wine and dine like royalty but they actually don't have the best table manners surprisingly.");
       a[2]= new Bird("American Black Duck", "A", 10, "If you look in a mirror and say Daffy Duck three times, you'll become a psychopath. That, or a duck that can't fly and can't swim and has a beak that comes right off.");
       a[3]= new Bird("Emu", "A", 9, "These monsters have already won against Australians in the Great Emu War of 1932. They can do it again.");
       a[4]= new Bird("Takahe", "A", 8, "Cutie patooties that can run and bounce. Just kidding. Don't ever try to bounce them.");
       a[5]= new Bird("African Grey Parrot", "A", 7, "They are incredibly smart and can mimic human speech. However, many birds are captured to be traded as pets which has led to a major decline in population.");
       a[6]= new Bird("Kakapo", "A", 6, "They have a vendetta against hunters for almost becoming extinct because of them. They, along with a few other bird species, have formed an organizations for Critically Endangered Birds Sgainst Hunters(CEBAH).");
    }

    public static void Sbirds(){
    s[0]=new Bird("Puffin", "S", 5, "The only reason they are up so high is because they are the creator's favorite. I mean come on. Just look at them. They are so freaking cute!");
    s[1]= new Bird("Bald Eagle", "S", 4, "An American icon and an endangered success story. It has ran for president once but lost because it was a bird... and bald. It's fine though, they can just go home and lock talons with their mate and death spiral until they're back on their feet.");
    s[2]=new Bird("Peregrene Falcon", "S", 3, "Fastest animal there is it is. A great commander for the skies and a bird of prey so try not to get your eyes plucked.");
    s[3]=new Bird("Dodo", "S", 2, "Many believe this bird became extinct. In reality, it was hiding and plotting this whole time. Though the leader did lose the planning sheet while going to the Bahamas for vacation.");
    s[4]=new Bird("Pheonix", "S", 1, "A legendary bird said to be born from ashes. A true leader and the perfect bird to lead to bird domination. Except it isn't real.");
    }

    // Getters
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