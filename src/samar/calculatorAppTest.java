package samar;
import static org.junit.Assert.*;
class calculatorAppTest {
    private calculatorApp calculatorApp;

    // @before
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calculatorApp = new calculatorApp();
    }

    //after
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        calculatorApp=null;
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(2, calculatorApp.add(1, 1));
        assertEquals(2, calculatorApp.add(3, -1));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        assertEquals(0, calculatorApp.subtract(1, 1));
        assertEquals(4, calculatorApp.subtract(3, -1));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(6, calculatorApp.multiply(2, 3));
        assertEquals(-3, calculatorApp.multiply(3, -1));
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(2, calculatorApp.divide(10, 5));
        assertEquals(-10, calculatorApp.divide(30, -3));
    }
    @org.junit.jupiter.api.Test
    public void divideException() {
        calculatorApp.divide(2, 0);
    }


}