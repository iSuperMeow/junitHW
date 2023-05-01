import org.example.Calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class CalcTest {
    Calc calc = new Calc();

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Этот метод выполняется перед классом");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Этот метод выполняется перед каждым тестом");
    }

    @Test
    public void checkSum() {
        Assertions.assertEquals(calc.sum(1, 2), 3, "Ошибка в решение");
    }

    @Test
    public void checkDiv() {
        Assertions.assertEquals(calc.div(4, 2), 2, "Ошибка в решение");
    }

    @Test
    public void checkDivZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> calc.div(4, 0)
            ,"Неправильная обработка исключения");
    }

    @Test
    public void checkErrorDiv() {
        Assertions.assertEquals(calc.div(4, 2), 6, "Ошибка в решение");
    }
}
