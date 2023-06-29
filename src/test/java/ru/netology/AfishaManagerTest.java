package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    @Test
    void findAll() {
        AfishaManager afishaManager = new AfishaManager(2);

        for (int i = 0; i < 10; i++) {
            afishaManager.add(new Afisha(i, "Test " + i, 2022 - i));
        }

        Afisha[] actual = afishaManager.findAll();

        assertEquals(10, actual.length);
    }



    @Test
    void findLast() {
        AfishaManager afishaManager = new AfishaManager(2);

        for (int i = 0; i < 10; i++) {
            afishaManager.add(new Afisha(i, "Test " + i, 2022 - i));
        }

        Afisha[] actual = afishaManager.findLast();

        assertEquals(2, actual.length);
    }

    @Test
    void findLast2() {
        AfishaManager afishaManager = new AfishaManager(11);

        for (int i = 0; i < 10; i++) {
            afishaManager.add(new Afisha(i, "Test " + i, 2022 - i));
        }

        Afisha[] actual = afishaManager.findLast();

        assertEquals(10, actual.length);
    }
}