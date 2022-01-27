package com.example.deckofcards;

import java.util.Arrays;
import java.util.List;

public class Card {

    private String suit, faceName;
    public Card(String suit, String faceName) {
        this.suit = suit;
        this.faceName = faceName;
    }

    public String getSuit() {
        return suit;
    }

    public String getFaceName() {
        return faceName;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }
    public static List<String> getValidSuits(){
        return Arrays.asList("Club","hearts","diamonds","spades");
    }
}
