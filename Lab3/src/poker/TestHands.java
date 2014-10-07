package poker;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import poker.Card;
import poker.Deck;
import poker.Hand;
import poker.eHandStrength;
import poker.eRank;
import poker.eSuit;

public class TestHands {

	@Test
	public final void FiveOfAKind() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.HEARTS,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		rfHand.add(new Card(eSuit.SPADES,eRank.FOUR));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.FOUR));

		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be 5K:",eHandStrength.FiveOfAKind.getHandStrength(),h.getHandStrength());		
	}


	
	@Test
	public final void FiveOfAKind2() {
		
		ArrayList<Card> fkHand = new ArrayList<Card>();
		fkHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		fkHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		fkHand.add(new Card(eSuit.DIAMONDS,eRank.FIVE));
		fkHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		fkHand.add(new Card(eSuit.HEARTS,eRank.FIVE));
		Hand h = Hand.EvalHand(fkHand);		
		
		assertEquals("Should be fk:",eHandStrength.FiveOfAKind.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void RoyalFlush() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void RoyalFlush2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.ACE));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.HEARTS,eRank.TEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.KING));
		rfHand.add(new Card(eSuit.HEARTS,eRank.JACK));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void StraightFlush() {
		
		ArrayList<Card> sfHand = new ArrayList<Card>();
		sfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		sfHand.add(new Card(eSuit.DIAMONDS,eRank.TEN));
		sfHand.add(new Card(eSuit.DIAMONDS,eRank.NINE));
		sfHand.add(new Card(eSuit.DIAMONDS,eRank.EIGHT));
		sfHand.add(new Card(eSuit.DIAMONDS,eRank.SEVEN));
		Hand h = Hand.EvalHand(sfHand);		
		
		assertEquals("Should be sf:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void FourOfAKind() {
		
		ArrayList<Card> fkHand = new ArrayList<Card>();
		fkHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		fkHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		fkHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		fkHand.add(new Card(eSuit.DIAMONDS,eRank.TEN));
		fkHand.add(new Card(eSuit.HEARTS,eRank.TEN));
		Hand h = Hand.EvalHand(fkHand);		
		
		assertEquals("Should be fk:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void Flush() {
		
		ArrayList<Card> fHand = new ArrayList<Card>();
		fHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		fHand.add(new Card(eSuit.CLUBS,eRank.THREE));
		fHand.add(new Card(eSuit.CLUBS,eRank.SEVEN));
		fHand.add(new Card(eSuit.CLUBS,eRank.EIGHT));
		fHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		Hand h = Hand.EvalHand(fHand);		
		
		assertEquals("Should be f:",eHandStrength.Flush.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void Straight() {
		
		ArrayList<Card> sHand = new ArrayList<Card>();
		sHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		sHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		sHand.add(new Card(eSuit.HEARTS,eRank.FIVE));
		sHand.add(new Card(eSuit.CLUBS,eRank.SIX));
		sHand.add(new Card(eSuit.DIAMONDS,eRank.SEVEN));
		Hand h = Hand.EvalHand(sHand);		
		
		assertEquals("Should be s:",eHandStrength.Straight.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void ThreeOfAKind() {
		
		ArrayList<Card> tkHand = new ArrayList<Card>();
		tkHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		tkHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		tkHand.add(new Card(eSuit.HEARTS,eRank.QUEEN));
		tkHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		tkHand.add(new Card(eSuit.DIAMONDS,eRank.SIX));
		Hand h = Hand.EvalHand(tkHand);		
		
		assertEquals("Should be tk:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void Pair() {
		
		ArrayList<Card> pHand = new ArrayList<Card>();
		pHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		pHand.add(new Card(eSuit.CLUBS,eRank.SEVEN));
		pHand.add(new Card(eSuit.HEARTS,eRank.EIGHT));
		pHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		pHand.add(new Card(eSuit.DIAMONDS,eRank.KING));
		Hand h = Hand.EvalHand(pHand);		
		
		assertEquals("Should be p:",eHandStrength.Pair.getHandStrength(),h.getHandStrength());		
	}
}
