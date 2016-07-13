package com.brainacad.oop.testenum2;

public class Card {
	// fields
	Suit cardSuit;
	Rank cardRank;

	// constructors
	public Card(Suit cardSuit, Rank cardRank) {
		this.cardSuit = cardSuit;
		this.cardRank = cardRank;
	}

	// methods
	@Override
	public String toString() {
		return "The card: " + cardRank.name() + "_" + cardSuit.name();
	}

	// accessors

	public Suit getCardSuit() {
		return cardSuit;
	}

	public Rank getCardRank() {
		return cardRank;
	}

}
