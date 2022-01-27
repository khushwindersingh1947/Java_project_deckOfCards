package com.example.deckofcards;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {
    private ArrayList<Card> deck;
    //constructor to build 52 card objects
    public DeckOfCards(){
        deck = new ArrayList<>();
        for(String suit: Card.getValidSuits()) {
            for (String faceName : Card.getValidFaceNames()) {
                Card newCard = new Card(faceName, suit);
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
    public int countCards(){
        return deck.size();
    }


}
