package com.example.deckofcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
    }

    //method to shuffle cards
    public void shuffle(){
        Collections.shuffle(deck);
    }

    //returns null if no cards are left
    public Card dealTopCard(){
        if(deck.size()> 0) {
            return deck.remove(0);
        }else{
            return null;
        }
    }
}
