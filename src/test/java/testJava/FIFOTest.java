package testJava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class FIFOTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        FIFO unFifo = new FIFO();
        int tailleQue = unFifo.size();
        unFifo.add(1);
        assertEquals(tailleQue,tailleQue++);

        FIFO unFifoBis = new FIFO();
        unFifoBis.add(12);
        assertEquals(unFifoBis.first(),Integer.valueOf(12));
    }

    @Test
    void first() {
        FIFO unFifo = new FIFO();
        assertThrows(NoSuchElementException.class, ()-> unFifo.first() );

        unFifo.add(55);
        assertEquals(unFifo.first(), Integer.valueOf(55));
    }

    @Test
    void isEmpty() {
        FIFO unFifo = new FIFO();
        assertEquals(unFifo.isEmpty(), true);
    }

    @Test
    void removeFirst() {
        FIFO unFifo = new FIFO();
        assertThrows(NoSuchElementException.class, ()-> unFifo.removeFirst());

        FIFO unFifoBis = new FIFO();
        unFifoBis.add(5);
        unFifoBis.add(7);
        unFifoBis.removeFirst();
        assertEquals(unFifoBis.first(),Integer.valueOf(7));
    }

    @Test
    void size() {
        FIFO unFifo = new FIFO();
        int taille = 1;
        unFifo.add(55);
        assertEquals(unFifo.size(), taille);

        FIFO unFifoBis = new FIFO();
        int tailleBis = 0;
        assertEquals(unFifoBis.size(), tailleBis);

    }
}