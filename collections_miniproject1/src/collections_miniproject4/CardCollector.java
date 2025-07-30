package collections_miniproject4;

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

	public void display() {
		System.out.println(symbol + " " + number);
	}
}

public class CardCollector {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, List<Card>> cardMap = new HashMap<>();

		System.out.print("Enter Number of Cards: ");
		int n = Integer.parseInt(scanner.nextLine());

		for (int i = 1; i <= n; i++) {
			System.out.print("Enter card " + i + ": ");
			String input = scanner.nextLine().trim();

			if (input.length() < 2) {
				System.out.println("Invalid input. Skipping.");
				continue;
			}

			String symbol = input.substring(0, 1);
			String numberPart = input.substring(1);

			try {
				int number = Integer.parseInt(numberPart);
				Card card = new Card(symbol, number);

				cardMap.putIfAbsent(symbol, new ArrayList<>());
				cardMap.get(symbol).add(card);

			} catch (NumberFormatException e) {
				System.out.println("Invalid number. Skipping.");
			}
		}
		List<String> symbols = new ArrayList<>(cardMap.keySet());
		Collections.sort(symbols);

		System.out.print("Distinct Symbols are : ");
		for (String sym : symbols) {
			System.out.print(sym + " ");
		}
		System.out.println();
		for (String sym : symbols) {
			List<Card> cards = cardMap.get(sym);
			System.out.println("Cards in " + sym + " Symbol");

			int sum = 0;
			for (Card card : cards) {
				card.display();
				sum += card.getNumber();
			}

			System.out.println("Number of cards : " + cards.size());
			System.out.println("Sum of Numbers : " + sum);
		}

		scanner.close();
	}
}