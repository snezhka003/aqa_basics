package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {
// тесты JUnit4
    @Test
    public void shouldBeRemainIs10() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(990);
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeRemainIs0() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeRemainIs900() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1100);
        int expected = 900;

        assertEquals(expected, actual);
    }
// тесты JUnit Jupiter
@Test
public void shouldBeRemainIs10JUnitJupiter() {
    CashbackHackService service = new CashbackHackService();

    int actual = service.remain(990);
    int expected = 10;

    Assertions.assertEquals(expected, actual);
}

    @Test
    public void shouldBeRemainIs0JUnitJupiter() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeRemainIs900JUnitJupiter() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1100);
        int expected = 900;

        Assertions.assertEquals(expected, actual);
    }
}