import org.junit.jupiter.api.*;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class Triangle_test {
    static final Logger log = LoggerFactory.getLogger(Triangle_test.class);

    @BeforeAll
    static void setUp() {
        System.out.println("TEST BEGIN!");
    }

    @DisplayName("Проверка функции расчета по формуле")
    @Test
    void Assert1() {


       S_triangle triangle = new S_triangle();

        Assertions.assertEquals(triangle.Triangle_Square(3,4,5),6);


    }

}
