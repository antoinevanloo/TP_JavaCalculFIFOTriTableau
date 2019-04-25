package testJava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class CalculsTest {

    @ParameterizedTest(name="Multiplication numéro {index} : nombre1={0} nombre2={1} resultat attendu={2}")


    @MethodSource("chargerJeuTest")

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void multiplier() {
        Calculs calculs = new Calculs(2,3);
        assertEquals(6,calculs.multiplier());

        calculs = new Calculs(8,3);
        assertEquals(24,calculs.multiplier());
    }

    @Test
   public void additionner() {
        Calculs calculs = new Calculs(2,3);
        assertEquals(5,calculs.additionner());

        calculs = new Calculs(8,3);
        assertEquals(11,calculs.additionner());
    }

    @Test
    public void diviser() {
        Calculs calculs = new Calculs(4,2);
        assertEquals(2,calculs.diviser());

//        calculs = new Calculs(10,0);
//        assertEquals(-1,calculs.diviser());
    }

    @Test
   public void soustraire() {
        Calculs calculs = new Calculs(2,3);
        assertEquals(-1,calculs.soustraire());

        calculs = new Calculs(8,3);
        assertEquals(5,calculs.soustraire());
    }

    @Test
    public void testExceptionDiviser() {
        Calculs calculs = new Calculs(8,0);
        assertThrows(ArithmeticException.class,()->{calculs.diviser();});
    }

    @Test
   public static Stream<Arguments> chargerJeuTest() throws Throwable{
        return Stream.of(
                Arguments.of(2,2,4),
                Arguments.of(3,3,9),
                Arguments.of(3,4,10));
    }
}