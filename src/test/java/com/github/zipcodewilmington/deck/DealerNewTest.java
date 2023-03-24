package com.github.zipcodewilmington;


import com.github.zipcodewilmington.Player.Player;
import com.github.zipcodewilmington.dealer.Dealer;
import com.github.zipcodewilmington.deck.Card;
import com.github.zipcodewilmington.deck.Rank;
import com.github.zipcodewilmington.deck.Suit;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class DealerNewTest {
    public static class NotAbstractPlayer extends Player {
        public NotAbstractPlayer() {
            super();
        }
    }

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

    @Test
    public void TestGetDeck() {
        Dealer dealer = new Dealer();

        // Test that the returned deck matches the expected deck
        List<Card> expectedDeck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                expectedDeck.add(new Card(rank, suit));
            }
        }
        List<Card> actualDeck = dealer.getDeck();
        Assert.assertEquals(expectedDeck, actualDeck);

        // Test that the returned deck is a new instance
        List<Card> newDeck = dealer.getDeck();
        Assert.assertNotSame(actualDeck, newDeck);
    }


    @Test
    public void testGetDealerHand() {
        Dealer dealer = new Dealer();
        List<Card> hand = dealer.getHand();

        // Test that the hand is initially empty
        Assert.assertTrue(hand.isEmpty());

        // Test adding cards to the hand
        Card card1 = new Card(Rank.ACE, Suit.SPADES);
        Card card2 = new Card(Rank.KING, Suit.DIAMONDS);
        hand.add(card1);
        hand.add(card2);
        Assert.assertEquals(2, hand.size());

        // Test that getHand() returns the correct cards
        List<Card> expectedHand = new ArrayList<>();
        expectedHand.add(card1);
        expectedHand.add(card2);
        Assert.assertEquals(expectedHand, hand);

        // Display player's current cards
        System.out.println(hand.toString());
    }

    @Test
    public void testShuffle() {
        Dealer dealer = new Dealer();
        List<Card> originalDeck = new ArrayList<>(dealer.getDeck());

        // Test that the shuffled deck is not the same as the original deck
        dealer.shuffle();
        List<Card> shuffledDeck = dealer.getDeck();
        Assert.assertNotEquals(originalDeck, shuffledDeck);

    }

    @Test
    public void testDeal() {
        Dealer dealer = new Dealer();
        NotAbstractPlayer player1 = new NotAbstractPlayer();
        NotAbstractPlayer player2 = new NotAbstractPlayer();
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        List<Card> cards = dealer.deal(players);
        Assert.assertEquals(4, cards.size());
        Assert.assertEquals(2, player1.getPlayerHand().size());
        Assert.assertEquals(2, player2.getPlayerHand().size());
        Assert.assertEquals(48, dealer.getDeck().size());
    }

    @Test
    public void testAddCard() {
    }

    @Test
    public void testCompareHand() {
    }

    @Test
    public void payout() {
    }

    @Test
    public void compareHands() {
    }


//    @Test
//    public void testCompareHands() {
//
//        Dealer dealer = new Dealer();
//        Player player = Player();
//
//        dealer.getHand().add(new Card(Suit.CLUBS, Rank.ACE));
//        dealer.getHand().add(new Card(Suit.HEARTS, Rank.KING));
//        player.addCard(new Card(Suit.DIAMONDS, Rank.TEN));
//        player.addCard(new Card(Suit.SPADES, Rank.JACK));
//
//        dealer.compareHands(player);
//
//        assertEquals(10, player.getMoney());
//
//        player.clearHand();
//        dealer.clearHand();
//
//        dealer.getHand().add(new Card(Suit.CLUBS, Rank.ACE));
//        dealer.getHand().add(new Card(Suit.HEARTS, Rank.KING));
//        player.addCard(new Card(Suit.DIAMONDS, Rank.TEN));
//        player.addCard(new Card(Suit.SPADES, Rank.NINE));
//
//        dealer.compareHands(player);
//
//        assertEquals(0, player.getMoney());
//
//        player.clearHand();
//        dealer.clearHand();
//        dealer.getHand().add(new Card(Suit.CLUBS, Rank.ACE));
//        dealer.getHand().add(new Card(Suit.HEARTS, Rank.QUEEN));
//        player.addCard
//    }
}

