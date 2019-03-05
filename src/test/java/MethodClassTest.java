import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MethodClassTest {

    @Test
    public void shouldReturnSumOfSquares() {
//        Given
        int limit = 4;
//        When
        int result = MethodClass.sumOfSquares(limit);
//        Then
        assertThat(result, is(30));
    }

    @Test
    public void shouldReturnSquareOfSum() {
//        Given
        int limit = 4;
//        When
        int result = MethodClass.squareOfSum(limit);
//        Then
        assertThat(result, is(100));
    }

    @Test
    public void shouldReturnDifferent() {
//        Given
        int limit = 4;
//        When
        int result = MethodClass.different(limit);
//        Then
        assertThat(result, is(-70));
    }
}