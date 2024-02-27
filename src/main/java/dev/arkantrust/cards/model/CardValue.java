package dev.arkantrust.cards.model;

public Enum CardValue {

    TWO("Two", 2),
    THREE("Three", 3),
    FOUR("Four", 4),
    FIVE("Five", 5),
    SIX("Six", 6),
    SEVEN("Seven", 7),
    EIGHT("Eight", 8),
    NINE("Nine", 9),
    TEN("Ten", 10),
    JACK("Jack", 10),
    QUEEN("Queen", 10),
    KING("King", 10),

    // TODO: Ace can be 1 or 11
    ACE("Ace", 11);

    public CardValue(String name, int value) {
    
        this.name = name;
        this.value = value;
    
    }

    public String getName() {
    
        return name;
    
    }

    public int getValue() {
    
        return value;
    
    }

}
