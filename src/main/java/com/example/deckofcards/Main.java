package com.example.deckofcards;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Scanner key = new Scanner(System.in);
        Card aceOfSpades = new Card("spades","ace");
        aceOfSpades.setSuit("hearts");
        System.out.println(aceOfSpades.getSuit());
        System.out.println(aceOfSpades.getFaceName());
        DeckOfCards card = new DeckOfCards();
    }
}
