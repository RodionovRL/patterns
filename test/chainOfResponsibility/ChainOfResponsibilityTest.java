package chainOfResponsibility;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChainOfResponsibilityTest {
    Payment alfa = new Alfa (100);
    Payment sber = new Sber (200);
    Payment tink = new Tink (300);
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void payTest() {
        Chain chain = new Chain();
        chain.setChain(alfa, sber, tink);

        alfa.pay(250);

        assertAll(
                () -> assertEquals(
                        """
                                Нельзя заплатить, используя class chainOfResponsibility.Alfa. Обработка ..
                                Нельзя заплатить, используя class chainOfResponsibility.Sber. Обработка ..
                                Оплата 250, используя class chainOfResponsibility.Tink""",
                        outputStreamCaptor.toString().trim())
        );
    }
}
