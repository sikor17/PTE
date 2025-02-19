package pl.edu.pw.ii.pte.junit.money;

class Money {
	private int fAmount;
	private String fCurrency;

	public Money(int amount, String currency) {
		fAmount = amount;
		fCurrency = currency;
	}

	public int amount() {
		return fAmount;
	}

	public String currency() {
		return fCurrency;
	}

	public Money add(Money m) {
		return new Money(amount() + m.amount(), currency());
	}

	public boolean equals(Object anObject) {
		if (anObject instanceof Money) {
			Money a = (Money) anObject;

			return a.currency().equals(currency()) && amount() == a.amount();
		}
		return false;

	}

	public Money multiply(int x) {
		return new Money(amount() * x, currency());
	}

	public Money addDiffrentCurrency(Money m) {

		Money result = new Money(0, "PLZ");
		
		// 1 PLZ = 1/2 USD = 1/3 CHK = 1/4 EUR = 1/5 GBP
		// 1 USD = 2 PLZ = 2/3 CHK = 1/2 EUR = 2/5 GBP 
		// 1 CHK = 3 PLZ = 3/2 USD = 3/4 EUR = 3/5 GBP
		// 1 EUR = 4 PLZ = 2 USD = 4/3 CHK = 4/5 GBP 
		// 1 GBP = 5 PLZ = 5/2 USD = 5/3 CHK = 5/4 EUR
		
		
		if (fCurrency.equals(m.fCurrency)) {
			result = new Money(amount() + m.amount(), currency());
		}
		
		switch (fCurrency) {
		case "PLZ":
			switch (m.fCurrency) {
			case "USD":
				result = new Money(amount() + (2 * m.amount()), currency());
				break;
			case "CHK":
				result = new Money(amount() + (3 * m.amount()), currency());
				break;
			case "GBP":
				result = new Money(amount() + (5 * m.amount()), currency());
				break;
			case "EUR":
				result = new Money(amount() + (4 * m.amount()), currency());
				break;
			}
			break;
		case "EUR":
			switch (m.fCurrency) {
			case "PLZ":
				result = new Money(amount() + (m.amount() / 4), currency());
				break;
			case "CHK":
				result = new Money(amount() + (3 * m.amount() / 4), currency());
				break;
			case "GBP":
				result = new Money(amount() + (5 * m.amount() / 4), currency());
				break;
			case "USD":
				result = new Money(amount() + (m.amount() / 2), currency());
				break;
			}
			break;
		case "USD":
			switch (m.fCurrency) {
			case "PLZ":
				result = new Money(amount() + (m.amount() / 2), currency());
				break;
			case "CHK":
				result = new Money(amount() + (3 * m.amount() / 2), currency());
				break;
			case "GBP":
				result = new Money(amount() + (5 * m.amount() / 2), currency());
				break;
			case "EUR":
				result = new Money(amount() + (2 * m.amount()), currency());
				break;
			}
			break;
		case "CHK":
			switch (m.fCurrency) {
			case "PLZ":
				result = new Money(amount() + (m.amount() / 3), currency());
				break;
			case "USD":
				result = new Money(amount() + (2 * m.amount() / 3), currency());
				break;
			case "GBP":
				result = new Money(amount() + (5 * m.amount() / 3), currency());
				break;
			case "EUR":
				result = new Money(amount() + (4 * m.amount() / 3), currency());
				break;
			}
			break;
		case "GBP":
			switch (m.fCurrency) {
			case "PLZ":
				result = new Money(amount() + (m.amount() / 5), currency());
				break;
			case "CHK":
				result = new Money(amount() + (3 * m.amount() / 5), currency());
				break;
			case "USD":
				result = new Money(amount() + (2 * m.amount() / 5), currency());
				break;
			case "EUR":
				result = new Money(amount() + (4 * m.amount() / 5), currency());
				break;
			}
			break;
		}

		return result;
	}

}