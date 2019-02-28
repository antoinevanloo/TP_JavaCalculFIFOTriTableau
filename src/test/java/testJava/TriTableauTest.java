package testJava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriTableauTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void trier() {
    }

    @Test
    void triCroissant() {
        int monTab[] = {3,2,1};
        int expected[] = {1,2,3};
        TriTableau.triCroissant(monTab);
        assertEquals(expected[0],monTab[0]);
    }

    @Test
    void triDecroissant() {
        int monTab[] = {1,2,3};
        int expected[] = {3,2,1};
        TriTableau.triDecroissant(monTab);
        assertEquals(expected[0],monTab[0]);
    }
}