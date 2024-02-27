package dev.arkantrust.cards.model;

import java.nio.charset.StandardCharsets;


// https://en.wikipedia.org/wiki/Playing_cards_in_Unicode
public Enum Suit {

    HEARTS("Hearts"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs"),
    SPADES("Spades");

    public Suit(String name) {
    
        this.name = name;

        var s = new String(name, StandardCharsets.UTF_8);
    
    }

    public String getName() {
    
        return name;
    
    }

}
