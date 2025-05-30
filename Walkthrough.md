
1. Project Overview - Pokemon Quiz & Bird Gacha Game
You try to guess pokemon based on a limited description(the information is taken from a pokemon api) and when you get it correct, you get points that allow you to try to gacha(a type of gameplay that does basically the same thing as blindboxes) for birds and build up your collection.

2. Code Breakdown
App(String[] args)
- starts up code by calling the gui
generator()
- randomly generates the bird based on probability

API()

Bird(String n, String r, int nn, String d)
- Creates a bird object with a name, rarity, ranking, and a description 
getNum()
-returns the int nn which is the ranking of the bird
getName()
-returns the string name, which is the of the bird
getRarity()
-returns the string r, which is the bird rarity from D, C, B, A, S
-getDesc()
-returns the string d, which is the description of the bird

BirdCollection()
- initializes an arraylist with bird objects
- fills every slot with the text "This bird has not yet been collected"
addBird(Bird b)
-replaces the original "empty" slot of the arraylist that has the same ranking as the parameter's ranking with the new bird taken from the parameter
getCollected()
-getter method

BirdRanks()
-initializes all the static bird arraylists
-fills in every slot with the appropriate bird

    Dbirds()
    -initializes all d type birds
    Cbirds()
    -initializes all c type birds
    Bbirds()
    -initializes all b type birds
    Abirds()
    -initializes all a type birds
    Sbirds()
    -initializes all s type birds

    getDBirds()
    -returns the d arraylist
    getCBirds()
    -returns the c arraylist
    getBBirds()
    -returns the b arraylist
    getABirds()
    -returns the a arraylist
    getSBirds()
    -returns the s arraylist

PokeAPI()
-fetches the pokemon api library

PokemonJSONProcessor()
-Json object processor for specific pokemon information like name, pixel sprite, official image, primary and secondary types, and abilities

getPokemonName()
-returns pokemon name

getPokemonTypes() 
-returns arraylist of pokemon type(s)

getAbilities() 
-returns arraylist of pokemon abilities

getSprite() 
-returns pixel sprite

getOSprite() 
-returns the official drawing

GUI Components
- Uses JFrame and JLabel to display the map image.
- Uses JButton for user input

3. Features Implemented (Rubric Aligned)
✔ Base Project (88%)
 - Uses an external API (Poke API)
 - Uses multiple Java methods and logic
 - Parses JSON response using basic string matching
 - Provides interactive user experience via GUI and dialog
✔Statistics/ Machine Learning/Basic Computation (5%)
✔ GUI (Java Swing) (+2%)
 - JFrame displays the static map image
 - JOptionPane handles input and feedback dialogs
✔ Filter/Sort Data (+2%)
✔ Written Walkthrough
 - This document fulfills the walkthrough requirement
Total = 

4. Output Example

5. What I Learned
- How to connect to an API in Java
- How to parse JSON using a library
- How to use Java Swing for displaying (some) images (I can only figure out how to get images when they have their own link on the web) and handling input(buttons)
-How to figure out exactly what each component does and how a simple mix up of a component can cause a runtime error 