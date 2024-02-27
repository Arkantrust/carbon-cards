package dev.arkantrust.cards.model;

public record Card(Suit suit, CardValue value) {

    @Override
    public String toString() {
    
        return "[ " + value + ", " + suit + " ]"
    
    }

}