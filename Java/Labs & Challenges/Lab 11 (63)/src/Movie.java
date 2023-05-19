// Student ID:
// Name:
// Section:

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;


public class Movie {
	// ---- DO NOT MODIFY THIS -------
	public static final DecimalFormat df = new DecimalFormat("0.00");
	
	public int mid = -1;
	public String title = null;
	public Set<String> tags = null;
	// -------------------------------
	
	// You can add your own instance fields here
	
	public Movie(int _mid, String _title){
		mid = _mid;
		title = _title;
		tags = new HashSet<String>();
		
		// YOUR CODE GOES HERE (if any)
		
	}
	
	
	/**
	 * Calculate and return the average rating of the movies
	 * @return the average rating
	 * @throws MovieException with message "no_rating" if there is no rating for this movie yet
	 */
	public double getAverageRating() throws MovieException {
		// YOUR CODE GOES HERE
		return 0.0;
	}
	
	
	/**
	 * DO NOT MODIFY THIS METHOD
	 */
	public String toString(){
		try {
			return "[mid:" + mid + "->" + title + " " + tags
				+ " (rating:" + df.format(this.getAverageRating()) + "/5)]";
		} catch (MovieException e) {
			return "[mid:" + mid + "->" + title + " " + tags
					+ " (rating:" + e.getMessage() + ")]";
		}
	}
	
}
