package com.example;

import org.json.JSONArray;
import org.json.JSONObject;

public class PokemonJSONProcessor {
    private static String pokemonName;
    private static String[] pokemonTypes= new String[2];
    private static String[] abilities;
    private static String OSprite; // High quality pokemon image
    private static String sprite; // Very small picture of the pokemon pixel sprite in game
        public PokemonJSONProcessor() throws Exception {
            // Generates a random pokemon
            int place =(int) (Math.random()*1025)+1;
            String jsonString = PokeAPI.getPokemonData(place);

            // Creates the JSON object
            JSONObject pokemon = new JSONObject(jsonString);

            // Gets Pokemon's name
            pokemonName = pokemon.getString("name");

            // Gets types
            JSONArray types = pokemon.getJSONArray("types");
            pokemonTypes[0] = types.getJSONObject(0).getJSONObject("type").getString("name");

            // Checks if secondary type exists
            if (types.length() > 1) {
                pokemonTypes[1] = types.getJSONObject(1).getJSONObject("type").getString("name");
            }

            // Gets all the pokemon abilities
            // Initializes arraylist
            int count=0;
            JSONArray pabilities = pokemon.getJSONArray("abilities");
            for (int i = 0; i < pabilities.length(); i++) {
                count++;
            }
            abilities = new String[count];
            // Adds to arraylist
            for (int i = 0; i < abilities.length; i++) {
                abilities[i] = pabilities.getJSONObject(i).getJSONObject("ability").getString("name");
            }

            // Gets pokemon sprites
            // High quality image
            OSprite = pokemon.getJSONObject("sprites").getJSONObject("other").getJSONObject("official-artwork").getString("front_default");
            // Pixel sprite
            sprite= pokemon.getJSONObject("sprites").getString("front_default");
        }

        // Getters
        public static String getPokemonName() {
            return pokemonName;
        }
        public static String[] getPokemonTypes() {
            return pokemonTypes;
        }
        public static String[] getAbilities() {
            return abilities;
        }
        public static String getSprite() {
            return sprite;
        }
        public static String getOSprite() {
            return OSprite;
        }
    }