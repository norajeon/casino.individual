package com.github.zipcodewilmington;


import com.github.zipcodewilmington.Player.Player;
import com.github.zipcodewilmington.dealer.Dealer;
import com.github.zipcodewilmington.deck.Card;
import com.github.zipcodewilmington.deck.Rank;
import com.github.zipcodewilmington.deck.Suit;
import org.junit.Test;
import org.junit.Assert;

public class DealerTest {

    @Test
    public void testDealerConstructor() {
        Dealer dealer = new Dealer();

        // Test dealer's deck has the correct number of cards
        int expected = Suit.values().length * Rank.values().length;
        Assert.assertEquals(expected, dealer.getDeck().size());

        // Test dealer's deck contains one of each card
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(rank, suit);
                Assert.assertTrue(dealer.getDeck().contains(card));
            }
        }

        // Test that the dealer's hand is initially empty
        Assert.assertTrue(dealer.getHand().isEmpty());
    }
}

//    @Test
//    public void testCompareHands(){
//
//            Dealer dealer = new Dealer();
//            Player player = Player();
//
//            dealer.getHand().add(new Card(Suit.CLUBS, Rank.ACE));
//            dealer.getHand().add(new Card(Suit.HEARTS, Rank.KING));
//            player.addCard(new Card(Suit.DIAMONDS, Rank.TEN));
//            player.addCard(new Card(Suit.SPADES, Rank.JACK));
//
//            dealer.compareHands(player);
//
//            assertEquals(10, player.getMoney());
//
//            player.clearHand();
//            dealer.clearHand();
//
//            dealer.getHand().add(new Card(Suit.CLUBS, Rank.ACE));
//            dealer.getHand().add(new Card(Suit.HEARTS, Rank.KING));
//            player.addCard(new Card(Suit.DIAMONDS, Rank.TEN));
//            player.addCard(new Card(Suit.SPADES, Rank.NINE));
//
//            dealer.compareHands(player);
//
//            assertEquals(0, player.getMoney());
//
//            player.clearHand();
//            dealer.clearHand();
//            dealer.getHand().add(new Card(Suit.CLUBS, Rank.ACE));
//            dealer.getHand().add(new Card(Suit.HEARTS, Rank.QUEEN));
//            player.addCard
//    }

