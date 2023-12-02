package de.frauas.enumcarddeck;
public class Card {

    Values value;
    Suits suit;

    public enum Suits{
        HEART,
        SPADE,
        DIAMOND,
        CLUB;
    }

    public enum Values{
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13),
        ACE(14);


        private Values(int zahl) {};
    }
        
    public static void main (String[] args) {
        
    }

    public Card() {};

    public Card(Suits suit, Values value) {
        this.value = value;
        this.suit = suit;
        System.out.println("Card created: " + this.suit + " " + this.value); 
    }


}
