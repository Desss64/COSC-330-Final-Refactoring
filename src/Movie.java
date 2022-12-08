public class Movie {

    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;
    
    Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
    
    
    
    public double getCharge(int daysRented) {
    	return price.getCharge(daysRented);
    }
    public int getFrequentRenterPoints(int daysRented) {
        if (priceCode == Movie.NEW_RELEASE && daysRented > 1)
            return 2;
        return 1;
    }

}