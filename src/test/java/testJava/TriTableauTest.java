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
        int monTableau[] = {5,4,3,2,1};
        int monTableauAttendu[] = {1,2,3,4,5};
        TriTableau.triCroissant(monTableau);
        assertEquals(monTableau[0],monTableauAttendu[0]);

        //testBis
        for (int i = 0; i < monTableau.length - 1; i++) {
            assertTrue(monTableau[i] <= monTableauAttendu [i+1]);
        }

    }

    @Test
    void triDecroissant() {
        int monTableau[] = {1,2,3,4,5};
        int monTableauAttendu[] = {5,4,3,2,1};
        TriTableau.triDecroissant(monTableau);
        assertEquals(monTableau[0],monTableauAttendu[0]);

        //testBis
        for (int i = 0; i < monTableau.length - 1; i++) {
            if( i != monTableau.length) {
                assertTrue(monTableau[i] >= monTableauAttendu[i + 1]);
            }
        }

    }
}