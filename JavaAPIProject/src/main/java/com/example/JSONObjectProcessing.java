package com.example;

import java.io.FileReader;

/*EASY WAY BUT REQUIRES MAVEN DEPENDENCY.. WE WILL TALK ABOUT MAVEN NEXT PAGE*/
import org.json.JSONObject;

import com.github.oscar0812.pokeapi.models.pokemon.*;
import com.github.oscar0812.pokeapi.models.moves.*;

    //https://pokeapi.co/api/v2/pokemon?offset=151&limit=151
public class JSONObjectProcessing {
public static void main(String[] args) throws Exception {
/*this string is just an example, you would be pulling the json data from a server*/
String jsonString =API.getData("https://pokeapi.co/api/v2/pokemon/1/");
//create the JSON object 
JSONObject obj = new JSONObject(jsonString);
//you can get the value of the key by calling the getString(key) method of JSON Object
String name = obj.getString("name");
String ability = obj.getString("ability");
int level = obj.getInt("level");            
System.out.println(name + " is an " + ability + " type at level " + level);
}
}
