package com.example.deckofcards;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
//        Scanner key = new Scanner(System.in);
//        Card aceOfSpades = new Card("spades","ace");
//        aceOfSpades.setSuit("hearts");
//        System.out.println(aceOfSpades.getSuit());
//        System.out.println(aceOfSpades.getFaceName());

        ArrayList<Card> hand1 = new ArrayList<>();
        ArrayList<Card> hand2 = new ArrayList<>();
        ArrayList<Card> hand3 = new ArrayList<>();
        ArrayList<Card> hand4 = new ArrayList<>();
        DeckOfCards cards = new DeckOfCards();
        cards.shuffle();
        System.out.println(cards.countCards());
        for(int i=0;i<13;i++){
            hand1.add(cards.dealTopCard());
            hand2.add(cards.dealTopCard());
            hand3.add(cards.dealTopCard());
            hand4.add(cards.dealTopCard());
        }
        System.out.println(cards.countCards());
        print(hand1,1);
        print(hand2,2);
        print(hand3,3);
        print(hand4,4);
    }
    public static void print(ArrayList<Card> lists,int person){
        for (Card list: lists){
            System.out.println("Person "+person + " card: "+list +" color: " + list.getColor() + " value:" + list.getFaceValue());
        }
    }
}
