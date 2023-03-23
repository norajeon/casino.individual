package com.github.zipcodewilmington;


import com.github.zipcodewilmington.dealer.Dealer;
import org.junit.Test;
import org.junit.Assert;

public class DealerTest {

    @Test
    public void dealerTestConstructor(){
        Dealer dealer = new Dealer();
        Assert.assertEquals(52, dealer.getDeck().size());
        Assert.assertFalse(dealer.getDeck().isEmpty());
    }

    @Test
    public void testCompareHands(){

            Dealer dealer = new Dealer();
            Player player = new Player();

            dealer.getHand().add(new Card(Suit.CLUBS, Rank.ACE));
            dealer.getHand().add(new Card(Suit.HEARTS, Rank.KING));
            player.addCard(new Card(Suit.DIAMONDS, Rank.TEN));
            player.addCard(new Card(Suit.SPADES, Rank.JACK));

            dealer.compareHands(player);

            assertEquals(10, player.getMoney());

            player.clearHand();
            dealer.clearHand();

            dealer.getHand().add(new Card(Suit.CLUBS, Rank.ACE));
            dealer.getHand().add(new Card(Suit.HEARTS, Rank.KING));
            player.addCard(new Card(Suit.DIAMONDS, Rank.TEN));
            player.addCard(new Card(Suit.SPADES, Rank.NINE));

            dealer.compareHands(player);

            assertEquals(0, player.getMoney());

            player.clearHand();
            dealer.clearHand();
            dealer.getHand().add(new Card(Suit.CLUBS, Rank.ACE));
            dealer.getHand().add(new Card(Suit.HEARTS, Rank.QUEEN));
            player.addCard
    }

}
