import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyFirstTestClass {

    @Test
    public void testConcat_validArgument_success() {
        // given:
        String str1 = "Hellogitr, ";
        String str2 = "world!";

        // when:
        String result = str1.concat(str2);

        // then:
        Assertions.assertEquals("Hello, world!", result);
    }


}

