import java.util.ArrayList;
import java.util.List;

public class Rental {

    Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }
    
    public double getCharge() {
		return movie.getCharge(daysRented);
	}
    
    public int getFrequentRenterPoints() {
		int frequentRenterPoints = 0;
		// add frequent renter points
		frequentRenterPoints++;
		// add bonus for a two day new release rental
		if (getMovie().getPriceCode() == Movie.NEW_RELEASE && getDaysRented() > 1)
				frequentRenterPoints++;
		return frequentRenterPoints;
	}

}