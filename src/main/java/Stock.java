public class Stock {

	/**
	 * Design a class named Stock. The Stock class should contain the following
	 *  - A string data field named symbol for the stock's symbol
	 *  - A string data field named name for the stock's name
	 *  - A double data field named previousClosingPrice that stores the stocks price for the previous day
	 *  - A double data field named currentPrice that stores the stock price for the current time
	 *  - A constructor that creates a stock with specified symbol and name
	 *  - Getters for each of the data fields
	 *  - Setter method for previousClosingPrice and currentPrice
	 *  - A method named getChangePercent() that returns the percentage changed from previousClosingPrice to CurrentPrice
	 *    precentChange = ((currentPrice - closingPrice) / currentPrice) * 100
	 */

	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;

	public Stock(String symbol, String name){
		this.symbol = symbol;
		this.name = name;
		this.previousClosingPrice = previousClosingPrice;
		this.currentPrice = currentPrice;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public double getChangePercent(){
		double percentChange = ((currentPrice - previousClosingPrice) / currentPrice) * 100;
		return percentChange;
	}
}
