import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/numbers.csv")
    public void rangeTest(int first, int second, int expected) {
        SQRService service = new SQRService();

        int actual = service.sqrRangeFrom10To99(first, second);
        Assertions.assertEquals(expected, actual);

    }
}
