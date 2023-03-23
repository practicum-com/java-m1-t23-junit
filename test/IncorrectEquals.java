import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncorrectEquals {

    @Test
    public void should_return_equals() {
        Item item1 = new Item("apples", 50);
        Item item2 = new Item("apples", 50);

        assertEquals(item2, item1);
    }
}
