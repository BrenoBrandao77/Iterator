import java.util.Iterator;

import static org.junit.Assert.*;

public class OhMyIteratorTest {

    @Test
    public void shouldReturnFirstElement() {
        Iterator<String> underTest = new OhMyIterator();

        String first = underTest.next();

        assertThat(first, is("lions"));
    }

    private Object is(String lions) {
    }

    @Test
    public void shouldReturnSecondElement()  {
        Iterator<String> underTest = new OhMyIterator();

        underTest.next();
        String second = underTest.next();

        assertThat(second, is("tigers"));
    }

    @Test
    public void shouldReturnThirdElement()  {
        Iterator<String> underTest = new OhMyIterator();

        underTest.next();
        underTest.next();
        String second = underTest.next();

        assertThat(second, is("bears"));
    }

    @Test
    public void shouldHaveNextElement() {
        Iterator<String> underTest = new OhMyIterator();

        boolean hasNext = underTest.hasNext();

        assertThat(hasNext, is(true));
    }

    @Test
    public void shouldNotHaveNextElement() {
        Iterator<String> underTest = new OhMyIterator();

        underTest.next();
        underTest.next();
        underTest.next();
        boolean hasNext = underTest.hasNext();

        assertThat(hasNext, is(false));
    }

    @Test(expected=NoSuchElementException.class)
    public void shouldThrowExceptionIfNextIsNotAvailable() {
        Iterator<String> underTest = new OhMyIterator();

        underTest.next();
        underTest.next();
        underTest.next();
        underTest.next();
    }
}