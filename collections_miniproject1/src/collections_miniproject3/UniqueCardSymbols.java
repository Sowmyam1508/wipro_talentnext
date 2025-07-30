package collections_miniproject3;

import java.util.*;

class Card {
	private String symbol;
	private int number;

	public Card(String symbol, int number) {
		this.symbol = symbol;
		this.number = number;
	}

	public String getSymbol() {
		return symbol;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Card))
			return false;
		Card card = (Card) obj;
		return this.symbol.equals(card.symbol);
	}

	@Override
	public int hashCode() {
		return symbol.hashCode();
	}
}

public class UniqueCardSymbols {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Card> cardSet = new LinkedHashSet<>();
		Set<String> collectedSymbols = new HashSet<>();

		int totalCardsEntered = 0;

		while (collectedSymbols.size() < 4) {
			System.out.print("Enter a card: ");
			String input = scanner.nextLine().trim();

			if (input.length() < 2) {
				System.out.println("Invalid input. Try again.");
				continue;
			}

			String symbol = input.substring(0, 1);
			String numPart = input.substring(1);

			try {
				int number = Integer.parseInt(numPart);

				Card card = new Card(symbol, number);
				if (!collectedSymbols.contains(symbol)) {
					cardSet.add(card);
					collectedSymbols.add(symbol);
				}

				totalCardsEntered++;

			} catch (NumberFormatException e) {
				System.out.println("Invalid number format. Try again.");
			}
		}

		System.out.println("Four symbols gathered in " + totalCardsEntered + " cards.");
		System.out.println("Cards in Set are :");
		List<Card> sortedCards = new ArrayList<>(cardSet);
		sortedCards.sort(Comparator.comparing(Card::getSymbol));

		for (Card card : sortedCards) {
			System.out.println(card.getSymbol() + " " + card.getNumber());
		}

		scanner.close();
	}
}