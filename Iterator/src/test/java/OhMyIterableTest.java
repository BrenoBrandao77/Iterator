import org.junit.Test;

import static org.junit.Assert.*;

public class OhMyIterableTest {

    @Test
    public void shouldBeIterable() {
        Iterable<String> underTest = new OhMyIterable();

        assertThat(underTest, contains("leao", "tigre", "urso"));
    }

    private Object contains(String lions, String tigers, String bears) {
    }
}