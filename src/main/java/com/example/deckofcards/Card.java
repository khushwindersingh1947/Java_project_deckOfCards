package com.example.deckofcards;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Card {

    private String suit, faceName;
    public Card( String faceName,String suit) {
        setSuit(suit);
        setFaceName(faceName);
    }

    public String getSuit() {
        return suit;
    }

    public String getFaceName() {
        return faceName;
    }

    public void setSuit(String suit) {
        suit = suit.toLowerCase();
        if(getValidSuits().contains(suit)){
            this.suit = suit;
        }else{
            throw new IllegalArgumentException(suit + " was not in the valid list"+ getValidSuits());
        }
    }
    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();
        if(getValidFaceNames().contains(faceName)){
            this.faceName = faceName;
        }else{
            throw new IllegalArgumentException(faceName + " was not in the valid list"+ getValidFaceNames());
        }
    }

    public static List<String> getValidSuits(){
        return Arrays.asList("club","hearts","diamonds","spades");
    }
    public static List<String> getValidFaceNames(){
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
    }
    //automatic assignment to class
    public String toString(){
        return String.format("%s of %s", faceName,suit);
    }
    public String getColor(){
        if(suit =="club" || suit == "spades"){
            return "black";
        }else{
            return "red";
        }
    }
    public int getFaceValue(){
        return getValidFaceNames().indexOf(faceName)+2;
    }
}
