import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Adrian Lapierre {@literal al@alapierre.io}
 * Copyrights by original author 2021.12.16
 */
class AppenderTest {

    @Test
    void testIfWorks() {

        var appender = new Appender();

        var th = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            appender.append(null, null);
        });

        System.out.println("thrown: " + th);

    }

}
