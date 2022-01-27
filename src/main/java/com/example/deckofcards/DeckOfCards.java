package com.example.deckofcards;

import java.util.ArrayList;

public class DeckOfCards {
    private ArrayList<Card> deck;

    //constructor to build 52 card objects
    public DeckOfCards(){

        for(String suit: Card.getValidSuits()) {
            for (String faceName : Card.getValidFaceNames()) {
//                String name = faceName + "Of" + suit;
                Card  newCard = new Card(suit, faceName);
                deck.add(newCard);
            }
        }

//        deck = new ArrayList<>();
//        deck.add(new Card("spades",))
    }

}
