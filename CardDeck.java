package de.frauas.enumcarddeck;
public class CardDeck extends Card{

    public static final Card[] createCardDeck() {

        int j = 0;
        Card[] deck = new Card[52];

        for (Suits suit : Suits.values()) {
            for(Values value: Values.values()) {
                deck[j] = new Card(suit, value);
                j++;
            }
        }
        return deck;
    }

    public static final Card[] shuffleCardDeck(Card[] deck) {
        return deck;
    }
    public static void main(String[] args) {
        createCardDeck();
    }
}
