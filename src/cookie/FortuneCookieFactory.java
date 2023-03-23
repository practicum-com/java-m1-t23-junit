package cookie;

import java.util.List;
import java.util.Random;

public class FortuneCookieFactory {

        private final FortuneConfig fortuneConfig;
        private int cookiesBaked = 0;

        private final Random rnd = new Random();
        private final List<String> goodFortune;
        private final List<String> badFortune;

        public FortuneCookieFactory(FortuneConfig fortuneConfig, List<String> goodFortune, List<String> badFortune) {
                this.fortuneConfig = fortuneConfig;
                this.goodFortune = goodFortune;
                this.badFortune = badFortune;
        }

        /**
         * Returning the number of baked cookies:
         */
        public int getCookiesBaked() {
                return this.cookiesBaked;
        }

        /**
         * Resetting the counter of created cookies:
         */
        public void resetCookiesCreated() {
                this.cookiesBaked = 0;
        }

        /**
         * Baking a cookie!
         */
        public FortuneCookie bakeFortuneCookie() {
                final String fortune;

                // Returning a good or bad prediction:
                if (this.fortuneConfig.isPositive()) {
                        fortune = goodFortune.get(rnd.nextInt(goodFortune.size()));
                } else {
                        fortune = badFortune.get(rnd.nextInt(badFortune.size()));
                }
                incrementNumberOfCookiesCreated();
                return new FortuneCookie(fortune);
        }

        /**
         * Increasing the counter of baked cookies:
         */
        private void incrementNumberOfCookiesCreated() {
                this.cookiesBaked++;
        }
}
