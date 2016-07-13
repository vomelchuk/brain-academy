package com.brainacad.oop.testenum2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		final int RANK_SIZE = Rank.values().length;
		final int SUIT_SIZE = Suit.values().length;
		final int CARDS_SIZE = RANK_SIZE * SUIT_SIZE;

		Card[] cards = new Card[CARDS_SIZE];

		for (int rank = 0; rank < RANK_SIZE; rank++) {
			for (int suit = 0; suit < SUIT_SIZE; suit++) {
				cards[suit + rank * SUIT_SIZE] = new Card(Suit.values()[suit],
						Rank.values()[rank]);
			}
		}

		Arrays.sort(cards, new Comparator<Card>() {
			public int compare(Card c1, Card c2) {
				return c2.getCardRank().compareTo(c1.getCardRank())
				/* c1.getCardSuit().compareTo(c2.getCardSuit()) */;
			}
		});

		int group = 0;
		for (Card card : cards) {
			if (group == SUIT_SIZE) {
				System.out.println();
				group = 0;
			}
			System.out.println(card);
			group++;
		}

	}

}
