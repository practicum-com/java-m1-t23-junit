package cookie;

import java.util.List;
import java.util.Random;

public class OvercomplicatedCookieFactory {
    private int cookiesCreated = 0;
    private final List<String> positiveTexts;
    private final List<String> negativeTexts;
    private final boolean isPositive;

    /** The Random class returns “pseudo-random” numbers. Here it returns a random prediction
     * from a list, not a specific one. */
    private final Random rnd = new Random();

    public OvercomplicatedCookieFactory(
        List<String> positiveTexts,
        List<String> negativeTexts,
        boolean isPositive
    ) {
        this.positiveTexts = positiveTexts;
        this.negativeTexts = negativeTexts;
        this.isPositive = isPositive;
    }

    /** Baking a cookie! */
    public String bakeFortuneCookie() {
        StringBuilder cookieBuilder = new StringBuilder();

        // Increasing the cookie counter:
        this.incrementNumberOfCookiesCreated();

        // Returning a good or bad prediction:
        if (isPositive) {
            cookieBuilder.append(randomPositive());
        } else {
            cookieBuilder.append(randomNegative());
        }

        // Converting the result into a string:
        return cookieBuilder.toString();
    }

    /** Returning the number of baked cookies: */
    public int getCookiesCreated() {
        return this.cookiesCreated;
    }

    /** Resetting the counter of created cookies: */
    public void resetCookiesCreated() {
        this.cookiesCreated = 0;
    }


    /** Increases the counter of baked cookies */
    private void incrementNumberOfCookiesCreated() {
        this.cookiesCreated++;
    }

    /** Choosing a random prediction from the list of positive predictions: */
    private String randomPositive() {
        // Getting a random integer from zero to the maximum size of the array (1).
        int randomIndex = rnd.nextInt(positiveTexts.size());
        return positiveTexts.get(randomIndex);
    }

    /** Choosing a random prediction from the list of negative predictions */
    private String randomNegative() {
        // Getting a random integer from zero to the maximum size of the array (1).
        int randomIndex = rnd.nextInt(negativeTexts.size());
        return negativeTexts.get(randomIndex);
    }
}

