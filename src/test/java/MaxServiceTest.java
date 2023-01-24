import org.junit.Assert;
import org.junit.jupiter.api.Test;

    public class MaxServiceTest {

        @Test

        public void shouldFindMax() {
            MaxService service = new MaxService();
            int a = 5;
            int b = 3;
            int expected = 5;
            int actual = service.max(a, b);

            Assert.assertEquals(expected, actual);
        }
    }