import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;
    Card card2;

    @Before
    public void before() {
        ArrayList<Card> cards = new ArrayList<>();
        deck = new Deck(cards);
        card = new Card(Suit.CLUBS, Rank.ACE);
        card2 = new Card(Suit.CLUBS, Rank.ACE);
        cards.add(card);
        cards.add(card2);
    }

    @Test
    public void deckHasCard() {
        assertEquals(2, deck.countCards());
    }

    @Test
    public void canRemoveAllCards() {
        System.out.println(deck.removeAllCards());
        assertEquals(0, deck.countCards());
    }
}
