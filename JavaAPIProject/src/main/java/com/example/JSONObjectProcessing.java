package com.example;



import org.json.JSONObject;
//import com.github.oscar0812.pokeapi.utils.*;
//
//import com.github.oscar0812.pokeapi.models.*;
import com.github.oscar0812.pokeapi.models.pokemon.Pokemon;

public class JSONObjectProcessing {
public static void main(String[] args) throws Exception {
Pokemon pokemon = Pokemon.getById(1);
    System.out.println("=== " + pokemon.getName().toUpperCase() + " ===");
    System.out.println("ID: " + pokemon.getId());
    System.out.println("Height: " + pokemon.getHeight());
    System.out.println("Weight: " + pokemon.getWeight());

    System.out.println("\nAbilities:");
    pokemon.getAbilities().forEach(ability ->
            System.out.println("- " + ability.getAbility().getName())
    );
}
}